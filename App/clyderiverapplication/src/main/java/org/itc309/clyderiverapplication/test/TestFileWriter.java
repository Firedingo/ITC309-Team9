package org.itc309.clyderiverapplication.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.itc309.clyderiverapplication.desktop.Utility;

public class TestFileWriter {
	private File path;
	private Utility util = new Utility();
	
	public void writeToFile(String favourite) {
		path = new File("D:\\\\Uni\\\\ITC309\\\\ITC309-Team9\\\\App\\\\data\\\\preferences.txt");

		try {
			FileWriter writer = new FileWriter(path);
			
			writer.append("Favourite Location: " + favourite);
			
			
			
			
			
			
			
			
			
			
			writer.close();
						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			util.printError("The File Could Not Be Found And/Or Accessed");
			util.printError("" + e.getLocalizedMessage());
		}
	}

}
