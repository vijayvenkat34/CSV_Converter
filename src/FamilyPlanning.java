
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

}
