
public class CreateStudent {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Kiori");
		
		Student s2 = new Student("Saule");
		
		Student s3 = new Student("Ospan");
		
//		System.out.println(s.getName());
		System.out.println(s2.getName());
		
		
		System.out.println(s2.getStudentId());
		System.out.println(s3.getStudentId());
		
		System.out.println(s3);
	}

}
