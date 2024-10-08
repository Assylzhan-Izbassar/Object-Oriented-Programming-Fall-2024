package example1;

public class Animal {
	public String name = "<empty>";
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.print(this.name + " is eating...");
	}
	
	public void areaAnimals(Animal a) {
		a.eat();
	}
}

