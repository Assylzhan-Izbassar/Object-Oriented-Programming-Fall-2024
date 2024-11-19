package researcher;

public abstract class ResearcherDecorator implements Researchable {
	protected Researchable rb;
	
	public ResearcherDecorator(Researchable rb) {
		this.rb = rb;
	}
}
