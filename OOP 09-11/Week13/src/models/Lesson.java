package models;

import java.util.SortedSet;

public class Lesson {
	private Teacher teacher;
	private Course course;
	
	private SortedSet<Student> students;
	
	public Lesson(Teacher teacher, Course course) {
		this.setTeacher(teacher);
		this.setCourse(course);
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public SortedSet<Student> getStudents() {
		return students;
	}

	public void setStudents(SortedSet<Student> students) {
		this.students = students;
	}
}
