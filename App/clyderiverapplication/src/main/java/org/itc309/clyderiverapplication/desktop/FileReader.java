package org.itc309.clyderiverapplication.desktop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	
	/*
	 * Read into an arraylist, convert to array -mDiyo (For Size)
	 */
	
	private int capacity = 60;
	private String temp;
	private int count = 0;
	private File path = new File("D:\\\\Uni\\\\ITC309\\\\ITC309-Team9\\\\App\\\\data\\\\salinity_levels.csv");
	private Utility util = new Utility();
	private int sentinal;
	
	public double[] readCSV(int control) {
		sentinal = control;
		//TODO
		System.err.println("ERROR: This Method HAS NOT Been Implemented Yet! Please Use Another Method!");
		
		//Prep
		double[] data = new double[capacity];
		String[] time = new String[capacity];
		
		//Get Data
		
		sentinal = 2;
		
		if (sentinal == 0) {
			data = readData(data);
		}
		else if (sentinal == 1) {
			time = readTime(time);
		}
		else if (sentinal == 2) {
			readCSV(time);
		}
		
		util.printData(data);
		
		//return data structure
		return data;
	}
	
	public void readCSV(String time[]) {
		Scanner scanner = null;
		count = 0;
		
		try {
			scanner = new Scanner(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			util.printError("The File Could Not Be Found Or Otherwise Loaded");
		}
		
		scanner.useDelimiter(",|\\n|T|\\+");
		
		while (scanner.hasNext() ) {
			for (int i=0; i < time.length; i++) {
				if (scanner.hasNext()) {
				temp = scanner.next();
				}
				if (temp.contains(":") && temp.length() == 8) {
				util.printFeedback("TEST 2: " + temp);
				time[count] = temp;
				System.out.println("Time Test - Index " + count + " " + time[count]);
				count++;
				}
				
			}
		}
		
	}
	
	public void readJSON() {
		//TODO - Maybe
		System.err.println("ERROR: This Method HAS NOT Been Implemented Yet! Please Use Another Method!");
	}
	
	private double[] readData(double data[]) {
		
		//read file
		Scanner scanner = null;
		try {
			scanner = new Scanner(path);
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
		
		//Return To Parent
		return data;
	}
	
	private String[] readTime(String time[]) {
		//read file
		Scanner scanner = null;
		try {
			scanner = new Scanner(path);
		} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
			System.err.println(e);
			util.printError("The File Could Not Be Found Or Could Not Be Opened");
		}
		
		// put data into data structure
		//Skipping titles
		for (int i=0; i<4; i++) {
		scanner.next();
		}
		
		
		scanner.useDelimiter(",|\\n|T|\\+");
		
		while (scanner.hasNext()) {
			temp = scanner.next();
			if (temp.contains(":") && temp.length() == 8) {
				System.out.println("Time: " + temp);
					time[count] = temp;
					util.printFeedback("Time_Test: " + time[count]);
					count++;
			}
			
		}
				
		//Clean Up
		scanner.close();
		
		//Return To Parent
		return time;		
	}
}
