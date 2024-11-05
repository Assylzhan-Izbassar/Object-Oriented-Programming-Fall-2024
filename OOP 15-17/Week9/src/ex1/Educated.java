package ex1;

import java.io.Serializable;

public interface Educated extends Comparable<Person>, Serializable {
	int PUPIL = 0;
	int BACHELOR = 1;
	int MASTER = 2;
	int PHD = 3;
	
	void setEducationLevel(int level);
	int getEducationLevel();
	
	double testEducatedLevel();
	void move();
}
