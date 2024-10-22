package bufferedEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBuffer {

	public static void main(String[] args) {
		
		String absPath = "C:\\Users\\a.izbassar\\Desktop\\Object-Oriented-Programming-Fall-2024\\OOP 15-17\\Week8\\src\\bufferedEx";
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader(absPath + "\\test.txt"));
			String line = bf.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bf.readLine();
			}
			
//			System.out.println(new Animal());
			
			bf.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
