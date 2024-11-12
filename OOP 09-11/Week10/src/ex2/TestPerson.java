package ex2;

import java.util.Collections;
import java.util.Vector;

public class TestPerson {

	public static void main(String[] args) {
		Vector<Person> people = new Vector<Person>();
		
		Person p1 = new Person("A", 170.5);
		Person p2 = new Person("C", 150.5);
		Person p3 = new Person("B", 140.5);
		Person p4 = new Person("D", 166.5);
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		
		
		for(Person p: people) {
			System.out.print(p.name + " ");
		}
		System.out.println();
		
		Collections.sort(people, new PersonHeightComparator());
		
//		for (int i = 0; i < people.size(); ++i) {
//			for (int j = i; j < people.size(); ++j) {
//				if (people.elementAt(i).name.compareTo(people.elementAt(j).name) == -1) {
//					Person temp = people.elementAt(i);
//					people.set(i, people.elementAt(j));
//					people.set(j, temp);
//				}
//			}
//		}
		
		for(Person p: people) {
			System.out.print(p.name + " ");
		}
		System.out.println();
	}

}
