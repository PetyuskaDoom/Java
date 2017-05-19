package sheet4Arrays;

public class Ex4aCalendar_2 {
	public static void main (String [] args) {
		
		// Month headings.
		String [] strMonths = {
				"January", "February", "March", "April", 
				"May", "June", "July", "August", "September", 
				"October", "November", "December"
			};

		// Day headings.
		// The first day of Jamuary 2017 is Sunday which is element 6 in strDays array.
		//					  0	   1	2    3    4    5    6	
		//String [] strDays = {"M", "T", "W", "T", "F", "S", "S"};
		String strDays = "   M   T   W   T   F   S   S";

		// Force a newline when it's this day.
		int startOfMonthDay = 6;
		int beginningDay = 0;

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
				17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30}/*
				
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
				17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}*/
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
			
			//System.out.println(calendarDaysByMonth.length); // Test how many elements in array.
			System.out.println("\n\t" + strMonths[i]); // i = [0] = January

			// Print the array days heading and left pad with 4 spaces for each array element.
			//for (int a = 0; a < strDays.length; a++) {
			//	System.out.printf("%4s", strDays[a]);  // M T W T F S S 
			//}

			System.out.println(strDays);  // M T W T F S S
			
			/* Enhanced for loop, exactle the same as the loop above.
			for(String day : strDays) {
				System.out.printf("%4s", day);  // M T W T F S S 
			}*/
			
			//System.out.println(); // Goto new line after printing weekday headings.

			// Print blank space markers. The 2017 calendar starts on Sunday but this calander goes from Monday to Sunday 
			// so we require space markers where there are no dates in the matrix.
			for (int b = 0; b < startOfMonthDay; b++) {
				System.out.printf("%4s", "-");		
			}
			
			//System.out.println(); 
			beginningDay = startOfMonthDay;
			//System.out.printf("beginningDay %d, startOfMonthDay %d\n",beginningDay, startOfMonthDay);

			// This loops through the 2nd dimension of the calendarDaysByMonth array, i.e. each day.
			for (int j = 0; j < calendarDaysByMonth[i].length; j++) {
				// prints each number
				System.out.printf("%4d", calendarDaysByMonth[i][j]);      

				// Newline after 7th day, use mod operater to determine if we need a new line to start the week off again.
				// If true print a new line and reset the beginningDay to zero. If false, increment the beginningDay counter 
				// by 1 each time through the loop.
				if ((beginningDay + 1) % 7 == 0) {
					System.out.println(); 
					beginningDay = 0;   
				} 
				else {
					// increment counter when mod 7 is false.
					beginningDay++;
				}	
				
				// And finally, the logical following day for the next month will be the current
				// value of beginningDay after it has been incremented in the loop x amount of 
				// times times depending on the array data for the month. This will usually be for the last few days
				// of the month.
				// If the last week of the month only has 3 days then the startOfMonthDay will be 4, this will
				// be the startOfMonthDay of the new month, it is used when we start the outer loop to generate the blanks
				// for the missing days.
				//
				// for (int a = 0; a < startOfMonthDay; a++) {
				//	System.out.printf("%4s", "-");		
				// }
				startOfMonthDay = beginningDay;
				
				//System.out.printf("beginningDay %d, startOfMonthDay %d\n",beginningDay, startOfMonthDay);
			}
			System.out.println();
		} // end of calendarDaysByMonth loop
	}
}
