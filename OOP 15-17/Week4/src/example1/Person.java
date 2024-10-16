package example1;

public class Person {
	private String name;
	
	public Person() {
		this.name = "<empty>";
	}
	
	public Person(String name) {
		this();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void move() {
		System.out.println(this.getName() + " is moving...");
	}
	
	public void move(double speed) {
		if (speed >= 3.5) {
			System.out.println(this.getName() + " is running...");
		} else {
			this.move();
		}
	}
}