package org.itc309.clyderiverapplication.desktop;

public class Utility {
	
	//Prints out data in an array of doubles
	public void printDoubleData(double data[]) {
		for (int i=0; i < data.length; i++) {
			System.out.println("Index " + i + ": " + data[i]);
		}
	}
	
	//Prints out data in an array of Strings
	public void printData(String data[]) {
		for (int i=0; i < data.length; i++) {
			System.out.println("Index " + i + ": " + data[i]);
		}
	}
	
	//Prints out a custom error message
	public void printError(String message) {
		System.err.println("ERROR: " + message);
	}
	
	//Prints out a custom generic message - Useful for anything other than errors where feedback is needed.
	public void printFeedback(String message) {
		System.out.println(message);
	}

}
