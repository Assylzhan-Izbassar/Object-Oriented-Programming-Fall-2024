package ex2;

public class Person implements Comparable {
	public String name;
	public double height;
	
	{
		this.height = 168;
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public int compareTo(Object o) {
		if (o == null) return 1;
		if (!(o instanceof Person)) return 1;
		Person p = (Person) o;
		
		if (this.height > p.height) {
			return 1;
		} else if (this.height < p.height) {
			return -1;
		}
		return 0;
	}
}
