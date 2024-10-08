package ex3;

public abstract class Idea {
	private String description;
	
	public Idea(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract boolean realize();
	
	@Override
	public String toString() {
		return this.description;
	}
}
