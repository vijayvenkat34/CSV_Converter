
public class Context {
	
	Domain domain;
	
	public Context(){
		switch(Constants.CHOICE){
		
			case 1:domain = new Pregencies();
			break;
			
			case 2:domain = new FamilyPlanning();
			break;
			
			case 3:domain = new ChildImmunization();
			break;
			
			case 4:domain = new ChildDiseases();
			break;
			
			case 5:domain = new LabTests();
			break;
			
			case 6:domain = new Deaths();
			break;
		}
	}
	
	int[] returnStartAndEndLocation(){
		return domain.returnStartAndEndLocation();
	}
	
	String getDomainName(){
		return domain.getDomainName();
	}
	
	String[] returnParameterNames(){
		return domain.returnParameterNames();
	}
	

}
