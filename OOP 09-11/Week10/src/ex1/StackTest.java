package ex1;

public class StackTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		int[] integers = new int[4];
		integers[0] = 4;
		integers[1] = 6;
		integers[2] = 5;
		integers[3] = 6;
		
		IntegerStack t = new IntegerStack(integers);
		IntegerStack clone = t.clone();
		
		t.showBuffer();
		clone.showBuffer();
		
		int[] integers2 = new int[4];
		integers2[0] = 5;
		integers2[1] = 7;
		integers2[2] = 5;
		integers2[3] = 6;
		
		t.setBuffer(integers2);
//		t.buffer[2] = 3;
		
		t.showBuffer();
		clone.showBuffer();
		
		t.top = 3;
		clone.top = 2;
		
		System.out.println("Compare " + t.compareTo(clone));
		
		
		System.out.println(t);
		System.out.println(clone);
	}

}
