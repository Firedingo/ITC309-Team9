package org.itc309.clyderiverapplication.desktop;

public class Utility {
	
	public void printDoubleData(double data[]) {
		for (int i=0; i < data.length; i++) {
			System.out.println("Index " + i + ": " + data[i]);
		}
	}
	
	public void printData(String data[]) {
		for (int i=0; i < data.length; i++) {
			System.out.println("Index " + i + ": " + data[i]);
		}
	}
	
	public void printError(String message) {
		System.err.println("ERROR: " + message);
	}
	
	public void printFeedback(String message) {
		System.out.println(message);
	}

}
