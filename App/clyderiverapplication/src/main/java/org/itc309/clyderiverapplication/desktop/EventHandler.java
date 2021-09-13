package org.itc309.clyderiverapplication.desktop;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class EventHandler implements ActionListener {
	
	private Utility util = new Utility();
	InterfaceBuilder interfaceBuilder = new InterfaceBuilder();

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("I was triggered by: " + e.getActionCommand());
		util.printFeedback("I was run");
		

		//Creates Window For The Home Dashboard
		if (e.getActionCommand().equals("Home")) {
		//TODO
		}		
		
		
		//Creates Window For The Sensors List
		if (e.getActionCommand().equals("Sensors")) {
		interfaceBuilder.createSensorsWindow();
		
	//	System.out.println("Stuff: " + e.getSource().getParent() );
		
		}
		
		
		//Creates Window For All Salinity Data
		if (e.getActionCommand().equals("All Salinity Levels")) {
		//TODO
		}
		
		//Creates Window For All Temp Data
		if (e.getActionCommand().equals("All Temperature Levels")) {
		//TODO
		}
		
		//Creates Window For All Rainfall Data
		if (e.getActionCommand().equals("All Rainfall Levels")) {
		//TODO
		}		
		
		
		
		
		//Closes The Application
		if (e.getActionCommand().equals("Exit")) {
			System.exit(0);
		}
	}

}