package ex3Practice4;

public class Rectangle extends Shape {

	Rectangle(int position, Color color) {
		super(position, color);
	}

	@Override
	public String symbol() {
		return (char) 9644 + "";
	}

}
