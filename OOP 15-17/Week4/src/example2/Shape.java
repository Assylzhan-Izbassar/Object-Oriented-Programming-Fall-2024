package example2;

public class Shape {
	protected double area;
	protected double perimeter;
	
	public Shape() {
		this.area = 0.0;
		this.perimeter = 0.0;
	}
	
	public void draw() {
		System.out.println("Abstract shape...");
	}
}
