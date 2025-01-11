package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      String text1 = "stops";
      
      String text2 = "potss";
      
      //Validating if the string lengths are equal or not
      
      if(text1.length()!=text2.length()) {
    	  
    	  System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
      } 
      
      //if the String lengths are equal, then proceed with below logic
      
      else {
    	  
      //Convert both the Strings into CharArray 	  
      
      char[] textOne = text1.toCharArray();
      
      char[] textTwo = text2.toCharArray();
      
      //Sort both the arrays
      
      Arrays.sort(textOne);
      
      Arrays.sort(textTwo);
      
      //Check if both the arrays are equal
      
      boolean anagram = Arrays.equals(textOne, textTwo);
      
      if (anagram) {
    	  
    	  System.out.println("The given strings are Anagram");
      }
      
      else {
    	  
    	  System.out.println("The given strings are not an Anagram");
    	  
      }
      
      }
      
	}

}
