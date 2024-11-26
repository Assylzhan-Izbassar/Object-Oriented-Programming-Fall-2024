package ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class InteratorTest {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		a.add("3");
		
		ArrayList<String> copy = (ArrayList<String>) a.clone();
		
		Iterator<String> it = copy.iterator();
		
		a.add("4");
		
		while(it.hasNext()) {
			String str = (String) it.next();
			
//			if (str.equals("1")) {
////				a.set(2, "changed");
//				str = "changed";
//			}
			System.out.println("it: " + str);
		}
		
		for(String s: a) {
			System.out.println(s);
		}
 	}

}
