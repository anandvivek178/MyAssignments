package week1.day2;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		if (num > 0) {
			
			System.out.println("The number " + num + " is positive");
		}
		
		else if (num < 0){
			
			System.out.println("The number " + num + " is negative");
		}
		
		else {
			
			System.out.println("The number " + num + " is neither "
					+ "positive nor negative");
		}

	}

}
