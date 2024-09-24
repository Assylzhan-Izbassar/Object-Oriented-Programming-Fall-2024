package tester;
import model.Circle;

public class CreateCircle {

	public static void main(String[] args) {
		Circle c = new Circle(2.5f);
		Circle c2 = new Circle(0.0f);
		
		c2.setRadius(c.getRadius() + 0.8f);
		
		System.out.println(c.getRadius());
		
//		c2.setRadius(3.0f);
		
		System.out.println(c2.getRadius());
	}

}
