package week4.day1;

public class DynamicPolymorphismChild extends DynamicPolymorphismParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DynamicPolymorphismChild dCP = new DynamicPolymorphismChild ();
		dCP.takeSnap();
		dCP.reportStep();
		
	}
	
	public void takeSnap() {
		
		super.takeSnap();
	}
	
	public void reportStep() {
		
		super.reportStep();
	}

}
