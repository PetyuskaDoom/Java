package sheet4Arrays;

public class GetMonthCalendar {
		
	public static void main(String[] args) {
        int Y = 2017;    
        int startDayOfMonth = 3;
        int sps = startDayOfMonth;

        String[] months = {
                "",                               // leave empty so that we start with months[1] = "January"
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
            };

            // days[i] = number of days in month i
            int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            for (int M = 1; M <= 12; M++) {

            // check for leap year
            if  ((((Y % 4 == 0) && (Y % 100 != 0)) ||  (Y % 400 == 0)) && M == 2)
                days[M] = 29;


            // print calendar header
            // Display the month and year
            System.out.println("          "+ months[M] + " " + Y);

            // Display the lines
            System.out.println("_____________________________________");
            System.out.println("   Sun  Mon Tue   Wed Thu   Fri  Sat");

            // spaces required
               sps = (days[M-1] + sps)%7;

            // print the calendar
            for (int i = 0; i < sps; i++)
                System.out.print("     ");
            for (int i = 1; i <= days[M]; i++) {
                System.out.printf(" %3d ", i);
                if (((i + sps) % 7 == 0) || (i == days[M])) System.out.println();
            }

            System.out.println();
        }
	
	}
}	
		
	
	
	