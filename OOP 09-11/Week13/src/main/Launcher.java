package main;

import views.RegistryView;

public class Launcher {

	public static void main(String[] args) {
		RegistryView rv = new RegistryView();
		rv.createStudent();
		rv.printStudent();
	}

}
