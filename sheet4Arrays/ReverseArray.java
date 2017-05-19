package sheet4Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int [] nums1 = {1, 10, 3, 4, 5, 6, 7, 8};
		

		System.out.printf("Array in order: \n");
		displayArray(nums1);
		
		System.out.println();
		
		System.out.printf("Reversed array: \n");
		reverseArray(nums1);
		
		System.out.println();
		
		System.out.printf("Sorted array: \n");
		sortArray(nums1);
	}
	
	public static void  sortArray (int [] nums1) {
		int min = 0;
		int temp = 0;
		
		for(int i=0; i < nums1.length; i++)
	    {
	        min = i;
	        for(int j=i; j < nums1.length; j++)
	        {
	            if(nums1[j] < nums1[min])
	                min = j;
	        }
	         temp = nums1[i];
	         nums1[i] = nums1[min];
	         nums1[min] = temp;

	         System.out.print(nums1[i] + " ");
	    }
	}

	public static void  reverseArray (int [] nums1) {
		int temp = 0;
		
		for(int i = 0; i < nums1.length; i++) {
		    temp = nums1[i];
		    nums1[i] = nums1[nums1.length - i - 1];
		    nums1[nums1.length - 1] = temp;
		    
		    System.out.print(nums1[i] + " ");
		}
	}

	public static void displayArray(int [] nums1) {
		
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + " ");
		}
		System.out.println();
	}
}