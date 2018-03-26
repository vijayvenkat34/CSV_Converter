
public class ChildImmunization implements Domain {

	@Override
	public int[] returnStartAndEndLocation() {
		int[] a = new int[2];
		a[0] = 107;
		a[1] = 146;
		
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
		return "ChildImmunization-"+Constants.YEAR+".csv";
	}

	@Override
	public String[] returnParameterNames() {
		// TODO Auto-generated method stub
		int size = returnStartAndEndLocation()[1] - returnStartAndEndLocation()[0];
		String[] name  = new String[size];
		
		//Number of Infants (0 to 11 months old) received DPT1 immunisation
		name[0] = "DPT1 (0 to 11 months old)";
		//Number of Infants (0 to 11 months old) received DPT2 immunisation
		name[1] = "DPT2 (0 to 11 months old)";
		//Number of Infants (0 to 11 months old) received DPT3 immunisation
		name[2] = "DPT3 (0 to 11 months old)";
		//Number of Infants (0 to 11 months old) received Pentavalent1 immunisation
		name[3] = "Pentavalent1 (0 to 11 months old)";
		//Number of Infants (0 to 11 months old) received Pentavalent2 immunisation
		name[4] = "Pentavalent2 (0 to 11 months old)";
		//Number of Infants (0 to 11 months old) received Pentavalent3 immunisation
		name[5] = "Pentavalent3 (0 to 11 months old)";
		//Number of Infants (0 to 11 months old) received OPV 0 (Birth Dose)
		name[6] = "OPV0 (0 to 11 months old)";
		//Number of Infants (0 to 11 months old) received OPV1 (First Dose)
		name[7] = "OPV1 (0 to 11 months old)";
		//Number of Infants (0 to 11 months old) received OPV2 (Second Dose)
		name[8] = "OPV2 (0 to 11 months old)";
		//Number of Infants (0 to 11 months old) received OPV3 (Third Dose)
		name[9] = "OPV3 (0 to 11 months old)";
		//Number of Infants (upto 48 hrs of age) received Hepatitis-B0 immunisation
		name[10] = "Hepatitis-B0 (upto 48 hrs of age)";
		//Number of Infants (0 to 11 months old) received Hepatitis-B1 immunisation
		name[11] = "Hepatitis-B1 (0 to 11 months old)";
		//Number of Infants (0 to 11 months old) received Hepatitis-B2 immunisation
		name[12] = "Hepatitis-B2 (0 to 11 months old)";
		//Number of Infants (0 to 11 months old) received Hepatitis-B3 immunisation
		name[13] = "Hepatitis-B3 (0 to 11 months old)";
		//Number of Infants (0 to 11 months old) received Measles immunisation (First Dose)
		name[14] = "Measles(First Dose) (0 to 11 months old)";
		//Number of Infants (more than 16 months old) received Measles immunisation (Second Dose)
		name[15] = "Measles(Second Dose) (0 to 11 months old)";
		//No. of Children aged 9 to 12 months who received JE 1st dose
		name[16] = "JE 1st dose (9 to 12 months old)";
		//Total number of male children (9 to 11 months old) fully immunised (BCG+DPT123/Pentavalent123+OPV123+Measles) during the month
		name[17] = "Total number of male children fully immunised (9 to 12 months old)";
		//Total number of female children (9 to 11 months old) fully immunised (BCG+DPT123/Pentavalent123+OPV123+Measles) during the month
		name[18] = "Total number of female children fully immunised (9 to 12 months old)";
		//Total number of children (9 to 11 months old) fully immunised (BCG+DPT123/Pentavalent123+OPV123+Measles) during the month (sum of items 10.1.13.a and 10.1.13.b)
		name[19] = "Total number of children fully immunised (9 to 12 months old)";
		//Number of Infants (more than 16 months old) received DPT Booster dose
		name[20] = "DPT Booster dose (more than 16 months old)";
		//Number of Infants (more than 16 months old) received OPV Booster dose
		name[21] = "OPV Booster dose (more than 16 months old)";
		//Number of Infants (more than 16 months old) received Measles, Mumps, Rubella (MMR) Vaccination
		name[22] = "MMR Vaccination (more than 16 months old)";
		//Total number of male children (12 to 23 months old) fully immunised (BCG+DPT123/Pentavalent123+OPV123+Measles) during the month
		name[23] = "Total number of male children fully immunised (12 to 23 months old)";
		//Total number of female children (12 to 23 months old) fully immunised (BCG+DPT123/Pentavalent123+OPV123+Measles) during the month
		name[24] = "Total number of female children fully immunised (12 to 23 months old)";
		//Total number of children (12 to 23 months old) fully immunised (BCG+DPT123+OPV123/Pentavalent123+Measles) during the month (sum of items 10.3.1.a and 10.3.1.b)
		name[25] = "Number of children fully immunised (12 to 23 months old)";
		//Number of children (more than 5 years old) given DT5
		name[26] = "DT5 (more than 5 years old)";
		//Number of children (more than 10 years old) given TT10
		name[27] = "TT10 (more than 10 years old)";
		//Number of children (more than 16 years old) given TT16
		name[28] = "TT16 (more than 16 years old)";
		//Number of cases of Abscess reported following immunisation [Adverse Event Following Immunisation (AEFI)]
		name[29] = "Cases of Abscess reported following immunisation";
		//Number of cases of Death reported following immunisation [Adverse Event Following Immunisation (AEFI)]
		name[30] = "Cases of Death reported following immunisation";
		//Number of cases of other complications reported following immunisation [Adverse Event Following Immunisation (AEFI)]
		name[31] = "Cases of other complications reported following immunisation";
		//Number of Immunisation sessions planned to be held during the month
		name[32] = "Immunisation sessions planned to be held during the month";
		//Number of Immunisation sessions held during the month
		name[33] = "Immunisation sessions held during the month";
		//Number of Immunisation sessions held during the month where ASHAs were present
		name[34] = "Immunisation sessions held during the month where ASHAs were present";
		//Number of children (more than 16 months old) received Japanese Encephalitis (JE) vaccination
		name[35] = "JE vaccination (more than 16 months old)";
		//Number of children (9 months to 5 years old) administered 1st dose of Vitamin A (Dose-1)
		name[36] = "Children administered 1st dose of Vitamin A (9 months to 5 years old)";
		//Number of children (9 months to 5 years old) were administered 5th dose of Vitamin A (Dose-5)
		name[37] = "Children administered 5th dose of Vitamin A (9 months to 5 years old)";
		//Number of children (9 months to 5 years old) administered 9th dose of Vitamin A (Dose-9)
		name[38] = "Children administered 9th dose of Vitamin A (9 months to 5 years old) ";

		return name;
	}



}
