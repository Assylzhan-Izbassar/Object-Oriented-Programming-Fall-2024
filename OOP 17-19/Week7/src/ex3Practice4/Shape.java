package ex3Practice4;

public abstract class Shape {
	int position;
	Color color;
	
	Shape(int position, Color color) {
		this.position = position;
		this.color = color;
	}
	
	public abstract String symbol();
	
	public void draw() {
		for (int i = 0; i < this.position; ++i) {
			System.out.print(" ");
		}
		System.out.println(this.color.asciiCode + this.symbol());
	}
}
