package sheet4Arrays;

import javax.swing.JOptionPane;

public class Ex7OrderingSystem {
	public static void main(String[] args) {

		int    [] refNums      = {1000, 1001, 1002, 1003, 1004};
		String [] productNames = {"Keyboard", "Mouse", "Monitor", "Mouse mat", "Speakers"};
		double [] prices       = {49.99, 15.50, 124.99, 3.99, 23.50};
		boolean isRefNumFound  = false;  

		// Print the headings.
		System.out.printf("%-15s%-15s%s\n", "Ref Number", "Product Name", "Price");
		System.out.printf("%1$-15s%1$-15s%2$s\n", "--------------", "----------");
		
		// Display the array data.
		for (int i = 0; i < refNums.length; i++) {
			System.out.printf("%-15d%-15s€%9.2f\n", refNums[i], productNames[i], prices[i]);
		}
		
		// User input.
		String strRefNum = JOptionPane.showInputDialog("Please enter a reference number");

		int intRefNum = Integer.parseInt(strRefNum);
		
		for (int i = 0; i < refNums.length; i++) {
			
			// This compares the input refNumber with the refNumber in our array.
			// If it finds a match then show the message dialog, show the input order amount dialog
			// and show the Total cost dialog. Then finally set the variable isRefNumFound to true.
			if (refNums[i] == intRefNum) {

				// Message dialog.
				JOptionPane.showMessageDialog(null, String.format("%s, cost: €%.2f", productNames[i], prices[i]));
				
				// Input dialog.
				String strQuantity = JOptionPane.showInputDialog("Order amount?");
				int intQuanity = Integer.parseInt(strQuantity);
				
				// Message dialog
				JOptionPane.showMessageDialog(null, String.format("Total cost of order: €%.2f", intQuanity * prices[i]));
				
				// Set the variable to true and suppress the final message in the last if statement on line 52.
				isRefNumFound = true;
				break;
			}
		}

		// There is no match for the refNumber entered by the user with the refNumber in the array.
		// Array data is displayed and the program exits with a message that refNumber was not found.
		if (!isRefNumFound) {   
			JOptionPane.showMessageDialog(null, "Reference number was not found");
		}
	}
}