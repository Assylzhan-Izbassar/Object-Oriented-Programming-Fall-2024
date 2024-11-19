package ex2;

import java.util.Comparator;

public class PersonHeightComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return Double.compare(o1.height, o2.height);
	}
	
}
