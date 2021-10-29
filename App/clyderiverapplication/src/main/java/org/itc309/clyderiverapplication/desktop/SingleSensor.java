package org.itc309.clyderiverapplication.desktop;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.List;
import java.awt.TextArea;
import java.awt.Scrollbar;
import javax.swing.border.TitledBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.XChartPanel;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Properties;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;

public class SingleSensor extends JFrame {
	private EventHandler handler = new EventHandler();
	private Utility util = new Utility();
	private Dimension d;
	private CoreFileReader reader = new CoreFileReader();
	private CoreFileWriter writer = new CoreFileWriter();
	private String CurrentSensor;
	private ChartCreator creator = new ChartCreator();
	private XChartPanel<CategoryChart> chart;
	private XChartPanel<CategoryChart> chart1;
	private XChartPanel<CategoryChart> chart2;
	private float upper = 36;
	private float lower = 14;
	private float latest;
	private boolean temperature = false;
	private JDatePickerImpl datePickerFrom;
	private JDatePickerImpl datePickerTo;
	private JLabel lblFrom;
	private JLabel lblTo;
	private JPanel panel_7;
	
	//Creates a Window as part of the application.
	public SingleSensor(String name) {
		CurrentSensor = name;
		if (name.equals("Weather Station - Budd Island")) {
			temperature = true;
		}
		try {
			latest = (float)getLatestDataPoint();
		}
		catch (NullPointerException e) {
			util.printError("The File Could Not Be Found Or Accessed!");
			util.printError("" + e.getStackTrace());
		}
		setTitle("Clyde River Application");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		JMenuItem mntmLoadFile = new JMenuItem("Load File");
		mnFile.add(mntmLoadFile);
		mntmLoadFile.addActionListener(handler);
		
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
		//END MENU
		
		chart = creator.createCategoryChart(500,500,getCurrentSensor(), "Time", "Salinity", getCurrentSensor(),0);
		chart1 = creator.createCategoryChart(500,500,"Budd Island", "Time", "Temperature", "Budd Island",0);
		chart2 = creator.createCategoryChart(500,500,"Budd Island", "Time", "Rainfall", "Budd Island",1);
		

		chart.setSize(700, 700);
		chart1.setSize(700, 700);
		chart2.setSize(700, 700);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		

		panel.setLayout(new BorderLayout(0, 0));
		
		Panel panel_1 = new Panel();
		panel.add(panel_1, BorderLayout.WEST);
		
		JList list = new JList(reader.readAllSensorsFile());
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String selLocation = (String) list.getSelectedValue();
				SingleSensor sinSensor = new SingleSensor(selLocation);
				getFrame().dispose();
			}
		});
		list.setOpaque(false);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel_1.add(list);
		
		Panel panel_2 = new Panel();
		panel.add(panel_2, BorderLayout.EAST);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 35, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{14, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblStatus = new JLabel("Status:");
		GridBagConstraints gbc_lblStatus = new GridBagConstraints();
		gbc_lblStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblStatus.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblStatus.gridx = 1;
		gbc_lblStatus.gridy = 0;
		panel_2.add(lblStatus, gbc_lblStatus);
		
		JLabel lblUpperThreshold = new JLabel("Upper Threshold: " + upper);
		GridBagConstraints gbc_lblUpperThreshold = new GridBagConstraints();
		gbc_lblUpperThreshold.insets = new Insets(0, 0, 5, 5);
		gbc_lblUpperThreshold.gridx = 1;
		gbc_lblUpperThreshold.gridy = 1;
		panel_2.add(lblUpperThreshold, gbc_lblUpperThreshold);
		
		JLabel lblLowerThreshold = new JLabel("Lower Threshold: " + lower);
		GridBagConstraints gbc_lblLowerThreshold = new GridBagConstraints();
		gbc_lblLowerThreshold.insets = new Insets(0, 0, 5, 5);
		gbc_lblLowerThreshold.gridx = 1;
		gbc_lblLowerThreshold.gridy = 2;
		panel_2.add(lblLowerThreshold, gbc_lblLowerThreshold);
		
		JLabel lblHarvestArea = new JLabel("Harvest Area:");
		lblHarvestArea.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblHarvestArea = new GridBagConstraints();
		gbc_lblHarvestArea.insets = new Insets(0, 0, 0, 5);
		gbc_lblHarvestArea.gridx = 1;
		gbc_lblHarvestArea.gridy = 3;
		panel_2.add(lblHarvestArea, gbc_lblHarvestArea);
		
		Panel panel_3 = new Panel();
		panel.add(panel_3, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4, BorderLayout.PAGE_START);
		
		JCheckBox chckbxFavourite = new JCheckBox("Favourite?");
		panel_4.add(chckbxFavourite);
		chckbxFavourite.setHorizontalAlignment(SwingConstants.LEFT);
		String checkFav = reader.readFavouriteLocation();
		if (getCurrentSensor().equals(checkFav)) {
			chckbxFavourite.setSelected(true);
		}
		else {
			chckbxFavourite.setSelected(false);
		}
		chckbxFavourite.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent event) {
				if (!chckbxFavourite.isSelected()) {
					String message = "Do you want to make " + getCurrentSensor() + " your favourite location?";
					int choice = JOptionPane.showConfirmDialog(getFrame(),message,"Change Favourite Location?",JOptionPane.YES_NO_OPTION);
					//NOTE: 0 == Yes
					if (choice == 0) {
						writer.writeToFile(getCurrentSensor());
						chckbxFavourite.setSelected(true);
					}
					chckbxFavourite.setSelected(false);
				}
				else {
					//Remove Current Favourite
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
		if (getCurrentSensor().contains("Budd Island")) {
			panel_5.add(chart1);
			panel_5.add(chart2);
			chart2.setVisible(false);
		}
		else {
			panel_5.add(chart);
		}
		
		lblHarvestArea.setText("Harvest Area: " + getHarvestArea(getCurrentSensor()));
		
		JPanel panel_6 = new JPanel();
		
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		panel_6.add(horizontalStrut_4);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		panel_6.add(horizontalStrut_3);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel_6.add(horizontalStrut_2);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel_6.add(horizontalStrut_1);
		
		JButton btnTemperature = new JButton("Temperature");
		btnTemperature.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (temperature == false) {
					chart2.setVisible(false);
					chart1.setVisible(true);
					panel_7.setVisible(false);
					temperature = true;
					chart1.repaint();
					System.out.println("INFO: Showing Temperature Chart....");
				}
			}
		});
		panel_6.add(btnTemperature);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel_6.add(horizontalStrut);
		
		JButton btnRainfall = new JButton("Rainfall");
		btnRainfall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (temperature == true) {
					chart2.setVisible(true);
					chart1.setVisible(false);
					chart2.repaint();
					panel_7.setVisible(true);
					temperature = false;
					System.out.println("INFO: Showing Rainfall Chart....");
				}
			}
		});
		panel_6.add(btnRainfall);
		
		panel_7 = new JPanel();
		UtilDateModel model = new UtilDateModel();
		Properties propierties = new Properties();
		propierties.put("text.today", "Today");
		propierties.put("text.month", "Month");
		propierties.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, propierties);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		panel_7.add(horizontalStrut_8);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		panel_7.add(horizontalStrut_7);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		panel_7.add(horizontalStrut_6);
		
		lblFrom = new JLabel("From:");
		panel_7.add(lblFrom);
		datePickerFrom = new JDatePickerImpl(datePanel, null);
		panel_7.add(datePickerFrom);
		datePickerTo = new JDatePickerImpl(datePanel, null);
		
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		panel_7.add(horizontalStrut_5);
		
		lblTo = new JLabel("To:");
		panel_7.add(lblTo);
		panel_7.add(datePickerTo);
		panel_7.setVisible(false);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(new BorderLayout(0, 0));
		panel_8.add(panel_7, BorderLayout.NORTH);
		panel_8.add(panel_6, BorderLayout.SOUTH);
		
		
		panel.add(panel_8, BorderLayout.SOUTH);
		if (latest < lower || latest > upper) {
			lblStatus.setText("Status: Closed");
		}
		else {
			lblStatus.setText("Status: Open");
		}
		
		if (getCurrentSensor().equals("Weather Station - Budd Island")) {
			btnTemperature.setVisible(true);
			btnRainfall.setVisible(true);
			datePickerFrom.setVisible(true);
			datePickerTo.setVisible(true);
		}
		else {
			btnTemperature.setVisible(false);
			btnRainfall.setVisible(false);
			datePickerFrom.setVisible(false);
			datePickerTo.setVisible(false);
		}
		
		this.setSize(640, 360);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setSize(1328, 720);
	}
	
	public String getCurrentSensor() {
		return CurrentSensor;
	}

	public void dispose(JFrame frame) {
		frame.dispose();
	}

	public JFrame getFrame() {
		return this;
	}
	
	public String getHarvestArea(String location) {
		String harvestArea = "";
		
		switch(location) {
		
		case "Buoy 01 - Wray Street":
			harvestArea = "Moonlight";
			break;
		case "Buoy 03 - Moonlight":
			harvestArea = "Moonlight";
			break;
		case "Buoy 04 - Budd Island North":
			harvestArea = "Moonlight";
			break;
		case "Buoy 05 - Snapper Point North-West":
			harvestArea = "Moonlight";
			break;
		case "Fixed Depth - Rocky Point":
			harvestArea = "Rocky Point";
			break;
		case "Buoy 08 - Angry Man Point":
			harvestArea = "Rocky Point";
			break;
		case "Buoy 09 - Chinaman's Point":
			harvestArea = "Waterfall";
			break;
		case "Buoy 10 - Waterfall Creek":
			harvestArea = "Waterfall";
			break;
		case "Buoy 11 - Opposite Buckenbowra":
			harvestArea = "Waterfall";
			break;
		case "Buoy 12 - Big Island West":
			harvestArea = "Waterfall";
			break;
		case "Buoy 13 - Double Bay":
			harvestArea = "Waterfall";
			break;
		default:
			harvestArea = "Unknown";
			break;
		}
		
		return harvestArea;
	}
	
	private Float getLatestDataPoint() throws NullPointerException {
		Float dataPoint = null;
		ArrayList tempData = new ArrayList();
		tempData = reader.readData(getCurrentSensor(), false);
		
		dataPoint = (Float) tempData.get(tempData.size() - 1);
		
		return dataPoint;
	}
}
