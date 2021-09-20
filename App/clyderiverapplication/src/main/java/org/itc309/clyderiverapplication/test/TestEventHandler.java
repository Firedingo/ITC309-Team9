package org.itc309.clyderiverapplication.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.itc309.clyderiverapplication.desktop.Utility;

public class TestEventHandler implements ActionListener {
	
	Utility util = new Utility();

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Home")) {
			
			TestHome home = new TestHome();
			util.printFeedback("" + e.getSource());
		}
		
		if (e.getActionCommand().equals("Sensors")) {
			TestSensors sensors = new TestSensors();
		}
		
		if (e.getActionCommand().equals("All Salinity Levels")) {
			TestAllSensors dataScreen = new TestAllSensors("Salinity");
		}
		
		if (e.getActionCommand().equals("All Temperature Levels")) {
			TestAllSensors dataScreen = new TestAllSensors("Temperature");
		}
		
		if (e.getActionCommand().equals("All Rainfall Levels")) {
			TestAllSensors dataScreen = new TestAllSensors("Rainfall");
		}
		
		if (e.getActionCommand().equals("Exit")) {
			System.exit(0);
		}
		
		util.printFeedback("INFO: I was Triggered By " + e.getActionCommand());
	}

}
