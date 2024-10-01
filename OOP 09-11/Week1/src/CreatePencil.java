
public class CreatePencil {

	public static void main(String[] args) {
		Pencil p1 = new Pencil();
		
		System.out.println(p1.color);
		
		Pencil p2 = new Pencil();
		
		p1.color = "blue";
		
		p1.numberOfPencils = 5;
		
		System.out.println(p1.color);
//		System.out.println(p1.numberOfPencils);
//		System.out.println(p2.numberOfPencils);
		System.out.println(Pencil.numberOfPencils);
//		System.out.print(p1.length);

	}

}
