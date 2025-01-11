package week3.day2;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme" ;

		//convert the string to character array

		char ch[] = test.toCharArray();

		//loop through the string

		for(int i=0; i<test.length(); i++) {

			//check for odd indices in the String

			if(i%2!=0) {

				//convert the odd indices to UpperCase

				ch[i] = Character.toUpperCase(ch[i]);

			}
		}

		//Convert the character array to String

		String result = new String(ch);

		System.out.println(result);

	}

}
