
public class ChildDiseases implements Domain{
	
	@Override
	public int[] returnStartAndEndLocation() {
		
		int[] a = new int[2];
		a[0] = 146;
		a[1] = 155;
		
		if(Integer.parseInt(Constants.YEAR) <=2014){
			
			Constants.LENGTH_OF_FILE = 313;
		}else{
			Constants.LENGTH_OF_FILE = 319;
		}
		return a;
	}
	
	@Override
	public String getDomainName() {
		// TODO Auto-generated method stub
		return "ChildDiseases-"+Constants.YEAR+".csv";
	}

	@Override
	public String[] returnParameterNames() {
		// TODO Auto-generated method stub
		int size = returnStartAndEndLocation()[1] - returnStartAndEndLocation()[0];
		String[] name  = new String[size];
		
		//Number of cases of Diptheria reported in children below 5 years of age
		name[0] = "Diptheria";
		//Number of cases of Pertusis reported in children below 5 years of age
		name[1] = "Pertusis";
		//Number of cases of Tetanus neonatarum reported in children below 5 years of age
		name[2] = "Tetanus";
		//Number of cases of Tetanus other than neonatarum reported in children below 5 years of age
		name[3] = "Tetanus other than neonatarum";
		//Number of cases of Polio reported in children below 5 years of age
		name[4] = "Polio";
		//Number of cases of Measles reported in children below 5 years of age
		name[5] = "Measles";
		//Number of cases of Diarrhoea and Dehydration reported in children below 5 years of age
		name[6] = "Diarrhoea and Dehydration";
		//Number of cases of Malaria reported in children below 5 years of age
		name[7] = "Malaria";
		//Number of children below 5 years of age admitted with Respiratory Infections
		name[8] = "Respiratory Infections";

		return name;
	}

}
