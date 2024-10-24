package example2;

import java.util.*;

public class TestShape {
	
	public static void main (String[] args) {
		
		Circle c = new Circle(5.5f);
		Shape s = c;
		Shape s2 = new Shape();
		Triangle t = new Triangle(3.4f, 4.5f);
		
		Vector<Shape> v = new Vector<Shape>();
		
		System.out.println(((Circle) s).calculateArea());
		
		v.add(c);
		v.add(s);
		v.add(s2);
		v.add(t);

		for(int i=0; i < v.size(); ++i) {
			v.elementAt(i).draw();
		}
	}
}
