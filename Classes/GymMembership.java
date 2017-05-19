package Classes;

public class GymMembership {
	
	private int membershipNum;
	private double membershipCost;
	public static int defaultMembershipNumber;
	
	public static final int MONTHLY = 1;
	public static final int YEARLY = 2;
	public static final int ONCEOFF = 3;
	
	public GymMembership() {
		defaultMembershipNumber = 100;
	}
	
	public GymMembership (String make, String model, double engineSize) {
		
		this();
		setMembershipNum(membershipNum);
		setMembershipCost(membershipCost); // this.model = model;
		setPaymentFrequency(MONTHLY);
	}
}
