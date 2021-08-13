package org.itc309.clyderiverapplication.desktop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	
	/*
	 * Read into an arraylist, convert to array -mDiyo (For Size)
	 */
	
	private int capacity = 50;
	private String temp;
	private int count = 0;

	public double[] readCSV() {
		//TODO
		System.err.println("ERROR: This Method HAS NOT Been Implemented Yet! Please Use Another Method!");
		
		//Prep
		double[] data = new double[capacity];
		//read file
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("D:\\\\Uni\\\\ITC309\\\\ITC309-Team9\\\\App\\\\data\\\\salinity_levels.csv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
		// put data into data structure
		scanner.useDelimiter(",|\\n");
		while (scanner.hasNext()) {
			temp = scanner.next();
			if (temp.contains(".")) {
				data[count] = Double.parseDouble(temp);
				count++;
			}
			System.out.println(temp);
		}
		
		//Clean Up
		scanner.close();
		count = 0;
		
		while (count < data.length) {
			System.out.println(data[count]);
			count++;
		}
		//return data structure
		return data;
	}
	
	public void readJSON() {
		//TODO - Maybe
		System.err.println("ERROR: This Method HAS NOT Been Implemented Yet! Please Use Another Method!");
	}
}
