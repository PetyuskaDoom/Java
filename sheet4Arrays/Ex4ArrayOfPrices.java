package sheet4Arrays;

public class Ex4ArrayOfPrices {

	public static void main(String[] args) {

		double [] prices = {12.50, 11.20,  4.99, 
							 5.99, 25.40, 33.00, 
							24.76, 66.10, 76.12, 
							10.99, 88.66, 34.74};
		
		double [] newPrices = new double [prices.length];
		
		// Populate the new price.
		for (int i = 0; i < prices.length; i++) {
			newPrices[i] = prices[i] * 1.09;
			System.out.printf("%-12.2f %-12.2f\n", prices[i], newPrices[i]);
		}

		System.out.println();
	}
}
