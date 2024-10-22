package ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestIO {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String s1 = in.readLine();
			String s2 = in.readLine();
			
			System.out.println(s1);
			System.out.println(s2);
			
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
