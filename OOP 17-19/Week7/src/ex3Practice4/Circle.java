package ex3Practice4;

public class Circle extends Shape {

	Circle(int position, Color color) {
		super(position, color);
	}

	@Override
	public String symbol() {
		return (char)9679 + "";
	}

}