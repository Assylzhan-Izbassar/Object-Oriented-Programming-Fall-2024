package ex1;

public class IntegerStacker implements Cloneable {
	int[] buffer;
	int top;
	
	public IntegerStacker(int[] buffer) {
		this.buffer = buffer;
		this.top = buffer[0];
	}
	
	public void print() {
		for(int i=0; i < this.buffer.length; ++i) {
			System.out.print(this.buffer[i] + " ");
		}
		System.out.println();
	}
	
	public Object clone() throws CloneNotSupportedException {
		IntegerStacker newClone = (IntegerStacker) super.clone();
		int[] newRef = new int[this.buffer.length];
		
		for(int i=0; i < this.buffer.length; ++i) {
			newRef[i] = this.buffer[i];
		}
		newClone.buffer = newRef;
		
		return newClone;
	}
}
