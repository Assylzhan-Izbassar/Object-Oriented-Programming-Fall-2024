package exception;

public class ExceptionTest {

	public static void main(String[] args) throws ArithmeticException {
		
		int x = 100;
		
		for (int i = -5; i <= 5; ++i) {
			
			if (i == 0) {
				throw new ArithmeticException("Divide by zero!");
			}
			int y = x / i;
			System.out.println(y);
//			try {
//				int y = x / i;
//				
//				System.out.println(y);
//			} catch (ArithmeticException e) {
//				System.err.println("Divide by zero!");
//			}
		}
	}

}
