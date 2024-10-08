package Ex2;

import java.util.HashSet;

public class TestGood {

	public static void main(String[] args) {
		
		HashSet<Good> hs = new HashSet<Good>();
		
		Good g1 = new Good();
		Good g2 = new Good();
		
		g1.x = 3;
		g2.x = 3;
		
		hs.add(g1);
		hs.add(g2);
		
		for(Good g: hs) {
			System.out.println(g);
		}
		
		System.out.println(g1.hashCode());
		System.out.println(g2.hashCode());
		
		System.out.println(g1.equals(g2));
	}

}
