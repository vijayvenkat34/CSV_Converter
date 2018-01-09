
public class LabTests implements Domain {

	@Override
	public int[] returnStartAndEndLocation() {
		// TODO Auto-generated method stub
		int[] a = new int[2];
		a[0] = 188;
		a[1] = 205;
		return a;
	}

	@Override
	public String getDomainName() {
		// TODO Auto-generated method stub
		return "LabTests-"+Constants.YEAR+".csv";
	}

	@Override
	public String[] returnParameterNames() {
		// TODO Auto-generated method stub
		int size = returnStartAndEndLocation()[1] - returnStartAndEndLocation()[0];
		String[] name  = new String[size];
		
		//Out of the total number of Hb tests conducted, number of cases having Hb less than 7gm/dl
		name[0] = "Out of the total number of Hb tests conducted, cases having Hb less than 7gm/dl";
		//Number of HIV tests conducted on males
		name[1] = "HIV tests conducted on males";
		//Number of HIV tests conducted on males
		name[2] = "HIV tests conducted on males";
		//Number of HIV tests conducted on Female-Non ANC (i.e. non pregnant females)
		name[3] = "HIV tests conducted on Female-Non ANC";
		//Number of HIV tests conducted on Female-Non ANC (i.e. non pregnant females)
		name[4] = "HIV tests conducted on Female-Non ANC";
		//Number of HIV tests conducted on Female with ANC (i.e. pregnant females)
		name[5] = "HIV tests conducted on Female with ANC";
		//Number of HIV tests conducted on Female with ANC (i.e. pregnant females)
		name[6] = "HIV tests conducted on Female with ANC";
		//Total number of HIV tests conducted (sum of items 15.1.2.a to 15.1.2.c)
		name[7] = "Total number of HIV tests conducted";
		//Total number of HIV tests conducted (sum of items 15.1.2.a to 15.1.2.c)
		name[8] = "Total number of HIV tests conducted";
		//Number of Widal tests conducted
		name[9] = "Widal tests conducted";
		//Number of VDRL tests conducted on males
		name[10] = "VDRL tests conducted on males";
		//Number of VDRL tests conducted on Female-Non ANC (i.e. non pregnant females)
		name[11] = "VDRL tests conducted on Female-Non ANC";
		//Number of VDRL tests conducted on Female with ANC (i.e. pregnant females)
		name[12] = "VDRL tests conducted on Female with ANC";
		//Total number of VDRL tests conducted (sum of items 15.3.a to 15.3.c)
		name[13] = "Total number of VDRL tests conducted";
		//Number of blood smears examined for Malaria
		name[14] = "Blood smears examined for Malaria";
		//Out of blood smears examined for malaria, number of blood smears tested positive for Plasmodium Vivax
		name[15] = "Out of blood smears examined for malaria, blood smears tested positive for Plasmodium Vivax";
		//Out of blood smears examined for malaria, number of blood smears tested positive for Plasmodium Falciparum
		name[16] = "Out of blood smears examined for malaria, blood smears tested positive for Plasmodium Falciparum";

		return name;
	}



}
