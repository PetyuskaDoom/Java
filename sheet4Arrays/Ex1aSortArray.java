package sheet4Arrays;

import java.util.Random;

public class Ex1aSortArray {
	
	public static void main(String[] args) {
		
		int [] nums = new int [10];
		
		// Create an instance of the random class.
		Random random = new Random();
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(100) + 1; // Get random number between 1 and 100 and assign it to array index.
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		
		runSortArray(nums);
	}
	
	private static void runSortArray(int [] nums) {
		
		int min = 0;
		int temp = 0;
		
		for(int i = 0; i < nums.length; i++)
	    {
	        min = i;
	        for(int j = i; j < nums.length; j++)
	        {
	            if(nums[j] < nums[min])
	                min = j;
	        }
	         temp = nums[i];
	         nums[i] = nums[min];
	         nums[min] = temp;

	         System.out.print(nums[i] + " ");
	    }
	}
}	
/* OUTPUT
92 11 75 67 20 11 51 66 94 50 
11 11 20 50 51 66 67 75 92 94 
*/