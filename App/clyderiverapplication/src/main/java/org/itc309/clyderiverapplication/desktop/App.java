package org.itc309.clyderiverapplication.desktop;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
		test();
	}
	
	public static void start() {
		Home home = new Home();
	}
	
	private static void test() {
		CoreFileReader FR = new CoreFileReader();
		FR.readSensorsTextFile();
		FR.readHarvestTextFile();
		FR.readAllSensorsFile();
		FR.readData();
		FR.readTime();
		
		CoreFileWriter FW = new CoreFileWriter();
		FW.writeToFile("Buoy 03 - Moonlight");
	}

}
