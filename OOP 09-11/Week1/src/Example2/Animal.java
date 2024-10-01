package Example2;

public class Animal {
	public String size = "Little";
	public String color;
	private String voice;
	private String type;
	public String[] meals;
	
	// initialization block
	{
		voice = "...";
		type = "mammels";
	}
	
	// constructor
	public Animal() {
		
	}

	// constructor
	public Animal(String color) {
		this.color = color;
	}
	
	public Animal(String color, String type) {
		this(color);
//		color = newColor;
		this.type = type;
	}
	
	public void setVoice(String newVoice) {
		voice = newVoice;
	}
	public String getVoice() {
		return voice;
	}
	
	public void setType(String newType) { 
		type = newType;
	}
	public String getType() {
		return type;
	}
	
	public String eat() {
		return meals[0];
	}
	
	public String eat(int todaysWish) {
		return meals[todaysWish];
	}
	
	// overloading
	public void move() {
		System.out.println("Animal is moving");
	}
	
	public void move(String behevior) {
		System.out.println("Animal is moving like " + behevior);
	}

}
