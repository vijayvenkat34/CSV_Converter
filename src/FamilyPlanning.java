
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
		return null;
	}

	@Override
	public String[] returnFilterNames() {
		// TODO Auto-generated method stub
		return null;
	}

}
