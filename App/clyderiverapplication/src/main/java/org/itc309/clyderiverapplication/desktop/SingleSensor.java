package org.itc309.clyderiverapplication.desktop;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.List;
import java.awt.TextArea;
import java.awt.Scrollbar;
import javax.swing.border.TitledBorder;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.XChartPanel;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ListSelectionModel;

public class SingleSensor extends JFrame {
	private EventHandler handler = new EventHandler();
	private Dimension d;
	private CoreFileReader reader = new CoreFileReader();
	private CoreFileWriter writer = new CoreFileWriter();
	private String CurrentSensor;
	private ChartCreator creator = new ChartCreator();
	private XChartPanel<CategoryChart> chart;
	public SingleSensor(String name) {
		CurrentSensor = name;
		
		setTitle("Clyde River Application");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mnHome = new JMenuItem("Home");
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
		
		chart = creator.createChart();
		chart.setSize(700, 700);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		

		panel.setLayout(new BorderLayout(0, 0));
		
		Panel panel_1 = new Panel();
		panel.add(panel_1, BorderLayout.WEST);
		
		JList list = new JList(reader.readAllSensorsFile());
		list.setOpaque(false);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel_1.add(list);
		
		Panel panel_2 = new Panel();
		panel.add(panel_2, BorderLayout.EAST);
		
		TextArea textArea = new TextArea();
		panel_2.add(textArea);
		textArea.setEditable(false);
		textArea.setRows(3);
		textArea.setText("Status:\r\nUpper Threshold:\r\nLower Threshold:");
		
		Panel panel_3 = new Panel();
		panel.add(panel_3, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4, BorderLayout.PAGE_START);
		
		JCheckBox chckbxFavourite = new JCheckBox("Favourite?");
		panel_4.add(chckbxFavourite);
		chckbxFavourite.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxFavourite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String fav = reader.readFavouriteLocation();
				if (fav != null) {
					if (!fav.equals(CurrentSensor)) {
						Popup popup = new Popup();
						
					}
					
				}
				else {
					fav = CurrentSensor;
					writer.writeToFile(fav);
					//Check the box
				}
			}
		});
		chckbxFavourite.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblSensor = new JLabel(name);
		panel_3.add(lblSensor);
		lblSensor.setHorizontalAlignment(SwingConstants.CENTER);
		lblSensor.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSensor.setFont(new Font("Verdana", Font.BOLD, 18));
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5, BorderLayout.CENTER);
		panel_5.add(chart);
		
		this.setSize(640, 360);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setSize(1328, 720);
	}
}