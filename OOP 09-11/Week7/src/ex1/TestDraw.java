package ex1;

public class TestDraw {
	
	public static final String ANSI_GREEN = "\u001B[32m";
	

	public static void main(String[] args) {
		
		int pos = 10;
		int c = 9650;
		String s = Character.toString((char)c);
		
		for(int i=0; i < pos; ++i) {
			System.out.print(" ");
		}
		System.out.println(s + TestDraw.ANSI_GREEN);
		System.out.println("Test" + TestDraw.ANSI_GREEN);
	}

}
