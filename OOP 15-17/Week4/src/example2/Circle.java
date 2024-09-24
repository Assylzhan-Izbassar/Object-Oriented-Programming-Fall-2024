package example2;

public class Circle extends Shape {
	public double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("Circle with area: " 
			+ this.calculateArea());
	}
	
	public double calculateArea() {
		return Math.PI * this.radius * this.radius;
	}
}
