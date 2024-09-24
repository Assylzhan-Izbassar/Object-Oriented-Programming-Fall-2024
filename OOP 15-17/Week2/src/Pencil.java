
public class Pencil {
	public String color = "red";
	public int length;
	public double diameter;
	private double price;
	
	public static long numberOfPencils = 0;
	
	public void setPrice (float newPrice) {
		price = newPrice;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getPrice(String currency) {
		
		if (currency == "USD") {
			return price / 482;
		} else if (currency == "RUB") {
			return price / 5.4;
		} else {
			return price;
		}
	}
	
	public void method1(int a) {
		a = 6;
	}
	
//	public void method2() {
//		int b = 3;
//		method1(b);
//		
//		System.out.println(b);
//	}
//	
	
	public void method1(Student a) {
		a.setName("Asan");
	}
	
	public void method2() {
		Student b = new Student();
		b.setName("Usen");
		method1(b);
		
		System.out.println(b.getName());
	}
}
