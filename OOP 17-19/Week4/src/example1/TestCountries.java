package example1;

public class TestCountries {

	public static void main(String[] args) {
		Kazakhstan k = new Kazakhstan(2.73, "Kazakhstan");
		System.out.println(k.getName());
		
		k.equals(k);
		k.toString();
		
		Country c = new Country(0.32, "Italy");
		Country l = new Kazakhstan(2.73, "Kazakh Land");
		
		System.out.println(k.currencyCount());
		System.out.println(c.currencyCount());
		System.out.println(l.currencyCount());
	}
	
	
}
