package example2;

import java.util.*;

public class TestAnimal {

	public static void main(String[] args) {
		Animal a = new Animal("Alex");
		Dog d = new Dog("Timmy");
		
//		System.out.println(a.voice(10));
//		System.out.println(d.voice(10));
		
		Animal b = d;
		Animal t = new Animal("Bobby");
		
		Vector<Animal> v = new Vector<Animal>();
		
		v.add(a);
		v.add(d);
		v.add(b);
		v.add(t);
		
		for (int i = 0; i < v.size(); ++i) {
			System.out.println(v.elementAt(i).name);
//			System.out.println(v.elementAt(i).voice());
		}
		
		
//		System.out.println(b.voice());
	}

}
