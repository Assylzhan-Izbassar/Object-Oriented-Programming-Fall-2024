package bufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBuffer {

	public static void main(String[] args) {
		String absPath = "C:\\Users\\a.izbassar\\Desktop\\Object-Oriented-Programming-Fall-2024\\OOP 09-11\\Week8\\src\\bufferedReader";

		try {
			BufferedReader bf = new BufferedReader(new FileReader(absPath + "\\a.txt"));
			
			String bfText = bf.readLine();
			
			while(bfText != null) {
				System.out.print("Reading...");
				System.out.println(bfText);
				bfText = bf.readLine();
				
			}
			
			bf.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

}
