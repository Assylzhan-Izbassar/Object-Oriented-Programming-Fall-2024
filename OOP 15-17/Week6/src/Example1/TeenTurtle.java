package Example1;

import java.util.Objects;

public class TeenTurtle extends Mutant {
	
	private String weapon;
	
	{
		super.setMutatedAnimal("Turtle");
		this.weapon = "Wood";
	}

	public TeenTurtle(Color color) {
		super(color);
	}
	
	public TeenTurtle(Color color, String weapon) {
		this(color);
		this.weapon = weapon;
	}

	@Override
	public int attack() {
		if (!this.weapon.equals("")) {
			return 20;
		}
		return 10;
	}
	
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	@Override
	public void activateSuperPower() {
		this.weapon += " x2";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.weapon);
	}
	
	
	@Override
	public boolean equals(Object o) {
		// checking by null and type
		if ((o == null) || !o.getClass().equals(this.getClass())) {
			return false;
		}
		
		// typecasting
		TeenTurtle t = (TeenTurtle) o;
		
		// comparing
		return this.weapon.equals(t.weapon);
	}
	
	

}
