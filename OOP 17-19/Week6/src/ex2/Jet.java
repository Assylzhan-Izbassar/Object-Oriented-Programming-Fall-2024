package ex2;

import java.util.Objects;

public class Jet {
	private double speed;
	
	public Jet(double speed) {
		this.speed = speed;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.speed);
	}
	
	@Override
	public boolean equals(Object obj) { // widening jet -> object (child -> parent)
		if (obj == this) return true;
		if ((obj == null) || (this.getClass() != obj.getClass())) return false;
		
		// narrowing object -> jet (parent -> child)
		Jet j = (Jet) obj;
		
		return this.speed == j.speed;
	}
	
	@Override
	public String toString() {
		return this.speed + "";
	}
}
