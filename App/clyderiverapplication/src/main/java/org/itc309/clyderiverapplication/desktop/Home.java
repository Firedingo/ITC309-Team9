package org.itc309.clyderiverapplication.desktop;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.Box;

public class Home extends JFrame {
	private EventHandler handler = new EventHandler();
	private Utility util = new Utility();
	private Dimension d;
	private String fav = "";
	private CoreFileReader reader = new CoreFileReader();
	private ChartCreator creator = new ChartCreator();
	private XChartPanel<CategoryChart> chart;
	private XChartPanel<CategoryChart> chart1;
	private XChartPanel<CategoryChart> chart2;
	
	//Creates a Window as part of the application.
	public Home() {
		HELLOWORLD();
		setTitle("Clyde River Application");
		
		//MENU CREATION
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mnHome = new JMenuItem("Home");
		mnHome.setBorderPainted(true);
		mnHome.setOpaque(true);
		menuBar.add(mnHome);
		mnHome.addActionListener(handler);
		d = new Dimension(45,50);		
		mnHome.setMaximumSize(d);
		
		JMenuItem mnSensors = new JMenuItem("Sensors");
		menuBar.add(mnSensors);
		mnSensors.addActionListener(handler);
		d = new Dimension(65,50);	
		mnSensors.setMaximumSize(d);
		
		JMenu mnData = new JMenu("Data");
		menuBar.add(mnData);
		
		JMenuItem mntmAllSalinityLevels = new JMenuItem("All Salinity Levels");
		mnData.add(mntmAllSalinityLevels);
		mntmAllSalinityLevels.addActionListener(handler);
		
		JMenuItem mntmAllTemperatureLevels = new JMenuItem("All Temperature Levels");
		mnData.add(mntmAllTemperatureLevels);
		mntmAllTemperatureLevels.addActionListener(handler);
		
		JMenuItem mntmAllRainfallLevels = new JMenuItem("All Rainfall Levels");
		mnData.add(mntmAllRainfallLevels);
		mntmAllRainfallLevels.addActionListener(handler);
		
		JMenuItem mnExit = new JMenuItem("Exit");
		menuBar.add(mnExit);
		mnExit.addActionListener(handler);
		d = new Dimension(35,50);	
		mnExit.setMaximumSize(d);
		//END MENU CREATION
		
		JLabel lblDashboard = new JLabel("Dashboard");
		lblDashboard.setFont(new Font("Verdana", Font.BOLD, 30));
		lblDashboard.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblDashboard, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		
		try {
		chart = creator.createCategoryChart(420,350,"Test Chart", "Test X Data", "Test Y Data", reader.readFavouriteLocation(),0);
		chart1 = creator.createCategoryChart(420,350,"Test Chart", "Test X Data", "Test Y Data", reader.readFavouriteLocation(),0);
		chart2 = creator.createCategoryChart(420,350,"Test Chart", "Test X Data", "Test Y Data", reader.readFavouriteLocation(),1);
		
		panel.add(chart, BorderLayout.SOUTH);
		panel.add(chart1, BorderLayout.SOUTH);
		panel.add(chart2, BorderLayout.SOUTH);
		}
		catch (IllegalArgumentException e) {
			util.printError("Chart or Charts Could Not Be Created!");
		}
		
		
		
		fav = reader.readFavouriteLocation();
		if (fav.isEmpty()) {
			fav = "No Favourite Selected";
			panel.setVisible(false);
			System.err.print("ERROR: No Favourite Location Set");
		}
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel_1.add(horizontalStrut);
		
		JLabel lblNoFavouriteSelected = new JLabel(fav);
		lblNoFavouriteSelected.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblNoFavouriteSelected);
		lblNoFavouriteSelected.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNoFavouriteSelected.setHorizontalAlignment(SwingConstants.LEFT);
		
		this.setSize(640, 360);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setSize(1328, 720);
	}


	private void HELLOWORLD() {
		System.out.println("HELLO WORLD!!");
	}
	
}
