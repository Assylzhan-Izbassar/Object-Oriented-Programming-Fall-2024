package ex2;

import java.util.Vector;

public class TestLiveInEarth {
	public static void main(String[] args) {
		Vector<Breathable> liveInEarth = new Vector<Breathable>();
		
		Breathable john = new Human("John");
		Ameba bob = new Ameba(3);
		
		liveInEarth.add(bob);
		liveInEarth.add(john);
		
		for (Breathable b: liveInEarth) {
			System.out.println(b);
		}
	}
}
