
public class ChildImmunization implements Domain {

	@Override
	public int[] returnStartAndEndLocation() {
		int[] a = new int[2];
		a[0] = 107;
		a[1] = 146;
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
		return null;
	}

	@Override
	public String[] returnFilterNames() {
		// TODO Auto-generated method stub
		return null;
	}

}
