package ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class InteratorTest {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("1");
		arr.add("2");
		
		Iterator<String> it = ((ArrayList<String>)arr.clone()).iterator();
		
		arr.add("3");
		
		while(it.hasNext()) {
			String s = (String) it.next();
			
			System.out.println(s);
		}
	}

}
