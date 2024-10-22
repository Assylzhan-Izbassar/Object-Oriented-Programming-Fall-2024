package serialize;

import java.io.Serializable;

class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	private int numOfPages;
	private String author;
	
	public Book(int numOfPages, String author) {
		this.numOfPages = numOfPages;
		this.author = author;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return this.getAuthor() + " " + this.getNumOfPages();
	}
}
