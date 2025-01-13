package week4.day1;

public class StaticPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticPolymorphism jC = new StaticPolymorphism();
		
		jC.reportStep("message", "status");
		
		jC.reportStep("message", "status", false);
		
	
	}

	public void reportStep(String msg , String status) {
     
		System.out.println(msg + " " + status);

	}

	public void reportStep(String msg , String status, boolean snap) {

		System.out.println(msg + " " + status + " " + snap);
	}

}
