package example2;

public class Animal {
	String name;
	int weight;
	
	{
		this.name = "Sharik";
	}
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String voice() {
		return "<no voice>";
	}
	
	public String voice(int n) {
		StringBuilder s = new StringBuilder();
		
		for (int i = 0; i < n; ++i) {
			s.append(this.voice() + " ");
		}
		
		return s.toString();
	}
}
