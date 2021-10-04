package org.itc309.clyderiverapplication.desktop;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
		test();
	}
	
	//Starts the application
	public static void start() {
		Home home = new Home();
	}
	
	//Code for testing can be placed here. Is therefore isolated from application start
	private static void test() {
		CoreFileReader FR = new CoreFileReader();
	//	FR.readSensorsTextFile();
	//	FR.readHarvestTextFile();
	//	FR.readAllSensorsFile();
		FR.readData();
		FR.readTime();
	//	FR.readTemperatureData2();
	//	FR.readRainfallData();
		
		CoreFileWriter FW = new CoreFileWriter();
		FW.writeToFile("Buoy 03 - Moonlight");
	}

}
