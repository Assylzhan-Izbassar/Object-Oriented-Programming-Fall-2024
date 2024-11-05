package ex2;

public class Person implements Comparable<Person> {
	String name;
	int height;
	
	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getHeight() {
		return this.height;
	}

	@Override
	public int compareTo(Person o) {
		if (this == o) return 0;
		
		if (this.height > o.height) {
			return 1;
		} else if (this.height < o.height) {
			return -1;
		}
		return 0;
//		return this.name.compareTo(o.name);
	}
}
