package ex1;

import java.util.Vector;

public class TestShape {

	public static void main(String[] args) {
//		Shape s = new Circle(Color.RED, 12);
		Shape t = new Triangle(Color.RED, 5);
		
		Vector<Shape> shapes = new Vector<Shape>();
		
//		shapes.add(s);
		shapes.add(t);
		
		for(Shape x: shapes) {
			x.draw();
		}
	}

}
