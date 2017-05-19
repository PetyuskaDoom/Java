package sheet4Arrays;

public class Ex4aCalendar_3 {
	public static void main (String [] args) {
		
		// Month headings.
		String [] strMonths = {
				"January", "February", "March", "April", 
				"May", "June", "July", "August", "September", 
				"October", "November", "December"
			};

		String strDays = "   M   T   W   T   F   S   S";

		// Force a newline when it's this day.
		int startOfMonthDay = 6;
		int beginningDay = 0;
		int month = 4;

		// There is an easier way of doing this without the need to store all this redundant data. For now
		// it's a quick and dirty solution that serves a purpose. The end justifies the means.
		int [][] calendarDaysByMonth = 
			{ {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 
				17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
				
					
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
				17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28}, 
				
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
				17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
				
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 
				17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
				
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 
				17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
				
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
				17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
				
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
				17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
				
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
				17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
				
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
				17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
				
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
				17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
				
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 
				17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
				
			  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 
				17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}
			};
			
			/*
				January
			M   T   W   T   F   S   S
			-   -   -   -   -   -   1
			2   3   4   5   6   7   8
			9   10  11  12  13  14  15
			16  17  18  19  20  21  22
			23  24  25  26  27  28  29
			30  31
			
				February
			M   T   W   T   F   S   S
			-   -   1   2   3   4   6
			*/

		// Loop through each row/ month of the calendarDaysByMonth array.
		// This outer loop will run 12 times as there are 12 elements in the 
		// first dimension of the array which is equivalent to the strMonths array.
		for(int i = 0; i < calendarDaysByMonth.length; i++) {
			
			if (calendarDaysByMonth[month][0] == i) {

				if (strMonths[i] == "January") {
					beginningDay = 6;   
				} 
				else if (strMonths[i] == "February") {
					beginningDay = 3; 
				}
				else if (strMonths[i] == "March") {
					beginningDay = 4; 
				}
				else if (strMonths[i] == "April") {
					beginningDay = 5; 
				}
				else {
					beginningDay = 1;
				}
				//System.out.println(calendarDaysByMonth.length); // Test how many elements in array.
				System.out.println("\n\t" + strMonths[i]); // i = [0] = January

				System.out.println(strDays);  // M T W T F S S

				
				// Print blank space markers. The 2017 calendar starts on Sunday but this calander goes from Monday to Sunday 
				// so we require space markers where there are no dates in the matrix.
				for (int b = 0; b < startOfMonthDay; b++) {
					System.out.printf("%4s", "-");		
				}
				beginningDay = startOfMonthDay;
				
				// This loops through the 2nd dimension of the calendarDaysByMonth array, i.e. each day.
				for (int j = 0; j < calendarDaysByMonth[i].length; j++) {

					// prints each number of calendar.
					System.out.printf("%4d", calendarDaysByMonth[i][j]);      
					
					if (beginningDay == 6) {
						System.out.println(); 
						beginningDay = 0;   
					} 
					else {
						beginningDay++;
					}	
					
					startOfMonthDay = beginningDay;
				}
				System.out.println();
			} // End of if
		} // end of calendarDaysByMonth loop
	}
}

