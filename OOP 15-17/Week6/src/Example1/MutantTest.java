package Example1;

import java.util.Vector;

public class MutantTest {

	public static void main(String[] args) {
//		Mutant mike = new Mutant(Color.GREEN);
		
		Vector<Mutant> v = new Vector<Mutant>();
		TeenTurtle t = new TeenTurtle(Color.BLUE);
		Mutant leo = t;
		v.add(t);
		v.add(leo);
		
		
		if (leo instanceof TeenTurtle) {
			TeenTurtle t2 = (TeenTurtle) leo;
		}
		
		
		
		
		TeenTurtle t2 = new TeenTurtle(Color.BLUE);
		t2.setWeapon("Suriken");
		System.out.println(t.hashCode());
		System.out.println(t2.hashCode());
		
	}

}
