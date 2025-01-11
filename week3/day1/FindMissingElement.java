package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num =  {1,4,3,2,8,6,7}; 
		
		Arrays.sort(num);
		
		for(int i=0;i<num.length-1;i++)
        {
            if(num[i]+1!=num[i+1])
            {
                System.out.println(num[i]+1);
                break;
            }
        }
				
	}

}
