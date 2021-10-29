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
	
	public void printTestData(String type,String data[]) {
		System.out.println("Begin Output Test Of " + type + " Data");
		for (int i=0; i<data.length; i++) {
			String temp = data[i];
			System.out.println(type + " " + i + ": " + temp);
		}
		System.out.println("End Output Test Of " + type + " Data");
	}
	
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
