package example2;

public class Triangle extends Shape {
	
	public double a;
	public double b;
	
	public Triangle (double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void draw() {
		System.out.println("Triangle with area: " 
			+ this.a * this.b);
	}
}
