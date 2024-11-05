package ex3;

import java.util.Comparator;

import ex2.Person;

public class PersonHeightComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.compareTo(o2);
	}
	
}
