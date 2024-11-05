package ex1;

public class IntegerTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		int[] buffer = new int[4];
		buffer[0] = 10;
		buffer[1] = 4;
		buffer[2] = 76;
		buffer[3] = 32;
		
		IntegerStack original = new IntegerStack(buffer);
		IntegerStack clone = (IntegerStack) original.clone();
		
		clone.print();
		
		clone.top = 78;
		clone.buffer[2] = 104;
	
		original.print();
		
		System.out.println(clone.top);
		System.out.println(original.top);
	}

}
