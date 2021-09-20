package org.itc309.clyderiverapplication.test;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
		test();
	}
	
	public static void start() {
		TestHome home = new TestHome();
	}
	
	private static void test() {
		TestFileReader FR = new TestFileReader();
		FR.readSensorsTextFile();
		FR.readHarvestTextFile();
		FR.readAllSensorsFile();
		FR.readData();
		FR.readTime();
		
		TestFileWriter FW = new TestFileWriter();
		FW.writeToFile("Buoy 03 - Moonlight");
	}

}
