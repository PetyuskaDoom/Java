package sheet4Arrays;

public class Ex5ComradeNames {

	public static void main(String[] args) {
		
		String [] firstNames = {"Shane","Ben","Luca","Janos",
								"James","Ewelina","Asen","Darius",
								"Damien","Vitalie","Sean","Stephen",
								"Emmanuel"};
		String [] lastNames = {"Lennon","Deegan","Statella","Szabo",
								"Hickey","Dziedzina","Evtimov","Peciulis",
								"Sheehy","Brescamu","Masterson","Gregan",
								"Akrinrintoyo"};
		
		String fullName = "";
		
		for (int i = 0; i < firstNames.length; i++) {
			System.out.printf("First Name: %-20s Last Name: %-20s\n", firstNames[i], lastNames[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < firstNames.length; i++) {
			fullName = firstNames[i] + " " + lastNames[i];
			System.out.printf("Name: %s\n", fullName);
		}

	}
}