package week1.day2;
import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isPrime = true;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number to be verified");
		
		int num = scan.nextInt();
		scan.close();
		if(num == 1) {
			
			System.out.println("The number  is not prime" );
		}
		
		else if(num == 2) {
			System.out.println("The number is prime" );
		}
		
		if (num>2) {
		
		for(int i = 2; i <num/2; i++) {
			
			if(num%i == 0) {
				
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			
			System.out.println("The number is prime" );
		}
		else {
			
			System.out.println("The number is not prime" );
		}
		}
	}

}
