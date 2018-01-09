
public class ChildDiseases implements Domain{
	
	@Override
	public int[] returnStartAndEndLocation() {
		
		int[] a = new int[2];
		a[0] = 147;
		a[1] = 155;
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
		
		//Number of cases of Pertusis reported in children below 5 years of age
		name[0] = "Pertusis reported in children below 5 years of age";
		//Number of cases of Tetanus neonatarum reported in children below 5 years of age
		name[1] = "Tetanus neonatarum reported in children below 5 years of age";
		//Number of cases of Tetanus other than neonatarum reported in children below 5 years of age
		name[2] = "Tetanus other than neonatarum reported in children below 5 years of age";
		//Number of cases of Polio reported in children below 5 years of age
		name[3] = "Polio reported in children below 5 years of age";
		//Number of cases of Measles reported in children below 5 years of age
		name[4] = "Measles reported in children below 5 years of age";
		//Number of cases of Diarrhoea and Dehydration reported in children below 5 years of age
		name[5] = "Diarrhoea and Dehydration reported in children below 5 years of age";
		//Number of cases of Malaria reported in children below 5 years of age
		name[6] = "Malaria reported in children below 5 years of age";
		//Number of children below 5 years of age admitted with Respiratory Infections
		name[7] = "Children below 5 years of age admitted with Respiratory Infections";

		return name;
	}

}
