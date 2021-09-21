package org.itc309.clyderiverapplication.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
	
	Utility util = new Utility();

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Home")) {
			
			Home home = new Home();
			util.printFeedback("" + e.getSource());
		}
		
		if (e.getActionCommand().equals("Sensors")) {
			Sensors sensors = new Sensors();
		}
		
		if (e.getActionCommand().equals("All Salinity Levels")) {
			AllSensorsSummary dataScreen = new AllSensorsSummary("Salinity");
		}
		
		if (e.getActionCommand().equals("All Temperature Levels")) {
			AllSensorsSummary dataScreen = new AllSensorsSummary("Temperature");
		}
		
		if (e.getActionCommand().equals("All Rainfall Levels")) {
			AllSensorsSummary dataScreen = new AllSensorsSummary("Rainfall");
		}
		
		if (e.getActionCommand().equals("Exit")) {
			System.exit(0);
		}
		
		util.printFeedback("INFO: I was Triggered By " + e.getActionCommand());
	}

}
