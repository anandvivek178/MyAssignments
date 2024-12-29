package week2.day3;

public class Car {

	public void applyBrake() {
		System.out.println("Brake applied");	
		}
		
		public void wearSeatBelt() {
			System.out.println("Seat belt weared");
		}

		
	    public static void main(String[] args) {
			// ClassName objectName =new ClassName();
		            Car carActions=new Car();
		            carActions.applyBrake();
		            carActions.wearSeatBelt();
		}

}
