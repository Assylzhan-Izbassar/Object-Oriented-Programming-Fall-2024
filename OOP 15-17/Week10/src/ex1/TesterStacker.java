package ex1;

public class TesterStacker {

	public static void main(String[] args) {
		int[] buffer = new int[3];
		buffer[0] = 1;
		buffer[1] = 2;
		buffer[2] = 3;
		
		IntegerStacker intSt = new IntegerStacker(buffer);
		System.out.println(intSt.top);
		try {
			IntegerStacker cloned = (IntegerStacker) intSt.clone();
			intSt.print();
			
			
			cloned.print();
			cloned.buffer[1] = 10;
			cloned.top = 5;
			
			intSt.print();
			
			System.out.println(intSt.top);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
