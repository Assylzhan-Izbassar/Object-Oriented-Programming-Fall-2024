package ex2;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println(X.val);
		System.out.println(Y.sum);
		System.out.println(Y.val);
		
		Z z = new Z();
		
		Z z2 = new Z();
		
		z = z2;
		
		System.out.println(((X)z).val);
	}

}
