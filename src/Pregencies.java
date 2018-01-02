
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
	
	
}
