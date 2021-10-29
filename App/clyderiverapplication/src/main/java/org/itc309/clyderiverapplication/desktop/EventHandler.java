package org.itc309.clyderiverapplication.desktop;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class EventHandler implements ActionListener {
	
	private Utility util = new Utility();
	private CoreFileReader reader = new CoreFileReader();

	//Handles all the input to the menu. Is the backbone of the appllication and drives movement and flow.
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//COde Borrowed From https://www.codejava.net/java-se/swing/show-simple-open-file-dialog-using-jfilechooser
		if (e.getActionCommand().equals("Load File")) {
			
			//Frame Access Code Borrowed From: https://coderanch.com/t/346777/java/parent-frame-JMenuItem-ActionListener
			//Credit To Lance Miller - Comment Posted Sep 9th, 2008
			JMenuItem menuitem = (JMenuItem) e.getSource();
			JPopupMenu PopupMenu = (JPopupMenu) menuitem.getParent();
			Component invoker = PopupMenu.getInvoker();
			JComponent invokerAsJComponent = (JComponent) invoker;
	        Container frame = invokerAsJComponent.getTopLevelAncestor();
			
			
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
			int result = fileChooser.showOpenDialog(frame);
			if (result == JFileChooser.APPROVE_OPTION) {
				File selectedFile = fileChooser.getSelectedFile();
				reader.setLoadedFile(selectedFile);
				util.printPath();
			}
			util.printFeedback("" + e.getSource());
		}
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
