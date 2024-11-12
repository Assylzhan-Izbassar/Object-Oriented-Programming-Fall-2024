package ex1;

public class PersonTester {
	public static void main(String[] args) {
		 
		Educated p = new Person(1);
		Person p2 = new Person(2);
		
		System.out.println(p.getEducatedLevel());
		
		System.out.println(((Person) p).compareTo(p2));
		
	}
}
