package Example1;

public class Shape {
	private int numOfCorners;
	public Test t;
	
	{
		t = new Test(4);
	}
	
	public Shape(int numOfCorners) {
		this.numOfCorners = numOfCorners;
	}
	
	// area
//	public abstract double area();
	
//	// perimeter
//	public abstract double perimeter();
//	
//	// calculate width of the shape
//	public abstract double calcWidth(Shape s);
	
	public int getNumOfCorners() {
		return numOfCorners;
	}
	
	public void setNumOfCorners(int numOfCorners) {
		this.numOfCorners = numOfCorners;
	}
	
	@Override
	public boolean equals(Object o) {
		if ((o == null) || o.getClass() != this.getClass()) {
			return false;
		}
		
		Shape s = (Shape) o;
		
		return this.numOfCorners == s.numOfCorners;
	}
	
	
}
