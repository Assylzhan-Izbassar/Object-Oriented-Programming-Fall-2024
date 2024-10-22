package exceptions;

public class TestException {

	public static void main(String[] args) throws ArithmeticException {
		
		int x = 5;
		
		for (int i = 10; i >= 0; --i) {
			if (i == 0) {
				throw new ArithmeticException("i cannot be zero!");
			}
			
			int y = x / i;
			
			System.out.println(y);
//			try {
//				y = x / i;
//			} catch (ArithmeticException e) {
//				System.err.println("Divide by zero!");
//			} finally {
//				System.out.println(y);
//			}
	
		}
		System.out.println("Endline!");
	}

}
