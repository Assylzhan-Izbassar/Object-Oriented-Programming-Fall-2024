package models;

public class Body {
	private static long idNum;
	private String name = "<empty>";
	public static long nextId = 0;
	
	{
		Body.idNum = ++nextId;
	}
	
	public Body() {
	}
	
	public Body(String name) {
		if (this.validateName(name)) {
			this.name = name.trim();	
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (this.validateName(name)) {
			this.name = name.trim();	
		}
	}
	
	private boolean validateName(String name) {
		if (name.trim().length() > 3 && !(name.contains("3"))) {
			return true;
		}
		return false;
	}
	
	public static void circledWithPivot() {
		System.out.println("Body is circled.");
	}
	
	public long getIdNum() {
		return this.idNum;
	}
}
