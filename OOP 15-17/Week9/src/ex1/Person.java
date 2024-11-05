package ex1;

public class Person implements Educated {
	
	private static final long serialVersionUID = 1L;
	private int educationLevel;
	
	public Person(int educationLevel) {
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
	public int compareTo(Person o) {
		if(this.educationLevel > o.getEducationLevel()) {
			return 1;
		} else if (this.educationLevel < o.getEducationLevel()) {
			return -1;
		}
		return 0;
	}

	@Override
	public double testEducatedLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

}
