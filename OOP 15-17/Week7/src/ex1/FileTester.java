package ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTester {
	
	public static void main(String[] args) {
		String path = "C:\\Users\\a.izbassar\\Desktop\\Object-Oriented-Programming-Fall-2024\\OOP 15-17\\Week7\\src\\ex1";
		try {
			FileInputStream infile = new FileInputStream(path + "\\input.txt");
			
			byte[] b = infile.readAllBytes();
			
			String s = new String(b, "UTF-8");
			for(byte x: b) {
				System.out.print(x + " ");
			}
			System.out.println();
			System.out.println(s);
		
			infile.close();
			
			String message = "Our message";
			byte[] mgsByte = message.getBytes();
			
			FileOutputStream outfile = new FileOutputStream(path + "\\output.txt");
			outfile.write(mgsByte);
			outfile.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}
}
