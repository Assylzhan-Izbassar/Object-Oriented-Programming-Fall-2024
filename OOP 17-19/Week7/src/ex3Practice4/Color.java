package ex3Practice4;

public enum Color {
	RED("\u001B[31m"),
	GREEN("\u001B[32m"),
	BLUE("\u001B[34m");

	String asciiCode;
	
	Color(String asciiCode) {
		this.asciiCode = asciiCode;
	}
}
