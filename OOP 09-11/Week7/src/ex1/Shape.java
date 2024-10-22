package ex1;

public abstract class Shape {
	Color color;
	int position;

	
	public Shape(Color color, int position) {
		this.color = color;
		this.position = position;
	}
	
//	public abstract int symbol();
	
	public abstract String figure();
	
	public void draw() {
//		System.out.println(Character.toString((char)this.symbol()));
		System.out.println(this.figure());
	}
	
	protected String shift() {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < this.position; ++i) {
			sb.append(" ");
		}
		return sb.toString();
	}
	
}
