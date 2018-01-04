import java.net.ConnectException;
import java.util.HashMap;
import java.util.Map;

public class Constants {
	
	public static final String YEAR = "2014";
	
	//domain selection
	public static int CHOICE = 6;
	public static Map<String, Integer> DOMAIN_LIST = new HashMap<String, Integer>(){
		{
			put("Pregencies",1);
			put("Family Planning",2);
			put("Child Immunization",3);
			put("Child Diseases",4);
			put("Lab Testing",5);
			put("Deaths",6);
		}
	};
	//path of sample csv file
	public static final String SAMPLE_CSV_FILE = "D:/Project/Hospital Datasets/sample.csv";
	
	//path of final output file
	static Context temp = new Context();
	public static String OUTPUT_FILENAME = temp.getDomainName();
	public static final String FINAL_CSV_FILE = "D:/Project/Hospital Datasets/"+OUTPUT_FILENAME;
	
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
