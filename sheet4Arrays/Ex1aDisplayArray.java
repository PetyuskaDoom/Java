package sheet4Arrays;

import java.util.Random;

public class Ex1aDisplayArray {

	public static void main(String[] args) {
		
		int [] nums = new int [10];
		
		// Create an instance of the Random and Ex1aSearchArray class.
		Random random = new Random();
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(100) + 1; // Get random number between 1 and 100 and assign it to array index.
		}
		System.out.println();
		
		displayArray(nums);
	}
	
	public static void displayArray(int [] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
}
/* OUTPUT
56 71 58 24 3 73 1 81 12 44 
*/

