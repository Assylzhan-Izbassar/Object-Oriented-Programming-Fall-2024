package example1;

public class Kuala extends Animal {
	
	private String claw;
	
	{
		this.name = "Kuala Kim";
	}
	
	public Kuala(String name) {
		super(name);
	}
	
	public Kuala(String name, String claw) {
		this(name);
		this.claw = claw;
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("Then, immidiatly sleeping...");
	}
	
	// Overloading
	public void eat(int countOfGrass) {
		System.out.println(this.name + " " + "eating " + countOfGrass + " grasses.");
	}
	
	public void treeClimb() {
		System.out.println(this.name + " is climbing...");
	}
	
	public String getClaw() {
		return this.claw;
	}
}