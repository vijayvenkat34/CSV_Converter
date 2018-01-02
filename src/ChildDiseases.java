
public class ChildDiseases implements Domain{
	
	@Override
	public int[] returnStartAndEndLocation() {
		
		int[] a = new int[2];
		a[0] = 147;
		a[1] = 155;
		return a;
	}
	
	@Override
	public String getDomainName() {
		// TODO Auto-generated method stub
		return "ChildDiseases-"+Constants.YEAR+".csv";
	}
}
