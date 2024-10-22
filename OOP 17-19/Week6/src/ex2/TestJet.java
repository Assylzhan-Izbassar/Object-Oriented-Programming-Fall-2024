package ex2;

import java.util.HashSet;

public class TestJet {

	public static void main(String[] args) {
		
		HashSet<Jet> jets = new HashSet<Jet>();
		
		Jet j1 = new Jet(500);
		Jet j2 = new Jet(500);
		
		jets.add(j1);
		jets.add(j2);
		
		System.out.println("Jets:");
		
		for(Jet j: jets) {
			System.out.println(j);
		}
		
		boolean isEql = j1.equals(j2);
		
		System.out.println(isEql);
		
		System.out.println(j1.hashCode());
		System.out.println(j2.hashCode());
	}

}
