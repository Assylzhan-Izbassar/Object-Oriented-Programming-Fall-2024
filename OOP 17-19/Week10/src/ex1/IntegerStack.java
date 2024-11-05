package ex1;

public class IntegerStack implements Cloneable {
	int[] buffer;
	int top;
	
	public IntegerStack(int[] buffer) {
		if (buffer.length > 0) {
			this.buffer = buffer;
			this.top = buffer[0];
		}
	}
	
	public void print() {
		for (int i = 0; i < this.buffer.length; ++i) {
			System.out.print(this.buffer[i] + " ");
		}
		System.out.println();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// version 1
//		int[] newBfRef = new int[this.buffer.length];
//
//		for (int i = 0; i < this.buffer.length; ++i) {
//			newBfRef[i] = this.buffer[i];
//		}
//		
//		IntegerStack refInSt = new IntegerStack(newBfRef);
//		return refInSt;
		
		// version 2
		IntegerStack refInSt = (IntegerStack) super.clone();
		int[] newBfRef = new int[this.buffer.length];

		for (int i = 0; i < this.buffer.length; ++i) {
			newBfRef[i] = this.buffer[i];
		}
		
		refInSt.buffer = newBfRef;
		return refInSt;
		
//		return super.clone(); // shallow

	}
}
