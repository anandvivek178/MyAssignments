package week5.day2;

import java.util.Scanner;

public class StringJavaChallengeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter your String : ");
	    
	    String input = scan.nextLine();
	    
	    scan.close();
	    
	    String[] split = input.split(" ");
	    
	    String string = split[split.length-1];
	    
	    System.out.println(string.length());
	   
	}

}
