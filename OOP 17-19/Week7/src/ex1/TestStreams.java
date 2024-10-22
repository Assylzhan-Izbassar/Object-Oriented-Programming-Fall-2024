package ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStreams {

	public static void main(String[] args) {
		String path = "C:\\Users\\a.izbassar\\Desktop\\Object-Oriented-Programming-Fall-2024\\OOP 17-19\\Week7\\src\\ex1";
		try {
			
			// InputStream
			
			FileInputStream fis = new FileInputStream(path + "\\input.txt");
			byte[] b = fis.readAllBytes();
			for(byte x: b) {
				System.out.print(x + " ");
			}
			System.out.println();
			String inputMsg = new String(b, "UTF-8");
			System.out.println(inputMsg);
			fis.close();
			
//			OutputStream
			FileOutputStream fos = new FileOutputStream(path + "\\output.txt");
			String outputMsg = "I have your message!";
			
			String output = inputMsg + outputMsg;
			
			fos.write(output.getBytes());
			System.out.println("Message is sent.");
			
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
