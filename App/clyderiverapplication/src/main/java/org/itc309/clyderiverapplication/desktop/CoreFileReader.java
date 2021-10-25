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
	private int capacity1 = 100;
	private int capacity2 = 100;
	

	//Reads Salinity Levels in - in theory.
	public Number[] readData(String location) {

		//Setup
		Number[] data = new Number[capacity1];
		count = 0;
		int j =0;
		
		if (location == null) {
			location = "Test";
		}

		//This could be cleaned up and made more efficient.
		util.printFeedback("INFO: Location = " + location);
		switch (location) {

			case "Test":
				setPath(18);
				util.printError("No Location Set. Falling Back To Default.");
				break;
			case "Buoy 01 - Wray Street":
				setPath(1);
				break;
			case "Buoy 03 - Moonlight":
				setPath(3);
				break;
			case "Buoy 04 - Budd Island North":
				setPath(4);
				break;
			case "Buoy 05 - Snapper Point North-West":
				setPath(5);
				break;
			case "Fixed Depth - Rockey Point":
				setPath(14);
				break;
			case "Buoy 08 - Angry Man Point":
				setPath(8);
				break;
			case "Buoy 09 - Chinaman's Point":
				setPath(9);
				break;
			case "Buoy 10 - Waterfall Creek":
				setPath(10);
				break;
			case "Buoy 11 - Opposite Buckenbowra":
				setPath(11);
				break;
			case "Buoy 12 - Big Island West":
				setPath(12);
				break;
			case "Buoy 13 - Double Bay":
				setPath(13);
				break;
		}

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
				if (j < data.length) {
				data[j] = Float.parseFloat(temp);
				j++;
				}
			}
		}
		
		//Clean Up
		scanner.close();
		
		
		//Return To Parent
		return data;
	}

	//Reads The Time a measurement was taken in for all measurements
	public String[] readTime(String location) {
		//Setup
		String[] time = new String[capacity1];
		count = 0;
		int j = 0;
		
		if (location == null) {
			location = "Test";
		}

		//This could be cleaned up and made more efficient.
		switch (location) {
			case "Test":
				setPath(18);
				util.printError("No Location Set. Falling Back To Default.");
				break;
			case "Buoy 01 - Wray Street":
				setPath(1);
				break;
			case "Buoy 03 - Moonlight":
				setPath(3);
				break;
			case "Buoy 04 - Budd Island North":
				setPath(4);
				break;
			case "Buoy 05 - Snapper Point North-West":
				setPath(5);
				break;
			case "Fixed Depth - Rockey Point":
				setPath(14);
				break;
			case "Buoy 08 - Angry Man Point":
				setPath(8);
				break;
			case "Buoy 09 - Chinaman's Point":
				setPath(9);
				break;
			case "Buoy 10 - Waterfall Creek":
				setPath(10);
				break;
			case "Buoy 11 - Opposite Buckenbowra":
				setPath(11);
				break;
			case "Buoy 12 - Big Island West":
				setPath(12);
				break;
			case "Buoy 13 - Double Bay":
				setPath(13);
				break;
			case "Budd Island":
				setPath(15);
				break;
		}
		
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
				if (j < time.length) {	
					time[j] = temp;
					j++;
				}
			}
			
		}
		
				
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
		
		return sensors;
		
	}
	
	//Reads in a favourite location from a file
	public String readFavouriteLocation() {
		setPath(16);
		String fav = "";
		String tempFav = "";
		
		try {
			Scanner scanner = new Scanner(path);
			while (scanner.hasNext()) {
				temp = scanner.nextLine();
				if (temp.contains("Favourite Location")) {
					tempFav = temp;
				}
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			util.printError("The File Could Not Be Found And/Or Accessed");
			util.printError("" + e.getLocalizedMessage());
		}
		

	//		fav = tempFav.substring(20);
			fav = tempFav;
		
		return fav;
	}

	public Number[] readTemperatureData() {
		setPath(15);
		count = 0;
		int j = 0;
		
		Number[] temperature = new Number[capacity1];
		
		try {
			Scanner scanner = new Scanner(getPath());
			scanner.useDelimiter(",|\\n");
			
			util.printFeedback("INFO: The File Has Been Successfully Located & Opened");
			util.printFeedback("INFO: " + getPath());
			
			//Title Skip
			for (int i = 0; i < 9; i++) {
				scanner.next();
			}
			
			while (scanner.hasNext()) {
			
				temp = scanner.next();
				
				
				
				if (count == 6) {
					
						temperature[j] = Float.parseFloat(temp);
				//		util.printFeedback("Temperature["+j+"] = " + temperature[j]);
						j++;
					
				}
					count++;
				
				if (count == 9) {
					count = 0;
				}	
			}		
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Test
		util.printFeedback("BEGIN TEMPERATURE PRINTOUT");
		for (int i = 0; i<temperature.length; i++) {
			util.printFeedback("Index " + i + ": " + temperature[i]);
		}
		util.printFeedback("END TEMPERATURE PRINTOUT");
		
		return temperature;
	}
	
	public Number[] readRainfallData() {
		setPath(15);
		count = 0;
		int j = 0;
		
		Number[] rainfall = new Number[capacity1];
		
		try {
			Scanner scanner = new Scanner(getPath());
			scanner.useDelimiter(",|\\n");
			
			//Title Skip
			for (int i = 0; i < 9; i++) {
				scanner.next();
			}
			
			while (scanner.hasNext()) {
			
				temp = scanner.next();
				
				
				if (count == 2) {
					
					
						rainfall[j] = Float.parseFloat(temp);
						util.printFeedback("Rainfall["+j+"] = " + rainfall[j]);
						j++;
					
				}
					count++;
				
				if (count == 9) {
					count = 0;
				}
				
				
				
			}
			
					
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Test
		util.printFeedback("BEGIN RAINFALL PRINTOUT");
		for (int i = 0; i<rainfall.length; i++) {
			util.printFeedback("Index " + i + ": " + rainfall[i]);
		}
		util.printFeedback("END RAINFALL PRINTOUT");
		
		return rainfall;
	}
	
	public void summariseData(String Location) {
		Number[] allData = new Number[capacity1];
		Number[] summaryData = new Number[capacity2];
		int count = 0;
		int count2 = 0;
		int control = 0;
		Number data;

		allData = readData(Location);
		data = allData[1];
		util.printFeedback("INFO TEST: " + data);

		for (int a = 0; a < allData.length; a++) {
			if (count < summaryData.length) {
				if (count == 0) {
					data = allData[a];
					util.printFeedback("INFO: " + data);
					summaryData[count] = data;
					count++;
				}

			}
			control++;

			if (control == 3) {
				control = 0;
			}
		}

		//Test
		System.out.println("BEGIN SUMMARY DATA OUTPUT");
		for (int i=0; i<summaryData.length;i++) {
			System.out.println("Index " + i + ": " + summaryData[i]);
		}
		System.out.println("END SUMMARY DATA OUTPUT");
	}

	
	public void setPath(int Selector) {
		switch(Selector) {
		case 0:
			path = new File("Z:\\Fail.txt");
			break;
		case 16:
			path = new File(directory + "\\preferences.txt");
			break;
		case 17:
			path = new File(directory + "\\sensor_list.txt");
			break;
		case 18:
			path = new File(directory + "\\salinity_levels.csv");
			break;
		case 1:
			path = new File(directory + "\\sensor data\\buoy 01 - wray street\\salinity_levels.csv");
			break;
		case 3:
			path = new File(directory + "\\sensor data\\buoy 03 - moonlight\\salinity_levels.csv");
			break;
		case 4:
			path = new File(directory + "\\sensor data\\buoy 04 - budd island north\\salinity_levels.csv");
			break;
		case 5:
			path = new File(directory + "\\sensor data\\buoy 05 - snapper point north-west\\salinity_levels.csv");
			break;
		case 8:
			path = new File(directory + "\\sensor data\\buoy 08 - angry man point\\salinity_levels.csv");
			break;
		case 9:
			path = new File(directory + "\\sensor data\\buoy 09 - chinamans point\\salinity_levels.csv");
			break;
		case 10:
			path = new File(directory + "\\sensor data\\buoy 10 - waterfall creek\\salinity_levels.csv");
			break;
		case 11:
			path = new File(directory + "\\sensor data\\buoy 11 - opposite buckenbowra\\salinity_levels.csv");
			break;
		case 12:
			path = new File(directory + "\\sensor data\\buoy 12 - big island west\\salinity_levels.csv");
			break;
		case 13:
			path = new File(directory + "\\sensor data\\buoy 13 - double bay\\salinity_levels.csv");
			break;
		case 14:
			path = new File(directory + "\\sensor data\\fixed depth - rocky point\\salinity_levels.csv");
			break;
		case 15:
			path = new File(directory + "\\sensor data\\weather station\\budd island.csv");
			break;
		}
	}
	
	public File getPath() {
		return path;
	}
	
}
