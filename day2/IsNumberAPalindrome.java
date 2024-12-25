package week1.day2;
import java.util.Scanner;

public class IsNumberAPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the number");
		
		int num  = scan.nextInt();
		
		scan.close();
		
		int a, temp, c = 0;
		
		temp  = num;
		
		while(num>0) {
			
			a = num%10;
			num = num/10;
			
			c = a + (c * 10);
		}
        
		System.out.println("The reversed number is : " + c);
		
		if(temp==c) {
			
			System.out.println(temp + " is a palindrome");
		}
		else {
			System.out.println(temp + " is not a palindrome");
		}
	}

}
