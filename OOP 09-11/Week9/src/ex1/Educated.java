package ex1;

import java.io.Serializable;

public abstract interface Educated extends Comparable<Person>, Serializable, Moveable {
	public static final int PUPIL = 0;
	int BACHELOR = 1;
	int MASTER = 2;
	int PHD = 3;
	
	
	public abstract void setEducatedLevel(int level);
	int getEducatedLevel();

	
}
