package ex2Practice3;

public class Mouse extends Animal {
	
	Mouse() {
		super();
	}
	
	Mouse(String name) {
		super(name);
	}

	@Override
	public void voice() {
		System.out.print("Pica");
	}

}
