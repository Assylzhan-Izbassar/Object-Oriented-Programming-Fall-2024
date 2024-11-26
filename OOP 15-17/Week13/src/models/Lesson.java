package models;

import java.util.Date;
import java.util.SortedSet;

public class Lesson {
	private Teacher teacher;
	private Course course;
	private SortedSet<Student> students;
	private Date startHour;
	private Date endHour;
	private LessonType type;
	
	public Teacher getTeacher() {
		return teacher;
	}

	public Course getCourse() {
		return course;
	}

	public SortedSet<Student> getStudents() {
		return students;
	}

	public Date getStartHour() {
		return startHour;
	}
	
	public void setStartHour(Date startHour) {
		this.startHour = startHour;
	}
	
	public Date getEndHour() {
		return endHour;
	}
	
	public void setEndHour(Date endHour) {
		this.endHour = endHour;
	}

	public LessonType getType() {
		return type;
	}
	
	
}
