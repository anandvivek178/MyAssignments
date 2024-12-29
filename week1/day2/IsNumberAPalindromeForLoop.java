package week1.day2;
import java.util.Scanner;

public class IsNumberAPalindromeForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		String input = scan.nextLine();
		
		scan.close();
	
		 char[] ch = input.toCharArray();
		
		String reverse = "";
		
		for(int i = input.length() - 1 ; i >=0; i--) {
			
			reverse = reverse + ch[i];
			
		}
		
		System.out.println("The reversed input is " + reverse);
		
		if(input.equalsIgnoreCase(reverse)) {
			
			System.out.println(reverse + " is a palindrome");
		}
		else {
			System.out.println(reverse + " is not a palindrome");
		}
	}

}
