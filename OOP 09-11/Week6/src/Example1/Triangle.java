package Example1;

public class Triangle extends Shape {
	
	private TriangleType type;
	private double a, b, c;
	
	{
		this.type = TriangleType.EqualSide;
	}
	
	public Triangle(int numOfCorners, double a) {
		super(numOfCorners);
		this.a = a;
	}
	
	public Triangle(int numOfCorners, double a, double b) {
		this(numOfCorners, a);
		this.type = TriangleType.EqualTwoSide;
	}
	
	public Triangle(int numOfCorners, TriangleType type, double a, double b, double c) {
		this(numOfCorners, a, b);
		this.type = type;
		this.c = c;
	}
	
	public TriangleType getType() {
		return this.type;
	}
	
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}
	
//	@Override
//	public double area() {
//		if (this.type == TriangleType.EqualSide) {
//			double height = Math.sqrt(2) * a;
//			return a * height / 2;
//		} 
//		
//		return 0.0;
//	}
//	
//	@Override
//	public double perimeter() {
//		if (this.type == TriangleType.EqualSide) {
//			return 3*a;
//		} 
//		return 0.0;
//		
//	}
	
	public double perimeter(boolean printType) {
		return 0.0;
	}

//	@Override
//	public double calcWidth(Shape s) {
//		
//		if (s instanceof Triangle) {
//			double width = type.equals(TriangleType.EqualSide) ? 3 * a : a + b + c;
//			return width;
//			
//		}
//		return 0.0;
//	}
	
}
