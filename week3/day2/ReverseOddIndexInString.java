package week3.day2;

public class ReverseOddIndexInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
       
		String[] splitTest = test.split(" ");
		
		for(int i=0 ; i<splitTest.length; i++) {
			
			if(i%2==1) {
				
				String reverseTest = "";
				
				char[] charArray = splitTest[i].toCharArray();
				
				for(int j=charArray.length-1; j>=0;j--) {
					
					reverseTest = reverseTest + charArray[j];
				}
				
				System.out.print(reverseTest + " ");
			}
			
			else {
				
				System.out.print(splitTest[i] + " ");
			}
		}

	}

}
