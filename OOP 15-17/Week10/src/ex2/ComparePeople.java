package ex2;

import java.util.Collections;
import java.util.Vector;
import ex3.PersonNameComparator;
import ex3.PersonHeightComparator;

public class ComparePeople {
	public static void main(String[] args) {
		
		Vector<Person> people = new Vector<Person>();
		Person p = new Person("Ruslan");
		Person p2 = new Person("Aslan");
		Person p3 = new Person("Madi");
		Person p4 = new Person("Saule");

		p.setHeight(158);
		p2.setHeight(156);
		p3.setHeight(152);
		p4.setHeight(168);
		
		
		people.add(p);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		
		for(Person t: people) {
			System.out.print(t.name + " ");
		}
		System.out.println();
		
		Collections.sort(people, new PersonNameComparator());
		
//		for (int i = 0; i < people.size(); ++i) {
//			for (int j = i + 1; j < people.size(); ++j) {
//				if (people.elementAt(i).compareTo(people.elementAt(j)) == -1) {
//					Person temp = people.elementAt(i);
//					people.set(i, people.elementAt(j));
//					people.set(j, temp);
//				}
//			}
//		}
		
		for(Person t: people) {
			System.out.print(t.name + " ");
		}
		System.out.println();
		
//		System.out.println(p.compareTo(p2));
	}
}
