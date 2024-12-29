package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8, a =0, b =0, c =1;
		
		for(int i = 0; i < range; i++) {
			
			a = b;
			b = c;
			c = a + b;
			
			System.out.print(a + " ");
		}
	 
	}

}
