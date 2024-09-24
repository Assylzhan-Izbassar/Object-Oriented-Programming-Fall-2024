package example1;

public class TestCountries {

	public static void main(String[] args) {
		Kazakhstan k = new Kazakhstan(2.73, "Kazakhstan");
		System.out.println(k.getName());
		
		k.equals(k);
		k.toString();
		
		Country c = new Country(0.32, "Italy");
		
		System.out.println(k.currencyCount());
		System.out.println(c.currencyCount());
	}
	
	
}
