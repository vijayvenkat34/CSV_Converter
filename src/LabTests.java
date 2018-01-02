
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

}
