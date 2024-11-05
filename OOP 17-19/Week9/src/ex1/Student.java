package ex1;

public class Student extends Human implements Passed {

	public Student(int educationLevel) {
		super(educationLevel);
	}

	@Override
	public boolean passMidterm() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean passEndterm() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean passFinal() {
		// TODO Auto-generated method stub
		return false;
	}

}
