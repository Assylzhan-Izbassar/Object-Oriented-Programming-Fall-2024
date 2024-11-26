package researcher;

public class Researcher extends User implements Researchable {

	@Override
	public String doResearch(String prompt) {
		return prompt + " cited!";
	}

}
