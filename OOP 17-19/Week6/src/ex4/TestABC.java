package ex4;

import java.util.Vector;

public class TestABC {
	public static void main(String[] args) {
		
		Vector<A> v = new Vector<A>();
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		A a2 = b; // widening
		A a3 = c;
		
		v.add(a);
		v.add(b);
		v.add(c);
		v.add(a2);
		v.add(a3);
		
		for(A x: v) { // polymorphism example
			x.call(); // narrowing conv.
		}
	}
}
