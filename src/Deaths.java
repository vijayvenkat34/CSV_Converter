
public class Deaths implements Domain {

	@Override
	public int[] returnStartAndEndLocation() {
		// TODO Auto-generated method stub
		int[] a = new int[2];
		
		if(Integer.parseInt(Constants.YEAR) <=2014){
			
			Constants.LENGTH_OF_FILE = 313;
			a[0] = 205;
			a[1] = 313;
		}else{
			Constants.LENGTH_OF_FILE = 319;
			a[0] = 211;
			a[1] = 319;
		}
		return a;
	}

	@Override
	public String getDomainName() {
		// TODO Auto-generated method stub
		return "Deaths-"+Constants.YEAR+".csv";
	}

	@Override
	public String[] returnParameterNames() {
		// TODO Auto-generated method stub
		int size = returnStartAndEndLocation()[1] - returnStartAndEndLocation()[0];
		String[] name  = new String[size];
		
		//Number of Infant deaths within 24 hrs of birth
		name[0] = "Infant deaths within 24 hrs of birth";
		//Number of Infant deaths 24 hours to 4 weeks of birth with the probable cause being Sepsis
		name[1] = "Infant deaths with the probable cause being Sepsis";
		//Number of Infant deaths 24 hours to 4 weeks of birth with the probable cause being Sepsis
		name[2] = "Infant deaths with the probable cause being Sepsis";
		//Number of Infant deaths 24 hours to 4 weeks of birth with the probable cause being Sepsis
		name[3] = "Infant deaths with the probable cause being Sepsis";
		//Number of Infant deaths 24 hours to 4 weeks of birth with the probable cause being Asphyxia
		name[4] = "Infant deaths with the probable cause being Asphyxia";
		//Number of Infant deaths 24 hours to 4 weeks of birth with the probable cause being Asphyxia
		name[5] = "Infant deaths with the probable cause being Asphyxia";
		//Number of Infant deaths 24 hours to 4 weeks of birth with the probable cause being Asphyxia
		name[6] = "Infant deaths with the probable cause being Asphyxia";
		//Number of Infant deaths 24 hours to 4 weeks of birth with the probable cause being LBW
		name[7] = "Infant deaths with the probable cause being LBW";
		//Number of Infant deaths 24 hours to 4 weeks of birth with the probable cause being LBW
		name[8] = "Infant deaths with the probable cause being LBW";
		//Number of Infant deaths 24 hours to 4 weeks of birth with the probable cause being LBW
		name[9] = "Infant deaths with the probable cause being LBW";
		//Number of Infant deaths 24 hours to 4 weeks of birth with the probable cause being other than Sepsis, Asphyxia and LBW
		name[10] = "Infant deaths with the probable cause being other than Sepsis Asphyxia and LBW";
		//Number of Infant deaths 24 hours to 4 weeks of birth with the probable cause being other than Sepsis, Asphyxia and LBW
		name[11] = "Infant deaths with the probable cause being other than Sepsis Asphyxia and LBW";
		//Number of Infant deaths 24 hours to 4 weeks of birth with the probable cause being other than Sepsis, Asphyxia and LBW
		name[12] = "Infant deaths with the probable cause being other than Sepsis Asphyxia and LBW";
		//Number of Infant or Child deaths between 1 month to 5 years of age with the probable cause being Pneumonia
		name[13] = "Infant or Child deaths with the probable cause being Pneumonia";
		//Number of Infant or Child deaths between 1 month to 5 years of age with the probable cause being Pneumonia
		name[14] = "Infant or Child deaths with the probable cause being Pneumonia";
		//Number of Infant or Child deaths between 1 month to 5 years of age with the probable cause being Pneumonia
		name[15] = "Infant or Child deaths with the probable cause being Pneumonia";
		//Number of Infant or Child deaths between 1 month to 5 years of age with the probable cause being Diarrhoea
		name[16] = "Infant or Child deaths with the probable cause being Diarrhoea";
		//Number of Infant or Child deaths between 1 month to 5 years of age with the probable cause being Diarrhoea
		name[17] = "Infant or Child deaths with the probable cause being Diarrhoea";
		//Number of Infant or Child deaths between 1 month to 5 years of age with the probable cause being Diarrhoea
		name[18] = "Infant or Child deaths with the probable cause being Diarrhoea";
		//Number of Infant or Child deaths between 1 month to 5 years of age with the probable cause being Fever related
		name[19] = "Infant or Child deaths with the probable cause being Fever related";
		//Number of Infant or Child deaths between 1 month to 5 years of age with the probable cause being Fever related
		name[20] = "Infant or Child deaths with the probable cause being Fever related";
		//Number of Infant or Child deaths between 1 month to 5 years of age with the probable cause being Fever related
		name[21] = "Infant or Child deaths with the probable cause being Fever related";
		//Number of Infant or Child deaths between 1 month to 5 years of age with the probable cause being Measles
		name[22] = "Infant or Child deaths with the probable cause being Measles";
		//Number of Infant or Child deaths between 1 month to 5 years of age with the probable cause being Measles
		name[23] = "Infant or Child deaths with the probable cause being Measles";
		//Number of Infant or Child deaths between 1 month to 5 years of age with the probable cause being Measles
		name[24] = "Infant or Child deaths with the probable cause being Measles";
		//Number of Infant or Child deaths between 1 month to 5 years of age with the probable cause being other than Pneumonia, Diarrhoea, Fever related and Measles
		name[25] = "Infant or Child deaths with the probable cause being other than Pneumonia Diarrhoea Fever related and Measles";
		//Number of Infant or Child deaths between 1 month to 5 years of age with the probable cause being other than Pneumonia, Diarrhoea, Fever related and Measles
		name[26] = "Infant or Child deaths with the probable cause being other than Pneumonia Diarrhoea Fever related and Measles";
		//Number of Infant or Child deaths between 1 month to 5 years of age with the probable cause being other than Pneumonia, Diarrhoea, Fever related and Measles
		name[27] = "Infant or Child deaths with the probable cause being other than Pneumonia Diarrhoea Fever related and Measles";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Diarrhoeal diseases
		name[28] = "Adolescent or Adult deaths with the probable cause being Diarrhoeal diseases";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Diarrhoeal diseases
		name[29] = "Adolescent or Adult deaths with the probable cause being Diarrhoeal diseases";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Diarrhoeal diseases
		name[30] = "Adolescent or Adult deaths with the probable cause being Diarrhoeal diseases";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Diarrhoeal diseases
		name[31] = "Adolescent or Adult deaths with the probable cause being Diarrhoeal diseases";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Tuberculosis
		name[32] = "Adolescent or Adult deaths with the probable cause being Tuberculosis";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Tuberculosis
		name[33] = "Adolescent or Adult deaths with the probable cause being Tuberculosis";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Tuberculosis
		name[34] = "Adolescent or Adult deaths with the probable cause being Tuberculosis";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Tuberculosis
		name[35] = "Adolescent or Adult deaths with the probable cause being Tuberculosis";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Respiratory diseases including infections
		name[36] = "Adolescent or Adult deaths with the probable cause being Respiratory diseases including infections";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Respiratory diseases including infections
		name[37] = "Adolescent or Adult deaths with the probable cause being Respiratory diseases including infections";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Respiratory diseases including infections
		name[38] = "Adolescent or Adult deaths with the probable cause being Respiratory diseases including infections";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Respiratory diseases including infections
		name[39] = "Adolescent or Adult deaths with the probable cause being Respiratory diseases including infections";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Malaria
		name[40] = "Adolescent or Adult deaths with the probable cause being Malaria";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Malaria
		name[41] = "Adolescent or Adult deaths with the probable cause being Malaria";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Malaria
		name[42] = "Adolescent or Adult deaths with the probable cause being Malaria";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Malaria
		name[43] = "Adolescent or Adult deaths with the probable cause being Malaria";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being other Fever related
		name[44] = "Adolescent or Adult deaths with the probable cause being other Fever related";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being other Fever related
		name[45] = "Adolescent or Adult deaths with the probable cause being other Fever related";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being other Fever related
		name[46] = "Adolescent or Adult deaths with the probable cause being other Fever related";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being other Fever related
		name[47] = "Adolescent or Adult deaths with the probable cause being other Fever related";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being HIV/AIDS
		name[48] = "Adolescent or Adult deaths with the probable cause being HIV/AIDS";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being HIV/AIDS
		name[49] = "Adolescent or Adult deaths with the probable cause being HIV/AIDS";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being HIV/AIDS
		name[50] = "Adolescent or Adult deaths with the probable cause being HIV/AIDS";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being HIV/AIDS
		name[51] = "Adolescent or Adult deaths with the probable cause being HIV/AIDS";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Heart disease or related to Hypertension
		name[52] = "Adolescent or Adult deaths with the probable cause being Heart disease or related to Hypertension";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Heart disease or related to Hypertension
		name[53] = "Adolescent or Adult deaths with the probable cause being Heart disease or related to Hypertension";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Heart disease or related to Hypertension
		name[54] = "Adolescent or Adult deaths with the probable cause being Heart disease or related to Hypertension";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Heart disease or related to Hypertension
		name[55] = "Adolescent or Adult deaths with the probable cause being Heart disease or related to Hypertension";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Neurological disease including strokes
		name[56] = "Adolescent or Adult deaths with the probable cause being Neurological disease including strokes";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Neurological disease including strokes
		name[57] = "Adolescent or Adult deaths with the probable cause being Neurological disease including strokes";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Neurological disease including strokes
		name[58] = "Adolescent or Adult deaths with the probable cause being Neurological disease including strokes";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Neurological disease including strokes
		name[59] = "Adolescent or Adult deaths with the probable cause being Neurological disease including strokes";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being Abortion
		name[60] = "Maternal deaths with the probable cause being Abortion";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being Abortion
		name[61] = "Maternal deaths with the probable cause being Abortion";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being Abortion
		name[62] = "Maternal deaths with the probable cause being Abortion";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being Abortion
		name[63] = "Maternal deaths with the probable cause being Abortion";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being Obstructed or prolonged labour
		name[64] = "Maternal deaths with the probable cause being Obstructed or prolonged labour";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being Obstructed or prolonged labour
		name[65] = "Maternal deaths with the probable cause being Obstructed or prolonged labour";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being Obstructed or prolonged labour
		name[66] = "Maternal deaths with the probable cause being Obstructed or prolonged labour";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being Obstructed or prolonged labour
		name[67] = "Maternal deaths with the probable cause being Obstructed or prolonged labour";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being Severe hypertesnion or fits
		name[68] = "Maternal deaths with the probable cause being Severe hypertesnion or fits";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being Severe hypertesnion or fits
		name[69] = "Maternal deaths with the probable cause being Severe hypertesnion or fits";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being Severe hypertesnion or fits
		name[70] = "Maternal deaths with the probable cause being Severe hypertesnion or fits";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being Severe hypertesnion or fits
		name[71] = "Maternal deaths with the probable cause being Severe hypertesnion or fits";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being Bleeding
		name[72] = "Maternal deaths with the probable cause being Bleeding";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being Bleeding
		name[73] = "Maternal deaths with the probable cause being Bleeding";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being Bleeding
		name[74] = "Maternal deaths with the probable cause being Bleeding";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being Bleeding
		name[75] = "Maternal deaths with the probable cause being Bleeding";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being High Fever
		name[76] = "Maternal deaths with the probable cause being High Fever";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being High Fever
		name[77] = "Maternal deaths with the probable cause being High Fever";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being High Fever
		name[78] = "Maternal deaths with the probable cause being High Fever";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being High Fever
		name[79] = "Maternal deaths with the probable cause being High Fever";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being other causes (excluding abortion; obstructed or prolonged labour; severe hypertension or fits;
		name[80] = "Maternal deaths with the probable cause being other causes";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being other causes (excluding abortion; obstructed or prolonged labour; severe hypertension or fits;
		name[81] = "Maternal deaths with the probable cause being other causes";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being other causes (excluding abortion; obstructed or prolonged labour; severe hypertension or fits;
		name[82] = "Maternal deaths with the probable cause being other causes";
		//Number of Maternal deaths (age 15-49 years) with the probable cause being other causes (excluding abortion; obstructed or prolonged labour; severe hypertension or fits;
		name[83] = "Maternal deaths with the probable cause being other causes";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Trauma or Accidents or Burn Cases
		name[84] = "Adolescent or Adult deaths with the probable cause being Trauma or Accidents or Burn Cases";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Trauma or Accidents or Burn Cases
		name[85] = "Adolescent or Adult deaths with the probable cause being Trauma or Accidents or Burn Cases";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Trauma or Accidents or Burn Cases
		name[86] = "Adolescent or Adult deaths with the probable cause being Trauma or Accidents or Burn Cases";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Trauma or Accidents or Burn Cases
		name[87] = "Adolescent or Adult deaths with the probable cause being Trauma or Accidents or Burn Cases";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being suicide
		name[88] = "Adolescent or Adult deaths with the probable cause being Trauma or Accidents or Burn Cases";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being suicide
		name[89] = "Adolescent or Adult deaths with the probable cause being Trauma or Accidents or Burn Cases";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being suicide
		name[90] = "Adolescent or Adult deaths with the probable cause being Trauma or Accidents or Burn Cases";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being suicide
		name[91] = "Adolescent or Adult deaths with the probable cause being suicide";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Animal bites and stings
		name[92] = "Adolescent or Adult deaths with the probable cause being suicide";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Animal bites and stings
		name[93] = "Adolescent or Adult deaths with the probable cause being Animal bites and stings";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Animal bites and stings
		name[94] = "Adolescent or Adult deaths with the probable cause being Animal bites and stings";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Animal bites and stings
		name[95] = "Adolescent or Adult deaths with the probable cause being Animal bites and stings";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Known Acute disease
		name[96] = "Adolescent or Adult deaths with the probable cause being Known Acute disease";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Known Acute disease
		name[97] = "Adolescent or Adult deaths with the probable cause being Known Acute disease";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Known Acute disease
		name[98] = "Adolescent or Adult deaths with the probable cause being Known Acute disease";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Known Acute disease
		name[99] = "Adolescent or Adult deaths with the probable cause being Known Acute disease";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Known Chronic disease
		name[100] = "Adolescent or Adult deaths with the probable cause being Known Chronic disease";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Known Chronic disease
		name[101] = "Adolescent or Adult deaths with the probable cause being Known Chronic disease";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Known Chronic disease
		name[102] = "Adolescent or Adult deaths with the probable cause being Known Chronic disease";
		//Number of Adolescent or Adult deaths (age 6 years & above) with the probable cause being Known Chronic disease
		name[103] = "Adolescent or Adult deaths with the probable cause being Known Chronic disease";
		//Number of Adolescent or Adult deaths (age 6 years & above) where the cause was not known
		name[104] = "Adolescent or Adult deaths where the cause was not known";
		//Number of Adolescent or Adult deaths (age 6 years & above) where the cause was not known
		name[105] = "Adolescent or Adult deaths where the cause was not known";
		//Number of Adolescent or Adult deaths (age 6 years & above) where the cause was not known
		name[106] = "Adolescent or Adult deaths where the cause was not known";
		//Number of Adolescent or Adult deaths (age 6 years & above) where the cause was not known
		name[107] = "Adolescent or Adult deaths where the cause was not known";
		
		return name;
	}



}
