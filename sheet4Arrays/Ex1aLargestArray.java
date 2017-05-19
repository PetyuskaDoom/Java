package sheet4Arrays;

import java.util.Random;

//Find the largest number in an array.
public class Ex1aLargestArray {
	
	public static void main(String[] args) {
		
		int [] nums = new int [10];
		int largest = 0;
		int index = 0;
		
		// Create an instance of the random class.
		Random random = new Random();
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(100) + 1; // Get random number between 1 and 100 and assign it to array index.
			System.out.print(nums[i] + " ");
		}
		
		System.out.println();
		
		// Assign the value at index position [0] to the largest variable.
		// Used in the for loop to compare this value with the next value in the array.
		// If the next value in the array is larger than the value in the variable largest
		// then assign the value at the current index of the array to largest, overwriting it's
		// previous value.
		largest = nums[0];
		
		// Start from index [1] because we already know the value of index [0]
		for (int i = 1; i < nums.length; i++) {
			
			if (nums[i] > largest) {
				largest = nums[i];
				index = i;	// Index position of number in array is the position.
			}
		}
		System.out.printf("Largest number: %d\nPosition: %d\n", largest, (index + 1));
	}
}
/* OUTPUT
33 47 91 66 20 50 100 4 58 52 
Largest number: 100
Position: 7
 */


