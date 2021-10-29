package org.itc309.clyderiverapplication.desktop;

public class Utility {
	
	//Prints out a custom error message
	public void printError(String message) {
		System.err.println("ERROR: " + message);
	}
	
	//Prints out a custom generic message - Useful for anything other than errors where feedback is needed.
	public void printFeedback(String message) {
		System.out.println(message);
	}
	
	//Prints The Currently Set File Path
	public void printPath() {
		CoreFileReader reader = new CoreFileReader();
		System.out.print("The Currently Selected Path is: " + reader.getPath());
	}

}
