package ex2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFile {

	public static void main(String[] args) {
		String absPath = "C:\\Users\\a.izbassar\\Desktop\\Object-Oriented-Programming-Fall-2024\\OOP 09-11\\Week7\\src\\ex2";
		
		
		
		
		try {
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			String line = in.readLine();
			
			System.out.println(line);
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream(absPath + "\\input.txt");
			System.out.println(fis.read());
			
			byte[] b = fis.readAllBytes();
			char[] c = new String(b, "UTF-8").toCharArray();
			for(char x: c) {
				System.out.print(x);
			}
			
			DataInputStream dis = new DataInputStream(fis);
			byte[] d = dis.readAllBytes();
			System.out.println(d);
			
			fis.close();
			
			FileOutputStream fos = new FileOutputStream(absPath + "\\output.txt");
			fos.write(b);
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
