package exam1;

public class ExtendShow extends SuperShow {
	public String str = "ExtendedStr"; 
	
	@Override
	public void show( ) { 
		System.out.println("Extend.show:" + str);
	}
}
