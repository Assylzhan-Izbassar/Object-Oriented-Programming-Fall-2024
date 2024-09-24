


public class Pencil {
	public String color = "red";
	public int length;
	public double diameter;
	private double price;
	
	public static long numberOfPencils = 0;
	
//	constructor
	public Pencil() {
		
	}
	
	public Pencil(String color) {
		this();
		this.color = color;
	}
	
	public Pencil(String color, int length) {
		this(color);
		this.length = length;
	}
	
	public void setPrice(float newPrice) {
		if (newPrice >= 0) {
			price = newPrice;	
		} else {
			System.out.println("The value of price cannot be less than zero!");
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getPrice(String currency) {
		if (currency.equals("USD")) {
			return price / 482;
		} else if (currency.equals("RUB")) {
			return price / 5.32;
		} else {
			return price;
		}
	}
	
//	public double getPrice(int t, String c) {
//		return 4.0;
//	}
//	
//	public double getPrice(String t, int c) {
//		return 4.0;
//	}
	
	public static void method1(int a) {
		a = 6;
	}
	
	public static void method2() {
		int b = 3;
		method1(b);
		
		System.out.println(b);
	}
	
}


