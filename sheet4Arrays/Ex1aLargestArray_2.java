package sheet4Arrays;

import java.util.Random;

//Find the largest number in an array using a method. Print from method the results.
public class Ex1aLargestArray_2 {
	
	public static void main(String[] args) {
		
		int [] nums = new int [10];
		
		// Test to confirm that if two consecutive numbers are present that the test 
		// to get the largest number will still find the largest number.
		//int [] nums = {95, 95, 7, 69, 96, 25, 6, 73, 45, 84}; 
		
		// Create an instance of the random class.
		Random random = new Random();
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(100) + 1; // Get random number between 1 and 100 and assign it to array index.
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		
		findLargestestNumber(nums);
	}
	
	private static void findLargestestNumber(int [] nums) {
		
		int largest = nums[0];
		int index = 0;
		
		for (int i = 1; i < nums.length; i++) {
			
			if (nums[i] > largest) {
				largest = nums[i];
				index = i;
			}
		}
		System.out.printf("Largest number: %d\nPosition: %d\n", largest, (index + 1));
	}
}	
/* OUTPUT
87 68 99 92 7 91 41 28 4 29 
Largest number: 99
Position: 3
*/