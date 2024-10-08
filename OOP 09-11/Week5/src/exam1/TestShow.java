package exam1;

public class TestShow {

	public static void main(String[] args) {	
		ExtendShow ex = new ExtendShow();
		SuperShow sup = ex;
		
//		SuperShow sup = new ExtendShow();
		
		sup.show();
		ex.show();
		
		System.out.println(sup.str);
		System.out.println(ex.str);
		
	}

}
