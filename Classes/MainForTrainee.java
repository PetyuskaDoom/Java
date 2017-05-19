package Classes;

public class MainForTrainee {

	public static void main(String[] args) {

		Trainee t1 = new Trainee();
		
		t1.setName("Tom Jones");
		t1.setAge(21);
		t1.setAddress("33 main St.");
		
		System.out.println("Trainee name : " + t1.getName());
		System.out.println("Trainee age : " + t1.getAge()); 
		System.out.println("Trainee address : " + t1.getAddress());
	}
}
