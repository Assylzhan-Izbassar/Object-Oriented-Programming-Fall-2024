package researcher;

public class StudentResearcher extends ResearchDecorator {

	public StudentResearcher(Researchable ro) {
		super(ro);
	}
	
	public String doResearch(String prompt) {
		return super.doResearch(prompt) + " made by student";
	}

}
