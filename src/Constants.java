import java.util.HashMap;
import java.util.Map;

public class Constants {
	
	public static final String YEAR = "2014";
	
	//path of sample csv file
	public static final String SAMPLE_CSV_FILE = "D:/Project/Hospital Datasets/sample.csv";
	
	//path of final output file
	public static final String FINAL_CSV_FILE = "D:/Project/Hospital Datasets/final.csv";
	
	//Directory where files are present
	public static final String DIRECTORY = "D:/Project/Hospital Datasets/State wise health data/"+YEAR;
	
	public static final String MONTHS[] = {"jan","feb","mar","apr","may","jun",
			"jul","aug","sep","oct","nov","dec"};
	
	public static final Map<String, String> STATES = new HashMap<String, String>(){
		{
			put("Maharashtra","mah");
		}
	};
}
