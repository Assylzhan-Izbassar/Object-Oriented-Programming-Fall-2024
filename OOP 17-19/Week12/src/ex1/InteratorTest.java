package ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class InteratorTest {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		a.add("1");
		a.add("2");
		
		Iterator<String> it = ((ArrayList<String>)a.clone()).iterator();
		
		a.add("4");
		
		while(it.hasNext()) {
			String s = (String) it.next();
			
			if (s.equals("1")) {
				a.set(1, "changed");
			}
			
			System.out.println(s);
		}
		
		System.out.println("Initial array: ");
		
		for (String s: a) {
			System.out.println(s);
		}
	}

}
