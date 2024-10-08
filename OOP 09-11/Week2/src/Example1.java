import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("Initialize...");
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.println("Our summation is " + (x + y));
		
		// conditional statements
		if (x > 0) {
			System.out.print("Positive: " + x);
		} else if (x < 0) {
			System.out.print("Negative: " + x);
		} else {
			System.out.print("Zero");
		}
		System.out.println();
		
		
		for(int i=0; i < 10; i = i + 1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int[] array = new int[10];
		
		array[0] = 1;
		
		for(int i=0; i < array.length; i = i + 1) {
			System.out.print(array[i] + " ");
		}
		
	
		
		input.close();
		System.out.println("End of the program.");
	}

}
