package example1;

public class Country {
	private String name;
	private double area;
	private int population;
	
	public Country(double area, String name) {
		this.name = name;
		this.area = area;
	}
	
	public Country(double area, String name, int population) {
		this(area, name);
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public double getArea() {
		return area;
	}

	public int getPopulation() {
		return population;
	}
	
	public double currencyCount() {
		return 1e8 / 5000;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	@Override
	public String toString() {
		return this.name + " with area of " + this.area;
	}
}
