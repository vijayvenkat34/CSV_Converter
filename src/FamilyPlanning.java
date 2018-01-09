
public class FamilyPlanning implements Domain {

	@Override
	public int[] returnStartAndEndLocation() {
		int[] a = new int[2];
		a[0] = 63;
		a[1] = 106;
		return a;
	}

	@Override
	public String getDomainName() {
		return "FamilyPlanning-"+Constants.YEAR+".csv";
	}

	@Override
	public String[] returnParameterNames() {
		// TODO Auto-generated method stub
		int size = returnStartAndEndLocation()[1] - returnStartAndEndLocation()[0];
		String[] name  = new String[size];
		
		//Number of NSV or Conventional Vasectomy conducted at CHCs
		name[0] = "NSV or Conventional Vasectomy conducted at CHCs";
		//Number of NSV or Conventional Vasectomy conducted at SDHs or DHs
		name[1] = "NSV or Conventional Vasectomy conducted at SDHs or DHs";
		//Number of NSV or Conventional Vasectomy conducted at other State owned public institutions
		name[2] = "NSV or Conventional Vasectomy conducted at other State owned public institutions";
		//Total Number of NSV or Conventional Vasectomy conducted at Public facilities i.e. PHC, CHC, SDH, DH and other State owned public institutions (sum of items from 9.1.1.a to 9.1.1.d)
		name[3] = "Total Number of NSV or Conventional Vasectomy conducted at Public facilities";
		//Number of NSV or Conventional Vasectomy conducted at Private facilities
		name[4] = "NSV or Conventional Vasectomy conducted at Private facilities";
		//Number of Laparoscopic sterilizations conducted at PHCs
		name[5] = "Laparoscopic sterilizations conducted at PHCs";
		//Number of Laparoscopic sterilizations conducted at CHCs
		name[6] = "Laparoscopic sterilizations conducted at CHCs";
		//Number of Laparoscopic sterilizations conducted at SDHs or DHs
		name[7] = "Laparoscopic sterilizations conducted at SDHs or DHs";
		//Number of Laparoscopic sterilizations conducted at other State owned public institutions
		name[8] = "Laparoscopic sterilizations conducted at other State owned public institutions";
		//Total Number of Laparoscopic sterilizations conducted at Public facilities i.e. PHC, CHC, SDH, DH and other State owned public institutions (sum of items from 9.2.1.a to 9.2.1.d)
		name[9] = "Total Number of Laparoscopic sterilizations conducted at Public facilities";
		//Number of Laparoscopic sterilizations conducted at Private facilities
		name[10] = "Laparoscopic sterilizations conducted at Private facilities";
		//Number of Mini-lap sterilizations conducted at PHCs
		name[11] = "Mini-lap sterilizations conducted at PHCs";
		//Number of Mini-lap sterilizations conducted at CHCs
		name[12] = "Mini-lap sterilizations conducted at CHCs";
		//Number of Mini-lap sterilizations conducted at SDHs or DHs
		name[13] = "Mini-lap sterilizations conducted at SDHs or DHs";
		//Number of Mini-lap sterilizations conducted at other State owned public institutions
		name[14] = "Mini-lap sterilizations conducted at other State owned public institutions";
		//Total Number of Mini-lap sterilizations conducted at Public facilities i.e. PHC, CHC, SDH, DH and other State owned public institutions (sum of items from 9.3.1.a to 9.3.1.d)
		name[15] = "Total Number of Mini-lap sterilizations conducted at Public facilities";
		//Number of Mini-lap sterilizations conducted at Private facilities
		name[16] = "Mini-lap sterilizations conducted at Private facilities";
		//Number of Post-Partum sterilizations conducted at PHCs
		name[17] = "Post-Partum sterilizations conducted at PHCs";
		//Number of Post-Partum sterilizations conducted at CHCs
		name[18] = "Post-Partum sterilizations conducted at CHCs";
		//Number of Post-Partum sterilizations conducted at SDHs or DHs
		name[19] = "Post-Partum sterilizations conducted at SDHs or DHs";
		//Number of Post-Partum sterilizations conducted at other State owned public institutions
		name[20] = "Post-Partum sterilizations conducted at other State owned public institutions";
		//Total Number of Post-Partum sterilizations conducted at Public facilities i.e. PHC, CHC, SDH, DH and other State owned public institutions (sum of items from 9.4.1.a to 9.4.1.d)
		name[21] = "Total Number of Post-Partum sterilizations conducted at Public facilities";
		//Number of Post-Partum sterilizations conducted at Private facilities
		name[22] = "Post-Partum sterilizations conducted at Private facilities";
		//Number of IUCD Insertions conducted at SCs
		name[23] = "IUCD Insertions conducted at SCs";
		//Number of IUCD Insertions conducted at PHCs
		name[24] = "IUCD Insertions conducted at PHCs";
		//Number of IUCD Insertions conducted at CHCs
		name[25] = "IUCD Insertions conducted at CHCs";
		//Number of IUCD Insertions conducted at SDHs or DHs
		name[26] = "IUCD Insertions conducted at SDHs or DHs";
		//Number of IUCD Insertions conducted at other State owned public institutions
		name[27] = "IUCD Insertions conducted at other State owned public institutions";
		//Total Number of IUCD Insertions conducted at Public facilities i.e. SC, PHC, CHC, SDH, DH and other State owned public institutions (sum of items from 9.5.1.a to 9.5.1.e)
		name[28] = "Total Number of IUCD Insertions conducted at Public facilities";
		//Out of above total, Post Partum (within 48 hours of delivery) IUCD insertions
		name[29] = "Out of above total, Post Partum (within 48 hours of delivery) IUCD insertions";
		//Number of IUCD Insertions conducted at Private facilities
		name[30] = "IUCD Insertions conducted at Private facilities";
		//Number of IUCD removals
		name[31] = "IUCD removals";
		//Number of Oral Pills cycles distributed
		name[32] = "Oral Pills cycles distributed";
		//Number of Condom pieces distributed
		name[33] = "Condom pieces distributed";
		//Number of Centchroman (weekly) pills given
		name[34] = "Centchroman (weekly) pills given";
		//Number of Emergency Contraceptive Pills distributed
		name[35] = "Emergency Contraceptive Pills distributed";
		//Number of cases of complications following male sterilization
		name[36] = "Cases of complications following male sterilization";
		//Number of cases of complications following female sterilization
		name[37] = "Cases of complications following female sterilization";
		//Number of failures following male sterilization
		name[38] = "Failures following male sterilization";
		//Number of failures following female sterilization
		name[39] = "Failures following female sterilization";
		//Number of deaths following male sterilization
		name[40] = "Deaths following male sterilization";
		//Number of deaths following female sterilization
		name[41] = "Deaths following female sterilization";
		//Number of Institutions having NSV trained doctors
		name[42] = "Institutions having NSV trained doctors";

		return name;
	}



}
