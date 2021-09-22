package org.itc309.clyderiverapplication.desktop;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class CoreFileReader {
	//private File path = new File("D:\\\\Uni\\\\ITC309\\\\ITC309-Team9\\\\App\\\\data\\\\");
	private File file = new File("../data/salinity_levels.csv");
	private File path = file;
	private File directory = new File("../data/");
	private int count = 0;
	private String temp;
	private Utility util = new Utility();
	private int capacity = 11;

	//Reads Salinity, Temperature or Rainfall Levels in
	public Number[] readData() {
		//Setup
		Number[] data = new Number[capacity];
		//setPath(3);
		path = new File(directory + "\\salinity_levels.csv");
		count = 0;
		
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
				for (int i=0; i<data.length;i++) {
				data[i] = Float.parseFloat(temp);
				}
			}
			System.out.println(temp);
		}
		
		//Clean Up
		scanner.close();
		
		
		//Test
		System.out.println("Begin Output Test Of Salinity Data");
		for (int i=0; i<data.length; i++) {
			Number temp = data[i];
			System.out.println("Salinity " + i + ": " + temp);
		}
		System.out.println("End Output Test Of Salinity Data");
		
		
		//Return To Parent
		return data;
	}

	//Reads The Time a measurement was taken in for all measurements
	public String[] readTime() {
		//Setup
		String[] time = new String[capacity];
		count = 0;
		setPath(3);
		
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
				for (int i=0; i<time.length; i++) {
					time[i] = temp;
					util.printFeedback("Time_Test: " + time[i]);
				}
			}
			
		}
		
		/*
		//Test
		System.out.println("Begin Output Test Of Time Data");
		for (int i=0; i<time.length; i++) {
			String temp = time[i];
			System.out.println("Salinity " + i + ": " + temp);
		}
		System.out.println("End Output Test Of Time Data");
		*/
				
		//Clean Up
		scanner.close();
		
		//Return To Parent
		return time;		
	}
	
	//Reads in a list of all sensors from a file
	public String[] readAllSensorsFile() {
			path = new File("D:\\\\Uni\\\\ITC309\\\\ITC309-Team9\\\\App\\\\data\\\\sensor_list.txt");
			Scanner scanner;
			String[] sensors = new String[capacity];
			count = 0;
			try {
				scanner = new Scanner(path);
				util.printFeedback("INFO: File Successfully Found & Opened!");
				
				while(scanner.hasNext()) {
					
					temp = scanner.nextLine();
					sensors[count] = temp;
					count++;
					
				}
				
			// The Error
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				util.printError("The File Could Not Be Opened or Found");
			}
			
			util.printData(sensors);
			return sensors;
			
	}
	
	//Reads in a list of sensors from a file and filters out the harvest zones
	public String[] readSensorsTextFile( ) {
		path = new File("D:\\\\Uni\\\\ITC309\\\\ITC309-Team9\\\\App\\\\data\\\\sensor_list.txt");
		Scanner scanner;
		String[] sensors = new String[capacity];
		count = 0;
		try {
			scanner = new Scanner(path);
			util.printFeedback("INFO: File Successfully Found & Opened!");
			
			while(scanner.hasNext()) {
				
				temp = scanner.nextLine();
				

					if (!(temp.equals("Buoy 03 - Moonlight")) ) {
						if (!(temp.equals("Fixed Depth - Rocky Point") )) {
							if (!(temp.equals("Buoy 10 - Waterfall Creek") ) ) {
								sensors[count] = temp;
								count++;
							}
						}
					}
			}
			
		// The Error
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			util.printError("The File Could Not Be Opened or Found");
		}
		
		util.printData(sensors);
		return sensors;
		
	}
	
	//Reads in a list of sensors from a file and filters out all sensors that aren't harvest areas
	public String[] readHarvestTextFile( ) {
		setPath(2);
		Scanner scanner;
		String[] sensors = new String[capacity];
		count = 0;
		try {
			scanner = new Scanner(path);
			util.printFeedback("INFO: File Successfully Found & Opened!");
			
			while(scanner.hasNext()) {
				
				temp = scanner.nextLine();
				

					if (temp.equals("Buoy 03 - Moonlight") || 
						(temp.equals("Fixed Depth - Rocky Point")) || 
						(temp.equals("Buoy 10 - Waterfall Creek")) ) {
								sensors[count] = temp;
								count++;
					}
			}
			
		// The Error
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			util.printError("The File Could Not Be Opened or Found");
		}
		
		util.printData(sensors);
		return sensors;
		
	}
	
	//Reads in a favourite location from a file
	public String readFavouriteLocation() {
		setPath(1);
		String fav = "";
		try {
			Scanner scanner = new Scanner(path);
			while (scanner.hasNext()) {
				temp = scanner.nextLine();
				if (temp.contains("Favourite Location")) {
					fav = temp;
				}
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			util.printError("The File Could Not Be Found And/Or Accessed");
			util.printError("" + e.getLocalizedMessage());
		}
		
		
		
		return fav;
	}
	
	public void setPath(int Selector) {
		switch(Selector) {
		case 0:
			path = new File("Z:\\Fail.txt");
			break;
		case 1:
			path = new File(directory + "\\preferences.txt");
			break;
		case 2:
			path = new File(directory + "\\sensor_list.txt");
			break;
		case 3:
			path = new File(directory + "\\salinity_levels.csv");
			break;
		}
	}
	
	public File getPath() {
		return path;
	}
	
}
