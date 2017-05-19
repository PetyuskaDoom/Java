package Classes;

public class EmailAccount {

	/* Static / class variables */
	public static int emailAccountCounter;
	
	public static final int STORAGE_5_GB = 5;
	public static final int STORAGE_50_GB = 50;
	public static final int STORAGE_100_GB = 100;
	
	/* Member variables */
	private String emailAddress;
	private String password;
	private int maxStorageLimit;
	
	/* Constructors */
	public EmailAccount() {
		emailAccountCounter++;
	}
	
	public EmailAccount(String emailAddress, String password, int maxStorageLimit) {
		this(); 
		this.emailAddress = emailAddress;
		setPassword(password); // If there is validation call the set method.
		
		setMaxStorageLimit(maxStorageLimit);
	}

	public static int getEmailAccountCounter() {
		return emailAccountCounter;
	}
	
	/* getters and setters */
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password.trim();  
	}
	
	public int getMaxStorageLimit() {
		return maxStorageLimit;
	}
	
	public void setMaxStorageLimit(int maxStorageLimit) {
		
		if (maxStorageLimit == STORAGE_5_GB || maxStorageLimit == STORAGE_50_GB || maxStorageLimit == STORAGE_100_GB) {
			this.maxStorageLimit = maxStorageLimit;
		} 
		else 
		{
			System.out.println(maxStorageLimit + " is out of range, setting to the default of 5GB.");
			this.maxStorageLimit = STORAGE_5_GB;
		}
	}

	/* Override toString() */
	public String toString() {
		return "Email address: " + emailAddress + "\nPassword: " + password + "\nMax storage limit: " + 
				maxStorageLimit + "GB.";
	}
}
