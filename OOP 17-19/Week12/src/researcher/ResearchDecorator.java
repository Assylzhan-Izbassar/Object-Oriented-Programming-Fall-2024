package researcher;

public abstract class ResearchDecorator implements Researchable {
	protected Researchable ro;
	
	public ResearchDecorator(Researchable ro) {
		this.ro = ro;
	}
	
	public String doResearch(String prompt) {
		return this.ro.doResearch(prompt);
	}
}
