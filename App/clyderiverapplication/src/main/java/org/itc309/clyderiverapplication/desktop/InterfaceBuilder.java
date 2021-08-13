package org.itc309.clyderiverapplication.desktop;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;

public class InterfaceBuilder {
	XYChart chart = null;
	private EventHandler handler = new EventHandler();

	public void createWindow() {
		//Create the window
		JFrame window = new JFrame();
		window.setSize(640, 400);
		window.setTitle("Clyde River Application");
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		
		//Add The components
		
		//Add Chart
		ChartCreator creator = new ChartCreator();
		try {
			chart = creator.BasicChart(); //  <-----
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			
		}
		
		if (chart == null) {
			System.err.println("ERROR: Chart Creation Failed. Falling Back To Basic Chart!");
			chart = creator.BasicChart();
		}
		
		addMenu(window);
		addChart(window, chart);
		
		
	}
	
	public void addChart(JFrame window, XYChart chart) {
		JPanel chartPanel = new XChartPanel<XYChart>(chart);
		window.add(chartPanel);
		window.pack();
		window.setVisible(true);
	}
	
	public void addFavourite() {
		
	}
	
	public void addMenu(JFrame window) {
		JMenuBar menu = new JMenuBar();
		JMenu menuItem1 = new JMenu("Home");
		JMenu menuItem2 = new JMenu("Sensors");
		JMenu menuItem3 = new JMenu("Data");
		JMenuItem submenu1 = new JMenuItem("All Salinity Levels");
		JMenuItem submenu2 = new JMenuItem("All Temperature Levels");
		JMenuItem submenu3 = new JMenuItem("All Rainfall Levels");
		
		menuItem3.add(submenu1);
		menuItem3.add(submenu2);
		menuItem3.add(submenu3);
		menu.add(menuItem1);
		menu.add(menuItem2);
		menu.add(menuItem3);
		
		menuItem1.addActionListener(handler);
		menuItem2.addActionListener(handler);
		
		submenu1.addActionListener(handler);
		submenu2.addActionListener(handler);
		submenu3.addActionListener(handler);
		
		window.setJMenuBar(menu);
	}
}
