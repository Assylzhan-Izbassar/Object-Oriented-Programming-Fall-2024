package ex3;

import java.util.Vector;

public class Plan extends Idea {
	
	private Vector<String> steps;
	
	public Plan(String description) {
		super(description);
	}
	
	public Plan(String description, Vector<String> steps) {
		this(description);
		this.steps = steps;
	}

	public Vector<String> getSteps() {
		return steps;
	}

	public void setSteps(Vector<String> steps) {
		this.steps = steps;
	}

	@Override
	public boolean realize() {
		for(String step: this.steps) {
			if(step.equals("")) return false;
			System.out.println(step);
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Plan is completed!";
	}

}
