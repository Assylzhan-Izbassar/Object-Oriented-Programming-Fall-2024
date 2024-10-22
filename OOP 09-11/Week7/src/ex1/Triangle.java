package ex1;

public class Triangle extends Shape {
	
	int a, b, h;
	
	{
		a = 4;
		b = 5;
		h = 3;
	}

	public Triangle(Color color, int position) {
		super(color, position);
	}

	@Override
	public String figure() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a; ++i) {
			sb.append(this.shift());
			for (int j = 0; j < i; ++j) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}

//	@Override
//	public int symbol() {
//		return 9650;
//	}

}
