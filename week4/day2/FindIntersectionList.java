package week4.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] array1 =  {3, 2, 11, 4, 6, 7};

		Integer[] array2 =  {1, 2, 8, 4, 9, 7};

		List<Integer> list1 = Arrays.asList(array1);

		List<Integer> list2 = Arrays.asList(array2);

		Collections.sort(list1);

		Collections.sort(list2);

		for (int i=0; i<list1.size(); i++) {
			
			for (int j=0; j<list2.size(); j++) {
				
				if(list1.get(i)==list2.get(j)) {
					
					System.out.print(list2.get(j) + " ");
					
				}
			}
		}

	}

}
