package ex3Practice4;

public class Triangle extends Shape {

	Triangle(int position, Color color) {
		super(position, color);
	}

	@Override
	public String symbol() {
		return (char)9650 + "";
	}

}
