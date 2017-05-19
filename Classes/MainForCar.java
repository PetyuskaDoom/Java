package Classes;

public class MainForCar {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		c1.setMake("Audi");
		c1.setModel("XX");
		c1.setEngineSize(2.2);

		System.out.println("Make :" + c1.getMake());
		System.out.println("Model: " + c1.getModel());
		System.out.println("Engine size: " + c1.getEngineSize());
		
		Car c2 = new Car("BMW", "A4", 2.0);
		System.out.println(c2);  // c2.toString()
		
		Car c3 = new Car("Toyota", "G6", 2.2);
		System.out.println(c3);  // c2.toString()
		
		System.out.printf("\nNumber of car objects created: %d", Car.carCounter);
	}
}
