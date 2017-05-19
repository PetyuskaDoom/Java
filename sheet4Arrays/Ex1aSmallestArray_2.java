package sheet4Arrays;

import java.util.Random;

// Find the smallest number in an array using a method. Print from method the results.
public class Ex1aSmallestArray_2 {
	
	public static void main(String[] args) {
	
		int [] nums = new int [10];
		
		// Create an instance of the random class.
		Random random = new Random();
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(100) + 1; // Get random number between 1 and 100 and assign it to array index.
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		
		findSmallestNumber(nums);
	}
	
	private static void findSmallestNumber(int [] nums) {
		
		int smallest = nums[0];
		int index = 0;
		
		for (int i = 1; i < nums.length; i++) {
			
			if (nums[i] < smallest) {
				smallest = nums[i];
				index = i;
			}
		}
		System.out.printf("Smallest number: %d\nPosition: %d\n", smallest, (index + 1));
	}
}	
/* OUTPUT
51 28 51 65 99 1 61 49 10 68 
Smallest number: 1
Position: 6
*/