
package main;

public class Main {

	public static void main(String[] args) {
		
		OperationsFile.createMainFolderIfNotPresent("Folder");
		
		Display.printWelcomeScreen("Welcome to The Program", "Hii,I'm likku");
		
		Menu.handleWelcomeScreenInput();
	}

}
