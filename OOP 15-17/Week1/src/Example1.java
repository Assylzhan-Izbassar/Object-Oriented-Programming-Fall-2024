import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("Program is started...");
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
//		final double PI = 3.14;
		
//		PI = 2.73;
		x = 1;
		int y = 2*++x + 1 ;
		
		System.out.println(y);
		
		y = 2*x++ + 1;
		System.out.println(y);
		
		
		
//		int[] arr = new int[n];
//		
//		int[] copy = arr.clone();
		
//		System.out.print("Hello, world!\n");
//		System.out.println("Welcome to Java!");
		
//		System.out.println("Size of array: " + n);
		
//		System.out.println("Array: " + arr);
//		
//		for(int i=0; i < n; ++i) {
//			if (i != n-1) {
//				System.out.print(arr[i] + " ");
//			} else {
//				System.out.print(arr[i] + "\n");
//			}
//		}
//		
//		System.out.println("copied: " + copy);
//		copy[1] = 10;
//		
//		System.out.println("Copied array:");
//		for(int i=0; i < n; ++i) {
//			if (i != n-1) {
//				System.out.print(copy[i] + " ");
//			} else {
//				System.out.print(copy[i] + "\n");
//			}
//		}
//		
//		for(int i=0; i < n; ++i) {
//			if (i != n-1) {
//				System.out.print(arr[i] + " ");
//			} else {
//				System.out.print(arr[i] + "\n");
//			}
//		}
//		
		input.close();
		
		System.out.println("Program is ended.");
	}

}
