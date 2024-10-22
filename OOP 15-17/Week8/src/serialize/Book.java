package serialize;

import java.io.Serializable;

public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	transient private int numOfPages;
	private String title;
	
	public Book(int numOfPages, String title) {
		this.numOfPages = numOfPages;
		this.title = title;
	}
	
	@Override
	public String toString() {
		return this.title + " with " + this.numOfPages + " pages.";
	}
}
