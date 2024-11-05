package ex4;


public class TestA {

	public static void main(String[] args) {
		A a = new A();
		
		int t = a.VAL;
		int k = ((X)a).VAL;
		
		System.out.println(t + " " + k);
	}

}
