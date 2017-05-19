package sheet4Arrays;

public class Ex3SumOfTwoArrays {

	public static void main(String[] args) {

		int [] array1 = {2, 6, 3, 1, 3, 2, 5, 8};
		int [] array2 = {5, 5, 1, 7, 5, 6, 8, 2};

		Ex3SumOfTwoArrays s = new Ex3SumOfTwoArrays();
		
		//s.printArray(array1);
		//s.printArray(array2);
		System.out.printf("%-12s%-12s %-12s\n", "Array 1", "Array 2", "Sum");
		s.sumOfTwoArrays(array1, array2);
	}
	
	public void sumOfTwoArrays(int [] array1, int [] array2) {
		
		for (int i = 0; i < array1.length; i++) {
			System.out.printf("%-12s %-12s %-12s\n", array1[i], array2[i], array1[i] + array2[i]);
		}
	}
	
	
	public void printArray (int [] myArray) {
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
	}
	
	// Method overloading using the same method name.
	public void printArray (double [] myArray) {
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
	}

}