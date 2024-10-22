package ex2Practice3;

public abstract class Animal {
	String name;
	
	Animal() {
		
	}
	
	Animal(String name) {
		this.name = name;
	}
	
	public abstract void voice();
	
	public void voice(int n) {
		for(int i=0; i < n; ++i) {
			this.voice();
		}
	}
	
	public String toString() {
		return this.name;
	}
}
