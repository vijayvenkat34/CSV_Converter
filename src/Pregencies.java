
public class Pregencies implements Domain{

	@Override
	public int[] returnStartAndEndLocation() {
		
		int[] a = new int[2];
		a[0] = 28;
		a[1] = 51;
		return a;
	}

	@Override
	public String getDomainName() {
		// TODO Auto-generated method stub
		return "Pregencies-"+Constants.YEAR+".csv";
	}

	@Override
	public String[] returnParameterNames() {
		// TODO Auto-generated method stub
		int size = returnStartAndEndLocation()[1] - returnStartAndEndLocation()[0];
		String[] name  = new String[size];
		
		//Number of Caesarean (C-Section) deliveries performed at CHCs (Community Health Centre)
		name[0] = "Caesarean deliveries performed at CHCs";
		//Number of Caesarean (C-Section) deliveries performed at SDHs (Sub-divisional Hospital) or DHs (District Hospital)
		name[1] = "Caesarean deliveries performed at SDHs or DHs";
		//Number of Caesarean (C-Section) deliveries performed at other State owned public institutions
		name[2] = "Caesarean deliveries performed at other State owned public institutions";
		//Total Number of Caesarean (C-Section) deliveries performed at Public facilities i.e. PHC, CHC, SDH, DH and other State owned public institutions (sum of items from 3.1.1 to 3.1.4)
		name[3] = "Total Number of Caesarean deliveries performed at Public facilities";
		//No. of C-section deliveries performed at Private facilities
		name[4] = "Caesarean deliveries performed at Private facilities";
		//Number of male live births
		name[5] = "Male live births";
		//Number of female live births
		name[6] = "Female live births";
		//Total number of male and female live births (4.1.1.a and 4.1.1.b)
		name[7] = "Total number of male and female live births";
		//Number of still births
		name[8] = "Still births";
		//Number of Abortions (spontaneous or induced)
		name[9] = "Abortions";
		//Number of Newborns weighed at birth
		name[10] = "Newborns weighed at birth";
		//Number of Newborns having weight less than 2.5 kg
		name[11] = "Newborns having weight less than 2.5 kg";
		//Number of Newborns breast fed within 1 hour of birth
		name[12] = "Newborns breast fed within 1 hour of birth";
		//Number of cases of pregnant women with Obstetric Complications and attended at PHCs
		name[13] = "Cases of pregnant women with Obstetric Complications and attended at PHCs";
		//Number of cases of pregnant women with Obstetric Complications and attended at CHCs
		name[14] = "Cases of pregnant women with Obstetric Complications and attended at CHCs";
		
		//Number of cases of pregnant women with Obstetric Complications and attended at SDHs or DHs
		name[15] = "Cases of pregnant women with Obstetric Complications and attended at SDHs or DHs";
		//Number of cases of pregnant women with Obstetric Complications and attended at other State owned public institutions
		name[16] = "Cases of pregnant women with Obstetric Complications and attended at other State owned public institutions";
		//Number of cases of pregnant women with Obstetric Complications and attended at Public facilities i.e. PHC, CHC, SDH, DH and other State owned public institutions (sum of items from 5.1.1 to 5.1.4)
		name[17] = "Cases of pregnant women with Obstetric Complications and attended at Public facilities";
		//Number of cases of pregnant women with Obstetric Complications and attended at Private facilities
		name[18] = "Cases of pregnant women with Obstetric Complications and attended at Private facilities";
		//Number of cases of complicated pregnancies treated with IV antibiotics
		name[19] = "Cases of complicated pregnancies treated with IV antibiotics";
		//Number of cases of complicated pregnancies treated with IV Antihypertensive/Magsulph injection
		name[20] = "Cases of complicated pregnancies treated with IV Antihypertensive/Magsulph injection";
		//Number of cases of complicated pregnancies treated with IV Oxytocis
		name[21] = "Cases of complicated pregnancies treated with IV Oxytocis";
		//Number of cases of complicated pregnancies treated with Blood Transfusion
		name[22] = "Cases of complicated pregnancies treated with Blood Transfusion";

		return name;
	}

	@Override
	public String[] returnFilterNames() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
