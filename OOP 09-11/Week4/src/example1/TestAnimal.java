package example1;

import java.util.Vector;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a = new Animal("Tiger");
		
//		a.eat();
		
		Kuala k = new Kuala("Bob");
		
//		k.eat();
		
		Animal b = new Kuala("Mike");
		Animal d = new Parrot("Tukan");
		
//		b.eat();
//		d.eat();
		
		Vector<Animal> animals = new Vector<Animal>();
		
		animals.add(b);
		animals.add(d);
		animals.add(k);
		animals.add(a);
		
		for(int i=0; i < animals.size(); ++i) {
			animals.elementAt(i).eat();
		}
		
		for(int i=0; i < animals.size(); ++i) {
			System.out.println(animals.elementAt(i).name);
		}
		
		b.areaAnimals(k);
		
	}

}
