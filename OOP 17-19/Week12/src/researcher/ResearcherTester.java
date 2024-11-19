package researcher;

public class ResearcherTester {

	public static void main(String[] args) {
		Researchable adam = new Researcher();
		
		adam = new StudentResearcher(adam);
		
		Student s = new Student();
		s.sr = adam;
	}

}
