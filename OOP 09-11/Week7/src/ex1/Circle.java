package ex1;

public class Circle extends Shape {
	
	int radius;

	public Circle(Color color, int position) {
		super(color, position);
	}
	
	public Circle(Color color, int position, int radius) {
		this(color, position);
		this.radius = radius;
	}

	@Override
	public String figure() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public int symbol() {
//		return 9679;
//	}

}
