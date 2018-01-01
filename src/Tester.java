import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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

public class Tester {

	public static void main(String[] args) throws IOException {
		
		JSONParser parser = new JSONParser();
		int flag=0;
		ArrayList<String> subDistricts = null;
		
		//output csv file 
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(Constants.SAMPLE_CSV_FILE));
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
				
				//iterate through districts/////////////////////////////////
				for(Object district : districts){
					String districtName = district.toString();
					//iterate through months
					for(String month : Constants.MONTHS){
						
						//select csv file
						String fileName = "hmis-item-14-15-mn-sd-mah-"+district+"-"+month+".csv";
						
						//openFile and return list of records of particular domain
						List<CSVRecord> csvRecords = openCSVFIle(stateName,districtName,fileName);
						System.out.println("File opened "+fileName);
						
						
							
							//should run only once that why flag
							if(flag==0){
								//header of CSV file
								CSVRecord headerRow = csvRecords.get(0);
								subDistricts = new ArrayList<String>();
								
								int k=0;
								for(int i=4;i<19;i++){
									//Convert and store -- SubDistricts-Pune => Pune
									subDistricts.add(headerRow.get(i).toString().substring(12));
								}
								flag=1;
							}
							for(String subDistrict : subDistricts){
								
								if(month.equals("jan"))
								{
									/*In this if loop we will print State,District,SubDistrict,Parameter,Jan only */
									
									//write into a csv file
									System.out.println("Inside jan");
							        for (int i=147;i<155;i++) {
							        	CSVRecord row = csvRecords.get(i);
		
							            String parameter = row.get(2);
							            String total = row.get(subDistricts.indexOf(subDistrict)+4);
							            
							            csvPrinter.printRecord(stateName,districtName,subDistrict,parameter,total);
							            //System.out.println(stateName+","+districtName+","+subDistrict+","+parameter+","+total);
							        }
							        System.out.println("--------------\n");
								}else{
									/*this block will print feb,mar,apr,....dec*/
									BufferedReader br=null;
								    BufferedWriter bw=null;
								    final String lineSep=System.getProperty("line.separator");

								    try {
								    	
								    	writer.close();
								    	
								        File file = new File("D:/Project/Hospital Datasets", "sample.csv");
								        File file2 = new File("D:/Project/Hospital Datasets", "sample1.csv");//so the
								                    //names don't conflict or just use different folders

								        br = new BufferedReader(new InputStreamReader(new FileInputStream(file))) ;
								        bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
								        String line = null;
								                    int i=0;
								        for ( line = br.readLine(); line != null; line = br.readLine(),i++)
								        {               
								        	
								            String addedColumn = "asda";
								            bw.write( line+","+addedColumn+lineSep );
								    }

								    }catch(Exception e){
								        System.out.println(e);
								    }finally  {
								        if(br!=null)
								            br.close();
								        if(bw!=null)
								            bw.close();
								    }
								}
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
