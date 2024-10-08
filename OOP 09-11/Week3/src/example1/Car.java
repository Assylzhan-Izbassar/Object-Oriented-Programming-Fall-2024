package example1;

public class Car {
	
//	private String color;
	public static String color;
	private String typeOfEngine;
	public static int soldCars = 0;
	
	public int numberOfLetter;
	
	// Initialization block
	static {
		Car.color = "Black";
		Car.soldCars++;
	}
	
	// Constructor
//	public Car() {
//	}
	
//	public Car(String color) {
//		this();
//		this.color = color;
//	}
	
	public Car(String color, String typeOfEngine) {
		if(this.validateColor(color)) {
			this.color = color;	
		}
//		this(color);
		this.typeOfEngine = typeOfEngine;
	}
	
	
	
	// Overloading
	public String getColor(String newValue) {
		return this.color;
	}
	
	public String getTypeOfEngine() {
		return this.typeOfEngine;
	}
	public void setTypeOfEngine(String typeOfEngine) {
		// Validation
		if (typeOfEngine.length() > 3) {
			this.typeOfEngine = typeOfEngine;
		} else {
			System.err.println("Your lenght of value must be more than 3!");
		}
	}
	
	public String getColor(int standard) {
		if (standard == 1) {
			return this.color;
		} else {
			return this.color + " in diff. format";
		}
	}
	
	
	public static void method1(Car c1) {
		c1.setTypeOfEngine("Mersedes Engine");
	}
	
	public static void method2() {
		Car c2 = new Car("Black", "BMW Engine V5");
		
		c2.setTypeOfEngine("BMW New Engine");
		Car.method1(c2);
		
		System.out.println(c2.getTypeOfEngine());
	}
	
	private boolean validateColor(String color) {
		if(color.equals("")) {
			return false;
		}
		return true;
	}
}
