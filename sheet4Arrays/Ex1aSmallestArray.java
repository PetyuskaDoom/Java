package sheet4Arrays;

import java.util.Random;

//Find the smallest number in an array. Print the results from main method.
public class Ex1aSmallestArray {
	
	public static void main(String[] args) {
	
		int [] nums = new int [10];
		int smallest = 0;
		int index = 0;
		
		// Create an instance of the random class.
		Random random = new Random();
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(100) + 1; // Get random number between 1 and 100 and assign it to array index.
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		
		// Assign the value at index position [0] to the smallest variable.
		// Used in the for loop to compare this value with the next value in the array.
		// If the next value in the array is smaller than the value in the variable smallest
		// then assign the value at the current index of the array to smallest, overwriting it's
		// previous value.
		smallest = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			
			if (nums[i] < smallest) {
				smallest = nums[i];
				index = i;	// Index position of number in array is the position.
			}
		}
		System.out.printf("Smallest number: %d\nPosition: %d\n", smallest, (index + 1));
	}
}
/* OUTPUT
75 68 96 33 74 26 16 7 97 46 
Smallest number: 7
Position: 8
 */
 
