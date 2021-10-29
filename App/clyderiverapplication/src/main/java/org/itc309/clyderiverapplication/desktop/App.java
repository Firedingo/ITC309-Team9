package org.itc309.clyderiverapplication.desktop;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
		test();
		System.out.println("INFO: The Clyde River Application For Desktop Has Successfully Launched");
	}
	
	//Starts the application
	public static void start() {
		Home home = new Home();
	}
	
	//Code for testing can be placed here. Is therefore isolated from application start
	private static void test() {
		CoreFileReader FR = new CoreFileReader();
		String location = FR.readFavouriteLocation();
	//	FR.readSensorsTextFile();
	//	FR.readHarvestTextFile();
	//	FR.readAllSensorsFile();

		FR.readData(location, false);
		FR.readTime(location, false);
	//	FR.readTemperatureData2();
	//	FR.readRainfallData();
		FR.summariseData(location);
		
		CoreFileWriter FW = new CoreFileWriter();
		//FW.writeToFile(location);
	}

}
