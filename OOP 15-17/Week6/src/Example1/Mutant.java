package Example1;

public abstract class Mutant {
	private Color color;
	private String mutatedAnimal;
	private int power;
	
	{
		this.power = 10;
	}
	
	public Mutant(Color color) {
		this.color = color;
	}
	
	public abstract int attack();
	
//	public int attack() {
//		int rand = (int) (Math.random() / 10);
//		return this.power * rand;
//	}
	
	public void activateSuperPower() {
		this.power *= 10;
	}

	public Color getColor() {
		return color;
	}

	public String getMutatedAnimal() {
		return mutatedAnimal;
	}
	
	public void setMutatedAnimal(String mutatedAnimal) {
		this.mutatedAnimal = mutatedAnimal;
	}
}
