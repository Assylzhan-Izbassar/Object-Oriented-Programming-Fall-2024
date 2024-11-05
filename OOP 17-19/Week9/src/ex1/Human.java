package ex1;

public class Human implements Educated, Comparable<Human> {
	
	private int educationLevel;
	
	public Human(int educationLevel) {
		this.educationLevel = educationLevel;
	}

	@Override
	public void setEducationLevel(int level) {
		this.educationLevel = level;
	}

	@Override
	public int getEducationLevel() {
		return this.educationLevel;
	}

	@Override
	public void move() {
	}

	@Override
	public int compareTo(Human o) {
		if (this.educationLevel > o.educationLevel) return 1;
		else if (this.educationLevel < o.educationLevel) return -1;
		return 0;
	}
}
