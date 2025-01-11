package week3.day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";

		int count = 0;

		String[] splitText = text.split(" ");

		for(int i=0; i<splitText.length;i++) {

			for(int j=i+1; j<splitText.length;j++) {

				if(splitText[i].equalsIgnoreCase(splitText[j])) {

					splitText[j] = "";

					count++;
				}
			}
		}

		if (count > 0) {
			// Build a new string with duplicates removed
			StringBuilder result = new StringBuilder();
			
			for (String word : splitText) {
				
				if (!word.isEmpty()) {
					
					result.append(word).append(" ");
				}
			}

			// Print the modified string
			System.out.println(result.toString().trim());


		}

	}

}