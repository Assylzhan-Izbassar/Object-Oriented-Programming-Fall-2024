package ex1;

public class Person implements Educated, Cloneable {
	
	private static final long serialVersionUID = 1L;
	private int educatedLevel;
	Coordinate c;
	
	{
		this.educatedLevel = Educated.PUPIL;
	}
	
	public Person(int educatedLevel) {
		this.educatedLevel = educatedLevel;
	}

	@Override
	public void setEducatedLevel(int level) {
		this.educatedLevel = level;
	}

	@Override
	public int getEducatedLevel() {
		return this.educatedLevel;
	}

	public int getEducatedLevel(boolean val) {
		return this.educatedLevel;
	}

	@Override
	public int compareTo(Person o) {
		if (this.educatedLevel > o.educatedLevel) return 1;
		else if (this.educatedLevel < o.educatedLevel) return -1;
		return 0;
	}

	@Override
	public Coordinate move() {
		return new Coordinate(10, 6);
	}
	
	public Person clone() {
		return new Person(this.educatedLevel);
	}
}
