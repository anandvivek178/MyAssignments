package week4.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] array = {1, 2, 3, 4, 10, 6, 8};
		
		List<Integer> list = Arrays.asList(array);
		
		Collections.sort(list);
		
		for(int i=0; i<list.size()-1; i++) {
			
			if(list.get(i)+1 != list.get(i+1)) {
				
				System.out.println(list.get(i)+1);
			}
			
		}
		
		

	}

}
