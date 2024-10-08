package Example1;

public class TestShapes {

	public static void main(String[] args) {
		
		Shape s = new Shape(4);
		Shape s2 = s;
		
		s2.setNumOfCorners(3);
		s2.t = new Test(5);
		
		System.out.println(s.equals(s2));
		System.out.println(s.t);
		System.out.println(s2.t);
		
//		Triangle t = new Triangle(3, 4);
//		
//		t.calcWidth(t);
//		
//		t.equals(t);
//		
//		Shape s = t; // widening
//		
//		if (s instanceof Triangle) {
//			Triangle t2 = (Triangle) s; // narrowing typecaste
//		}
	}

}
