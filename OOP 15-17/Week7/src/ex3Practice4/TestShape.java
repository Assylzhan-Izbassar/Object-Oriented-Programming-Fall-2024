package ex3Practice4;

import java.util.Vector;

public class TestShape {

	public static void main(String[] args) {
		Shape s = new Rectangle(10, Color.RED);
		Shape o = new Circle(5, Color.YELLOW);
		
		Vector<Shape> v = new Vector<Shape>();
		v.add(s);
		v.add(o);
		
		for(Shape x: v) {
			x.draw();
		}
				
		System.out.println(Color.RED.asciiCode + "Hello, world");
	}

}
