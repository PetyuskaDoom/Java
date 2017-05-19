package Classes;

public class Car {
	
	private String make;
	private String model;
	private double engineSize;
	public static int carCounter;
	
	public Car() {
		carCounter++;
	}
	
	public Car (String make, String model, double engineSize) {
		
		this();
		setMake(make);
		setModel(model); // this.model = model;
		setEngineSize(engineSize);
	}
	
	public void setMake(String make) {
		
		switch (make) {
			case "Audi": 
			case "Toyota":
			case "Mitsubishi":
			case "Ford":
			case "Honda":
			case "Alpha Romeo":
			case "BMW":
			case "Mercedes":
			case "Volkswagen":
			case "Opel":
				this.make = make;
				break;
			default:
				System.out.println(make + " is not a valid make");
				break;
		}
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setEngineSize(double engineSize) {
		if (engineSize >= 1 && engineSize <= 2.3)
			this.engineSize = engineSize;
		else 
			System.out.println(engineSize + " is not a valid engine size");
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getEngineSize() {
		return engineSize;
	}

	public String toString() {
		return "\nMake: " + make +
				"\nModel: " + model + 
				"\nEngine size: " + engineSize;
	}
}
