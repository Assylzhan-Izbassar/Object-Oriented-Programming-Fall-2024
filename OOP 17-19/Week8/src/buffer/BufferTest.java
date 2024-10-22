package buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferTest {

	public static void main(String[] args) {
		
		String absPath = "C:\\Users\\a.izbassar\\Desktop\\Object-Oriented-Programming-Fall-2024\\OOP 17-19\\Week8\\src\\buffer";
		
		FileReader fr;
		try {
			fr = new FileReader(absPath + "\\test.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String s = br.readLine();
			
			while(s != null) {
				System.out.print("Next line...");
				System.out.println(s);
				s = br.readLine();
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
