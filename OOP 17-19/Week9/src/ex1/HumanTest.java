package ex1;

import java.util.Vector;

public class HumanTest {

	public static void main(String[] args) {
		
		Human h = new Human(Educated.PUPIL);
		
		Educated e = h;
		Moveable m = h;
		
		Vector<Moveable> people = new Vector<Moveable>();
		people.add(e);
		people.add(m);
		
		for(Moveable x: people) {
			if(x instanceof Human) {
				Human human = (Human) x;
				human.setEducationLevel(5);
				System.out.println(human.getEducationLevel());
			}
		}
	}

}
