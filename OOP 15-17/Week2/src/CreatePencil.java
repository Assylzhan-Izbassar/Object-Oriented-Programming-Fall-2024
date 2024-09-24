
public class CreatePencil {

	public static void main(String[] args) {
		Pencil p1 = new Pencil();
//		p.price = 0.5f;
		p1.setPrice(10000f);
		
		Pencil p2 = new Pencil();
		p2.numberOfPencils = 1;
		
		
		System.out.println(p1.numberOfPencils);
		
		System.out.println(p1.getPrice());
		
		System.out.println(p1.getPrice());
		System.out.println(p1.getPrice("USD"));
		
		System.out.println("The value of b = ");
		p1.method2();
	}

}
