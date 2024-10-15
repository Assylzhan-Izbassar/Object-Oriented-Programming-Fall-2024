package ex3Practice4;

import java.util.Vector;

public class ShapeTester {

	public static void main(String[] args) {
		Triangle t = new Triangle(7, Color.BLUE);
		Circle c = new Circle(13, Color.RED); 
		Circle c2 = new Circle(3, Color.GREEN); 
		
		Vector<Shape> shapes = new Vector<Shape>();
		
		shapes.add(t);
		shapes.add(c);
		shapes.add(c2);
		
		// for each
		for(Shape x: shapes) {
			x.draw();
		}
	}

}
