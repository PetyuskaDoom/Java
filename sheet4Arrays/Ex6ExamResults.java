package sheet4Arrays;

public class Ex6ExamResults {

	public static void main(String[] args) {

		int [] results1 = {50, 60, 75};
		int [] results2 = {39, 95, 99};
		int [] results3 = {45, 40, 33};
		
		getResults(1, results1);
		getResults(2, results2);
		getResults(3, results3);
	}
	
	private static void getResults(int examNumber, int [] examResults) {
		
		boolean result = false;
		String text = "";
		
		System.out.printf("Result %d:\t", examNumber);

		for (int i = 0; i < examResults.length; i++) {
			System.out.print(examResults[i] + "\t");
		}

		System.out.println();

		result = getPassOrFail(examResults);
		
		if (result == true)
			text = "Pass";
		else
			text = "Fail";
		
		System.out.printf("Exam %d : %s\n", examNumber, text);
	}
	
	
	 
	private static boolean getPassOrFail (int [] examResults) {
			
		int numOfPasses = 0;
		int total = 0; 
		
		
		for (int i = 0; i < examResults.length; i++) {
			total = total + numOfPasses;
			
			if (examResults[i] >= 40) {
				numOfPasses = numOfPasses + 1;
			}
		}
		
		if (numOfPasses == 0 || numOfPasses == 1) {
			return false;
		}
		else if (numOfPasses == 2)  {	
			if (total >= 50)
				return true;
			else 
				return false;
		}
		else	
			return true;			
		
	}
}
