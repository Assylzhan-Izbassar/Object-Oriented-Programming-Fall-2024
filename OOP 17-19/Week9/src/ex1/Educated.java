package ex1;

public abstract interface Educated extends Moveable {
	public static final int PUPIL = 0;
	int BACHELOR = 1;
	int MASTER = 2;
	int PHD = 3;
	
	public abstract void setEducationLevel(int level);
	int getEducationLevel();
}
