package tester;

import model.Student;
//import java.util.Scanner;
import static java.lang.Math.*;

public class CreateStudent {

	public static void main(String[] args) {
//		java.util.Scanner input = new java.util.Scanner(System.in);
		
		
		Student s = new Student("Magzhan"); 
		Student s2 = new Student(" "); 
		Student s3 = new Student("Abay", 5);
		
		
		double x = sqrt(1.41);

		System.out.println(x);
		System.out.println(s2.getName());
		System.out.println(s.getName());
		
		System.out.println(Student.studentCnt);

	}
}
