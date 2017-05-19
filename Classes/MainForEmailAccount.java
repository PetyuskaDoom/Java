package Classes;

public class MainForEmailAccount {

	public static void main(String[] args) {

		EmailAccount e1 = new EmailAccount();
		
		e1.setMaxStorageLimit(120);
		System.out.println();
		
		System.out.println("Storage " + e1.getMaxStorageLimit());
		System.out.println();
		
		EmailAccount e2 = new EmailAccount("joe@ibm.com", "   watchmen", EmailAccount.STORAGE_50_GB);
		
		EmailAccount e3 = new EmailAccount("tom@ibm.com", "vendetta", EmailAccount.STORAGE_5_GB);
		
		EmailAccount e4 = new EmailAccount("sally@ibm,com", "paradicsom", EmailAccount.STORAGE_100_GB);
		
		EmailAccount e5 = new EmailAccount("arthur@ibm,com", "galaxym83", EmailAccount.STORAGE_5_GB);
		
		System.out.println("Number of email accounts generated " + EmailAccount.emailAccountCounter);
		System.out.println();
		
		EmailAccount [] allAccount = {e1, e2, e3, e4, e5};
		
		for (EmailAccount e : allAccount) {
			System.out.println(e);  
			System.out.println();  
		}
		
		System.out.println("Counter : " + EmailAccount.emailAccountCounter);
		System.out.println();

	}

}
