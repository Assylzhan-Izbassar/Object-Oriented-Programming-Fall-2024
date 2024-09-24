
public class CreatePencil { // Object.main();

	public static void main(String[] args) {
		Pencil p = new Pencil();
		Pencil p2 = new Pencil();
		
		Pencil.numberOfPencils = 10;
		
//		p.price = 10.0;
		
		p.setPrice(-10.0f);
		p2.setPrice(20.0f);
		
		System.out.println(Pencil.numberOfPencils);
		
		System.out.println(p2.getPrice());
		System.out.println(p2.getPrice("RUB"));
		
		Pencil.method2();
		
		Student.method2();
	}

}
