package serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookSerialize {
	
	
	
	public static boolean serialize(String path, Object o) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		
			oos.writeObject(o);
			
			System.out.println("Object is written into the file.");
			
			fos.close();
			
			return true;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException io) {
			io.printStackTrace();
		}
		return false;
	}
	
	public static Object deserialize(String path) throws FileNotFoundException  {
		try {
			FileInputStream fis = new FileInputStream(path);
			
			if (fis == null) {
				throw new FileNotFoundException("File is not found!");
			}
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object o = ois.readObject();
			
			fis.close();
			
			
			return o;
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException  e) {
			e.printStackTrace();
		} 
		return null;
	}

	public static void main(String[] args) throws FileNotFoundException {
		String absPath = "C:\\Users\\a.izbassar\\Desktop\\Object-Oriented-Programming-Fall-2024\\OOP 09-11\\Week8\\src\\serialize";

		String fullPath = absPath + "\\books.txt";
		
		Book b = new Book(35, "Fairy Tale");
		
		serialize(fullPath, b);
		
		Object deserializeBook = deserialize(fullPath);
		
		System.out.print(deserializeBook);
	}

}
