package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String[] array = {"HCL", "Wipro","Aspire Systems", "CTS"};
		
		List<String> list = Arrays.asList(array);
		
		Collections.sort(list);
		
		System.out.println("Ascending order : " + list);
		
		List<String> list2 = new ArrayList<String>();
		
		for(int i = list.size()-1 ; i >= 0 ; i --) {
			
			list2.add(list.get(i));
		}
		
		
		System.out.println("Descending order : " + list2);
	}

}
