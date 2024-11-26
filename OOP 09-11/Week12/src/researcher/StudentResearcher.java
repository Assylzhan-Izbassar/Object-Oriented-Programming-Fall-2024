package researcher;

public class StudentResearcher extends ResearcherDecorator {

	public StudentResearcher(Researchable simpleResearcher) {
		super(simpleResearcher);
	}

	@Override
	public String doResearch(String prompt) {
		return prompt + " cited by Student!";
	}

}
