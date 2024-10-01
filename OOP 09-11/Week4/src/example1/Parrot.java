package example1;

public class Parrot extends Animal {
	
	{
		this.name = "Parrot P";
	}
	
	public Parrot(String name) {
		super(name);
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println(this.name + " go to fly!");
	}
}
