package exam2;

public class Animal {
	
	public int weight;
	public Status docStatus;
	
	public Animal(Status docStatus, int weight) {
		this.weight = weight;
		this.docStatus = docStatus;
	}
	
	public boolean crossTheBorder(Animal a) {
		
		if (a instanceof Dog) {
			Dog rex = (Dog) a;
			System.out.println(rex.weight);	
		}
		
		return a.weight < 30 && a.docStatus == Status.OK;
	}
}
