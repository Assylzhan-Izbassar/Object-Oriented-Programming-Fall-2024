package exam2;

public class AnimalTest {
	
	public static void main(String[] args) {
		Animal a = new Animal(Status.OK, 45);
		
		Dog rex = new Dog(Status.OK, 13);
		
		boolean aRes = a.crossTheBorder(rex);
		
		boolean bRes = rex.crossTheBorder(a);
		
		System.out.println(aRes + " " + bRes);
	}
}
