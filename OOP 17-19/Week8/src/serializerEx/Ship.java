package serializerEx;

import java.io.Serializable;

public class Ship implements Serializable {
	private static final long serialVersionUID = 1L;
	transient private int numOfFloors;
	
	public Ship(int numOfFloors) {
		this.numOfFloors = numOfFloors;
	}
	
	public int getNumOfFloors() {
		return this.numOfFloors;
	}
	
	public String toString() {
		return this.numOfFloors + " floors ship.";
	}
}
