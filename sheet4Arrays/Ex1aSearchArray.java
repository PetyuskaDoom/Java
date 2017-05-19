package sheet4Arrays;

import java.util.Random;

public class Ex1aSearchArray {

	public static void main(String[] args) {
		
		int [] nums = new int [10];
		int index = 0;
		int value = 0;
		
		// Create an instance of the Random and Ex1aSearchArray class.
		Random random = new Random();
		Ex1aSearchArray s = new Ex1aSearchArray();
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(100) + 1; // Get random number between 1 and 100 and assign it to array index.
			System.out.print(nums[i] + " ");
		}
		
		value = nums[random.nextInt(10)];
		
		System.out.println();
		
		index = s.searchArray(nums, value);
		
		System.out.printf("Value : %d Index : %d\n", value, index);
	}
	
	public int searchArray(int [] nums, int value) {

	    int index = 0;
	    
	    for(int i = 0; i < nums.length; i++) {

	        if(nums[i] == value) {
	            index = i;
	            break;
	        }
	    }
	    return index;
	}
}
/* OUTPUT
84 54 27 69 74 73 24 56 49 84 
Value : 24 Index : 6
*/
