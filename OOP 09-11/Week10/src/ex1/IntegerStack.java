package ex1;

public class IntegerStack implements Cloneable, Comparable {
	public int[] buffer;
	public int top;
	
	public IntegerStack(int[] buffer) {
		this.buffer = buffer;
		this.top = buffer[0];
	}
	
	public void setBuffer(int[] buffer) {
		for (int i=0; i < buffer.length; ++i) {
			this.buffer[i] = buffer[i];
		}
	}
	
	public void showBuffer() {
		for(int i=0; i < buffer.length; ++i) {
			System.out.print(buffer[i] + " ");
		}
		System.out.println();
	}
	
	public IntegerStack clone() throws CloneNotSupportedException {
//		IntegerStack t = new IntegerStack(new int[5]);
//		t.top = this.top;
//		t.buffer = this.buffer;
		
		IntegerStack temp = (IntegerStack) super.clone();
		
		int[] newBuffer = new int[this.buffer.length];
		
		for (int i=0; i < this.buffer.length; ++i) {
			newBuffer[i] = this.buffer[i];
		}
		
		temp.buffer = newBuffer;
		return temp;
	}
	
	public String toString() {
		return this.top + "";
	}
	

	@Override
	public int compareTo(Object o) {
		IntegerStack temp = (IntegerStack) o;
		
		int maxCount1 = 0;
		int maxCount2 = 0;
		
		for (int i = 0; i < this.buffer.length; ++i) {
			if (this.buffer[i] > temp.buffer[i]) {
				maxCount1++;
			}
		}
//		boolean isEqual = true;
		for (int i = 0; i < this.buffer.length; ++i) {
			if (this.buffer[i] < temp.buffer[i]) {
				maxCount2++;
			}
		}

		if (maxCount1 > maxCount2) {
			return 1;
		} else if (maxCount1 < maxCount2) {
			return -1;
		}
		return 0;
	}
}
