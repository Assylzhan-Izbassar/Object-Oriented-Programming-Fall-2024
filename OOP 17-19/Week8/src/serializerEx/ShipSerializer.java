package serializerEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class ShipSerializer {
	
	public static boolean serialize(String path, Object o) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// serializing an object
			oos.writeObject(o);
			
			oos.flush();
			oos.close();
			fos.close();
			
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	public static Object deserialize(String path) {
		//deserialize
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object o = ois.readObject();
			
			ois.close();
			fis.close();
			
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
	
	public static void main(String[] args) {
		
		String absPath = "C:\\Users\\a.izbassar\\Desktop\\Object-Oriented-Programming-Fall-2024\\OOP 17-19\\Week8\\src\\serializerEx";
		Vector<Ship> s = new Vector<Ship>();
		
		Ship ship = new Ship(10);
		Ship ship2 = new Ship(5);
		s.add(ship);
		s.add(ship2);
		
		serialize(absPath + "\\book.txt", s);
		
		Vector<Ship> v = (Vector<Ship>) deserialize(absPath + "\\book.txt");
		
		for(Ship x: v) {
			System.out.println(x);
		}
		
	}

}
