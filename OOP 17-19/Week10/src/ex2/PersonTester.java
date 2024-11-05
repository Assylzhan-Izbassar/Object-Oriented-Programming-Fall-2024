package ex2;

import java.util.Collections;
import java.util.Vector;
import ex3.PersonNameComparator;
import ex3.PersonHeightComparator;

public class PersonTester {

	public static void main(String[] args) {
		Person p1 = new Person("Arsen", 145);
		Person p2 = new Person("Magzhan", 157);
		Person p3 = new Person("Leila", 148);
		Person p4 = new Person("Katya", 149);
		
//		System.out.println(p2.compareTo(p2));
		
		Vector<Person> people = new Vector<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		
		for (Person p: people) {
			System.out.print(p.name + " " + p.height + " ");
		}
		System.out.println();
		
		Collections.sort(people, new PersonHeightComparator());
		
//		for (int i = 0; i < people.size(); ++i) {
//			for (int j = i+1; j < people.size(); ++j) {
//				if (people.elementAt(i).compareTo(people.elementAt(j)) == 1) {
//					Person x = people.elementAt(i);
//					people.set(i, people.elementAt(j));
//					people.set(j, x);
//				}
//			}
//		}
		
		for (Person p: people) {
			System.out.print(p.name + " " + p.height + " ");
		}
		System.out.println();
	}
}
