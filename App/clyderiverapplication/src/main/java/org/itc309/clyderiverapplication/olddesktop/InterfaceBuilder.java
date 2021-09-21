package org.itc309.clyderiverapplication.desktop;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
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
			chart = creator.createXYChart(); //  <-----
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e);
			System.err.println(e.getCause());
			System.err.println(e.getLocalizedMessage());
			System.err.println(e.getStackTrace());
			System.err.println("ERROR: Chart Creation Failed. Falling Back To Basic Chart!");
			chart = creator.BasicChart();
		}
		
		if (chart == null) {
			System.err.println("ERROR: Chart is NULL");
			
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
		Dimension d;
		
		
		JMenuBar menu = new JMenuBar();
		JMenuItem menuItem1 = new JMenuItem("Home");
		JMenuItem menuItem2 = new JMenuItem("Sensors");
		JMenuItem menuItem3 = new JMenu("Data");
		JMenuItem submenu1 = new JMenuItem("All Salinity Levels");
		JMenuItem submenu2 = new JMenuItem("All Temperature Levels");
		JMenuItem submenu3 = new JMenuItem("All Rainfall Levels");
		JMenuItem menuItem4 = new JMenuItem("Exit");
		
		d = new Dimension(45,50);		
		menuItem1.setMaximumSize(d);
		d = new Dimension(65,50);	
		menuItem2.setMaximumSize(d);
		d = new Dimension(35,50);	
		menuItem4.setMaximumSize(d);
		
		menuItem3.add(submenu1);
		menuItem3.add(submenu2);
		menuItem3.add(submenu3);
		menu.add(menuItem1);
		menu.add(menuItem2);
		menu.add(menuItem3);
		menu.add(menuItem4);
		
		menuItem1.addActionListener(handler);
		menuItem2.addActionListener(handler);
		menuItem4.addActionListener(handler);
	//	menuItem1.addMenuKeyListener(l);
		
		submenu1.addActionListener(handler);
		submenu2.addActionListener(handler);
		submenu3.addActionListener(handler);
		
		window.setJMenuBar(menu);
	}
	
	public JFrame createEmptyWindow() {
		//Create the window
		JFrame window = new JFrame();
		window.setSize(640, 400);
		window.setTitle("Clyde River Application");
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		
		return window;
	}
	
	public void createSensorsWindow() {
		JFrame window = createEmptyWindow();
		addMenu(window);
		
		window.add(createJLabel("HELLO WORLD!!!", 18));
		
		window.setVisible(true);
	}
	
	public JList<String> createJList(String[] sensors) {
		 JList<String> sensorsList = new JList<String>(sensors);
		 
		 return sensorsList;
	}
	
	public JLabel createJLabel(String contents, int size) {
		JLabel label = new JLabel();
		Font font = new Font("Verdana", Font.BOLD, size);
		label.setText(contents);
		label.setFont(font);
		
		return label;
	}
}
