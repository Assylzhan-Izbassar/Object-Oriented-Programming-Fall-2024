package example1;

public class Kazakhstan extends Country {

	public Kazakhstan(double area, String name) {
		super(area, name);
	}
	
	public Kazakhstan(double area, String name, int population) {
		super(area, name, population);
//		super(area, name);
//		super.setPopulation(population);
	}
	
	
//	@Override
//	public double currencyCount() {
//		return super.currencyCount() * (1.0 / 100.0);
//	}
}
