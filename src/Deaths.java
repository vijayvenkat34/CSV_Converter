
public class Deaths implements Domain {

	@Override
	public int[] returnStartAndEndLocation() {
		// TODO Auto-generated method stub
		int[] a = new int[2];
		a[0] = 206;
		a[1] = 313;
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
		return null;
	}

}
