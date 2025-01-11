package week3.day2;

public class FindOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "TestLeaf";
		
		int count = 0;
		
		char ch[] = input.toCharArray();
		
		for(int i=0;i<input.length();i++) {
			
			if(ch[i]=='e') {
				
				count++;
			}
			
		}
		
		System.out.println("The count of character e in the given string is " + count);

	}

}
