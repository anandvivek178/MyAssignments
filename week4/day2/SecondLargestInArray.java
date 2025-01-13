package week4.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] array = {3, 2, 11, 4, 6, 7};
		
		List<Integer> list = Arrays.asList(array);
		
		Collections.sort(list);
		
		System.out.println("The second largest number is : " + list.get(list.size()-2));

	}

}
