package Example2;

public class CreateAnimal {

	public static void main(String[] args) {
		Animal tiger = new Animal("orange");
		
//		tiger.color = "orange";
//		tiger.setVoice("Ahh!");
		System.out.println(tiger.getVoice());
		
		tiger.meals = new String[5];
		tiger.meals[0] = "Meat";
		tiger.meals[1] = "Fish";
		
		System.out.println(tiger.eat());
		tiger.move();
		tiger.move("tip top!");
		
		System.out.println(tiger.eat(1));
	}

}
