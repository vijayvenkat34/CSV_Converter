
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Tester2 {

	public static void main(String[] args) throws IOException {
		
		JSONParser parser = new JSONParser();
		int flag=0;
		ArrayList<String> subDistricts = null;
		
		//output csv file 
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(Constants.SAMPLE_CSV_FILE));
        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                        .withHeader("State", "District", "SubDistrict", "Parameters","jan","feb","mar",
                        		"apr","may","jun","jul","aug","sep","oct","nov","dec"));
        
        //reading proccess starts
		try {
			//read whole object
			Object obj = parser.parse(new FileReader("content.json"));
			JSONObject jsonObject = (JSONObject) obj;
			
			//read array
			JSONArray states = (JSONArray)jsonObject.get("states");
			
			//read object, example {"name":"Maharashtra","districts":["Pune","AKola"]}
			for(Object state : states){
				Object obj2 = parser.parse(state.toString());
				JSONObject jsonObject2 = (JSONObject) obj2;
				
				String stateName = (String) jsonObject2.get("name");
				
				//read districts, eg District:[Pune,Akola]
				JSONArray districts = (JSONArray)jsonObject2.get("districts");
				
				//iterate through districts
				for(Object district : districts){
					
					String districtName = district.toString();
					
					//open 12 files present in the directory
					Reader readerJan = Files.newBufferedReader(Paths.get(Constants.DIRECTORY+"/"+stateName+"/"+districtName+"/hmis-item-14-15-mn-sd-mah-"+district+"-jan.csv"));
					Reader readerFeb = Files.newBufferedReader(Paths.get("D:/Project/Hospital Datasets/State wise health data/2014/"+stateName+"/"+districtName+"/hmis-item-14-15-mn-sd-mah-"+district+"-feb.csv"));
					//Reader reader = Files.newBufferedReader(Paths.get("D:/Project/Hospital Datasets/State wise health data/2014/"+stateName+"/"+districtName+"/hmis-item-14-15-mn-sd-mah-"+district+"-mar.csv"));
					
					
					CSVParser csvParserJan = new CSVParser(readerJan, CSVFormat.DEFAULT);
					CSVParser csvParserFeb = new CSVParser(readerFeb, CSVFormat.DEFAULT);
					//read all 12 records
					List<CSVRecord> csvRecordsJan = csvParserJan.getRecords();
					List<CSVRecord> csvRecordsFeb = csvParserFeb.getRecords();
					
					//get header of file
					CSVRecord headerRow = csvRecordsJan.get(0);
					subDistricts = new ArrayList<String>();
					
					//store subDistricts in array {Pune,Ambegaon,Pundarpur}
					for(int i=4;i<19;i++){
						//Convert and store -- SubDistricts-Pune => Pune
						subDistricts.add(headerRow.get(i).toString().substring(12));
					}
					for(String subDistrict : subDistricts){
						
				        for (int i=147;i<155;i++) {
				        	CSVRecord rowJan = csvRecordsJan.get(i);
				        	CSVRecord rowFeb = csvRecordsFeb.get(i);

				            String parameter = rowJan.get(2);
				            String jan = rowJan.get(subDistricts.indexOf(subDistrict)+4);
				            String feb = rowFeb.get(subDistricts.indexOf(subDistrict)+4);
				            
				            csvPrinter.printRecord(stateName,districtName,subDistrict,parameter,jan,feb);
				            //System.out.println(stateName+","+districtName+","+subDistrict+","+parameter+","+total);
				        }
					}
				}
				}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		csvPrinter.flush();        
	}

	private static List<CSVRecord> openCSVFIle(String state,String district,String fileName) throws IOException {
		
		Reader reader = Files.newBufferedReader(Paths.get("D:/Project/Hospital Datasets/State wise health data/2014/"+state+"/"+district+"/"+fileName));
		CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
		
		List<CSVRecord> csvRecords = csvParser.getRecords();
		return csvRecords;
	}

}
