package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookSerializer {
	
	public static boolean serialize(String path, Object o) {
		try {
			FileOutputStream fos = new FileOutputStream(path);	
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(o);
			
			fos.close();
			oos.flush();
			oos.close();
			
			return true;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static Object deserialize(String path) {
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object o = ois.readObject();
			
			fis.close();
			ois.close();
			
			return o;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String absPath = "C:\\Users\\a.izbassar\\Desktop\\Object-Oriented-Programming-Fall-2024\\OOP 15-17\\Week8\\src\\serialize";
		
		Book newBook = new Book(558, "Harry Potter");
		
		boolean result = serialize(absPath + "\\books.txt", newBook);
		System.out.println(result);
		
		Object o = deserialize(absPath + "\\books.txt");
		System.out.println(o);
		
	}
}
