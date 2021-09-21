package org.itc309.clyderiverapplication.desktop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CoreFileWriter {
	private File path;
	private Utility util = new Utility();
	
	//Writes data to a preferences file. At this stage it simply saves the user's favourite location
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
