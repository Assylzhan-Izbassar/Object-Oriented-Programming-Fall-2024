package researcher;

public abstract class ResearcherDecorator implements Researchable {
	protected final Researchable simpleResearcher;
	
	public ResearcherDecorator(Researchable simpleResearcher) {
		this.simpleResearcher = simpleResearcher;
	}
	
}
