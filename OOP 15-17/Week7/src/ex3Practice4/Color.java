package ex3Practice4;

public enum Color {
	RED("Red", "\u001B[31m"),
	YELLOW("Yellow", "\u001B[33m");
	
	String name;
	String asciiCode;
	
	Color(String name, String asciiCode) {
		this.name = name;
		this.asciiCode = asciiCode;
	}
	
}
