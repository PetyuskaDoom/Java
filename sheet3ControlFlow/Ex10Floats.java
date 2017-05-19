package sheet3ControlFlow;

public class Ex10Floats {

	public static void main(String[] args) {

		float num1 = 10;
		float num2 = 20;
		float num3 = 30;
		
		Ex10Floats ex10 = new Ex10Floats();
		
		ex10.sameOrDifferent(num1, num2, num3);
		ex10.printAverage(num1, num2, num3);
		ex10.largestAndSmallest(num1, num2, num3);
	}
	
	public void sameOrDifferent (float a, float b, float c) {
		if (a == b && b == c)
			System.out.println("All are the same.");
		else if (a != b && b != c && a != c)
			System.out.println("All are different.");
		else
			System.out.println("Two are the same.");
	}
	
	
	public void printAverage (float a, float b, float c) {
		System.out.println("The average is " + (a + b + c) / 3.0);
	}
	
	public void largestAndSmallest (float a, float b, float c) {
		float largest = a;
		float smallest = a;
		String var = "";
		
		if (b > largest) {
			largest = b;
			var = "Num2";

		}
		else if (c > largest) {
			largest = c;
			var = "Num3";
		}
		else
			var = "Num1";
		
		System.out.printf("%s is the largest number %.0f\n", var, largest);
		
		if (b < smallest) {
			smallest = b;
			var = "Num2";
		}
		else if (c < smallest) {
			smallest = c;
			var = "Num3";
		}
		else
			var = "Num1";

		System.out.printf("%s is the smallest number %.0f", var, smallest);
	}
}
