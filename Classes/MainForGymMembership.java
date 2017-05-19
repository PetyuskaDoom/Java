package Classes;

public class MainForGymMembership {

	public static void main(String[] args) {
		GymMembership g1 = new GymMembership();
		
		g1.setMembershipNum(1001);
		g1.setMembershipCost(20);
		g1.setPaymentFrequency(GymMembership.MONTHLY);

		System.out.println("Membership Number: " + g1.getMembershipNum());
		System.out.println("Membership cost: " + g1.getMembershipCost());
		System.out.println("Payment frequency: " + g1.getPaymentFrequency());
		
		GymMembership g2 = new GymMembership(1003, 30, GymMembership.YEARLY);
		System.out.println(g2);  // c2.toString()
		
		//Car c3 = new Car("Toyota", "G6", 2.2);
		//System.out.println(c3);  // c2.toString()
		
		//System.out.printf("\nNumber of car objects created: %d", Car.carCounter);

	}

}
