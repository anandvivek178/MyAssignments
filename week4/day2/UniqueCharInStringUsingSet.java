package week4.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class UniqueCharInStringUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String companyName = "google";
		
		char[] charArray = companyName.toCharArray();
		
		LinkedHashSet <Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i <companyName.length(); i++) {
			
			set.add(charArray[i]);
		}
		
		for (char a : set)
		
        System.out.print(a);
		
	}

}
