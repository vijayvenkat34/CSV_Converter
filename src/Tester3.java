
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

public class Tester3 {


	
	public static void main(String[] args) throws IOException {
			
		//selection of domain
		Context conn = new Context();
		
		JSONParser parser = new JSONParser();
		int flag=0;
		ArrayList<String> subDistricts = null;
		
		//output csv file 
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(Constants.FINAL_CSV_FILE));
        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
                        
        
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
					
					//load all the files present in the directory into a single file sample.csv
					//and return the name of each files
					ArrayList<String> filePaths = loadIntoSingleFile(stateName,districtName);
					
					//get the months
					ArrayList<String> months = new ArrayList<>();
					for(String path : filePaths){

						//store the last 3 charaters from path i.e jan,feb 
						months.add(path.substring(path.length()-7,path.length()-4));
					}
				
					System.out.println(months.toString());
					
					//reading of sample.csv file
					Reader reader = Files.newBufferedReader(Paths.get(Constants.SAMPLE_CSV_FILE));
					CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
					List<CSVRecord> csvRecords = csvParser.getRecords();
					
					//get header of file (column names)
					CSVRecord headerRow = csvRecords.get(0);
					subDistricts = new ArrayList<String>();
					
					//store subDistricts in array {Pune,Ambegaon,Pundarpur}
					for(int i=4;i<19;i++){
						//Convert and store -- SubDistricts-Pune => Pune
						subDistricts.add(headerRow.get(i).toString().substring(12));
					}
					
					//based on Constants.CHOICE the start and end is selected
					int[] a = new int[2];
					int start = conn.returnStartAndEndLocation()[0];
					int end = conn.returnStartAndEndLocation()[1];
					
					for(String subDistrict : subDistricts){
						
				        for (int i=start;i<end;i++) {
				        	CSVRecord row = csvRecords.get(i);
				        	
				        	//fetch the parameter column
				            String parameter = row.get(2);
				            
				            //fetch type column i.e filter
				            String filter = row.get(3);
				            
				            ArrayList<String> dataRecord = new ArrayList<>();
				           /* for(int k=0;k<months.size();k++){
				            	dataRecord.add("a");
				            }*/
				            
				       
				            dataRecord.add(stateName);
				            dataRecord.add(districtName);
				            dataRecord.add(subDistrict);
				            dataRecord.add(parameter);
				            dataRecord.add(filter);
				            
				            for(int pos=1;pos<=months.size();pos++){
				            	
				            	String total;
				            	
				            	switch(pos){
				            	
				            		//apr
					            	case 1:
					            		total = row.get(subDistricts.indexOf(subDistrict)+4);
					            		dataRecord.add(total);
					            		break;
					            	
					            	//aug
					            	case 2:
					            		row = csvRecords.get(i+313);
					            		total = row.get(subDistricts.indexOf(subDistrict)+4);
					            		dataRecord.add(total);
					            		break;
					            		
						            	//dec
					            	case 3:
					            		row = csvRecords.get(i+313*2);
					            		total = row.get(subDistricts.indexOf(subDistrict)+4);
					            		dataRecord.add(total);
					            		break;
					            	
						            	//feb
					            	case 4:
					            		row = csvRecords.get(i+313*3);
					            		total = row.get(subDistricts.indexOf(subDistrict)+4);
					            		dataRecord.add(total);
					            		break;
					            	
						            	//jan
					            	case 5:
					            		row = csvRecords.get(i+313*4);
					            		total = row.get(subDistricts.indexOf(subDistrict)+4);
					            		dataRecord.add(total);
					            		break;
					            	
						            	//jul
					            	case 6:
					            		row = csvRecords.get(i+313*5);
					            		total = row.get(subDistricts.indexOf(subDistrict)+4);
					            		dataRecord.add(total);
					            		break;
					            	
						            	//jun
					            	case 7:
					            		row = csvRecords.get(i+313*6);
					            		total = row.get(subDistricts.indexOf(subDistrict)+4);
					            		dataRecord.add(total);
					            		break;
					            		
						            	//mar
					            	case 8:
					            		row = csvRecords.get(i+313*7);
					            		total = row.get(subDistricts.indexOf(subDistrict)+4);
					            		dataRecord.add(total);
					            		break;
					            		
						            	//may
					            	case 9:
					            		row = csvRecords.get(i+313*8);
					            		total = row.get(subDistricts.indexOf(subDistrict)+4);
					            		dataRecord.add(total);
					            		break;
					            		
						            	//nov
					            	case 10:
					            		row = csvRecords.get(i+313*9);
					            		total = row.get(subDistricts.indexOf(subDistrict)+4);
					            		dataRecord.add(total);
					            		break;
					            		
						            	//oct
					            	case 11:
					            		row = csvRecords.get(i+313*10);
					            		total = row.get(subDistricts.indexOf(subDistrict)+4);
					            		dataRecord.add(total);
					            		break;
					            		
						            	//sep
					            	case 12:
					            		row = csvRecords.get(i+313*11);
					            		total = row.get(subDistricts.indexOf(subDistrict)+4);
					            		dataRecord.add(total);
					            		break;
				            	}
				            }
				    
				            //for()
				            csvPrinter.printRecord(dataRecord);
				            //System.out.println(stateName+","+districtName+","+subDistrict+","+parameter+","+total);
				        }
					}
				}
				}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		finally{
			
			//delete sample.csv file
			File file = new File(Constants.SAMPLE_CSV_FILE);
			file.delete();
			
			csvPrinter.flush();
		}
	}

	private static ArrayList<String> loadIntoSingleFile(String stateName,String districtName) throws IOException {
		
		PrintWriter pw = new PrintWriter(new FileOutputStream(Constants.SAMPLE_CSV_FILE));
		File file = new File(Constants.DIRECTORY+"/"+stateName+"/"+districtName);
		
		File[] files = file.listFiles();
		ArrayList<String> filePaths = new ArrayList<>();
		
		for (int i = 0; i < files.length; i++) {

			//System.out.println("Processing " + files[i].getPath() + "... ");
			filePaths.add(files[i].getPath());
			
			BufferedReader br = new BufferedReader(new FileReader(files[i]
					.getPath()));
			
			String line = br.readLine();
			while (line != null) {
				pw.println(line);
				line = br.readLine();
			}
			br.close();
		}
		pw.close();
		
		return filePaths;
	}

	private static List<CSVRecord> openCSVFIle(String state,String district,String fileName) throws IOException {
		
		Reader reader = Files.newBufferedReader(Paths.get("D:/Project/Hospital Datasets/State wise health data/2014/"+state+"/"+district+"/"+fileName));
		CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
		
		List<CSVRecord> csvRecords = csvParser.getRecords();
		return csvRecords;
	}

}
