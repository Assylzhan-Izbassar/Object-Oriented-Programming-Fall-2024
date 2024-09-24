package example2;

public class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public String voice() {
		return "gav";
	}
}
