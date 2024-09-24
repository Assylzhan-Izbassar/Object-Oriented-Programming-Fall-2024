import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value:\n");
		int n = input.nextInt();
		int[] arr = new int[n];
		int[] copy = arr.clone();
//		int[] copy = new int[n];
		
		final double PI = 3.14;
		

		System.out.println(PI);
		
//		PI = 2.73;
		
		
		System.out.println(arr);
		System.out.println(copy);
		
		for(int i=0; i < arr.length; ++i) {
			if (i == n - 1) {
				System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + " ");
			}
		}
	
		copy[5] = 40;
		
		System.out.print("Copied array:\n");
		for(int i=0; i < copy.length; ++i) {
			if (i == n - 1) {
				System.out.println(copy[i]);
			} else {
				System.out.print(copy[i] + " ");
			}
		}
		
		for(int i=0; i < arr.length; ++i) {
			if (i == n - 1) {
				System.out.println(arr[i]);
			} else {
				System.out.print(arr[i] + " ");
			}
		}
	
		
//		System.out.println("The result is " + x * x);
		input.close();

		System.out.print("Program is ended.");
		
	}

}
