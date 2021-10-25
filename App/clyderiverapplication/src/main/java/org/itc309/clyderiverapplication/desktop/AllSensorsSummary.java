package org.itc309.clyderiverapplication.desktop;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.XChartPanel;

import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.Box;

public class AllSensorsSummary extends JFrame {
	private EventHandler handler = new EventHandler();
	private Dimension d;
	private String Ltype;
	private ChartCreator creator = new ChartCreator();
	
	//Creates a Window as part of the application.
	public AllSensorsSummary(String type) {
		Ltype = type;
		setTitle("Clyde River Application");
		String location = "Buoy 01 - Wray Street";
		
		//First 0 - Don't care, Second 0 = Temperature, 1 = Rainfall - See the add series method in ChartCreator CLass.
		//BEGIN INSANE CHART CREATION
		XChartPanel<CategoryChart> chart = creator.createCategoryChart(200, 200, "Test Chart", "Test X Data", "Test Y Data",location,0);
		XChartPanel<CategoryChart> chart1 = creator.createCategoryChart(200, 200, "Test Chart", "Test X Data", "Test Y Data",location,0);
		XChartPanel<CategoryChart> chart2 = creator.createCategoryChart(200, 200, "Test Chart", "Test X Data", "Test Y Data",location,1);
		XChartPanel<CategoryChart> chart3 = creator.createCategoryChart(200, 200, "Test Chart", "Test X Data", "Test Y Data",location,0);
		XChartPanel<CategoryChart> chart4 = creator.createCategoryChart(200, 200, "Test Chart", "Test X Data", "Test Y Data",location,0);
		XChartPanel<CategoryChart> chart5 = creator.createCategoryChart(200, 200, "Test Chart", "Test X Data", "Test Y Data",location,1);
		XChartPanel<CategoryChart> chart6 = creator.createCategoryChart(200, 200, "Test Chart", "Test X Data", "Test Y Data",location,0);
		XChartPanel<CategoryChart> chart7 = creator.createCategoryChart(200, 200, "Test Chart", "Test X Data", "Test Y Data",location,0);
		XChartPanel<CategoryChart> chart8 = creator.createCategoryChart(200, 200, "Test Chart", "Test X Data", "Test Y Data",location,1);
		XChartPanel<CategoryChart> chart9 = creator.createCategoryChart(200, 200, "Test Chart", "Test X Data", "Test Y Data",location,0);
		XChartPanel<CategoryChart> chart10 = creator.createCategoryChart(200, 200, "Test Chart", "Test X Data", "Test Y Data",location,0);
		XChartPanel<CategoryChart> chart11 = creator.createCategoryChart(200, 200, "Test Chart", "Test X Data", "Test Y Data",location,1);
		
		//END INSANE CHART CREATION
		
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
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{35, 0, 159, 192, 141, 173, 224, 90, 180, 101, 17, 0};
		gbl_panel.rowHeights = new int[]{34, 0, 14, 161, 0, 14, 0, 177, 232, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblSalinityLevels = new JLabel(Ltype + " Levels - All Sensors");
		lblSalinityLevels.setAlignmentY(Component.TOP_ALIGNMENT);
		lblSalinityLevels.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblSalinityLevels.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalinityLevels.setFont(new Font("Verdana", Font.BOLD, 18));
		GridBagConstraints gbc_lblSalinityLevels = new GridBagConstraints();
		gbc_lblSalinityLevels.anchor = GridBagConstraints.SOUTH;
		gbc_lblSalinityLevels.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSalinityLevels.insets = new Insets(0, 0, 5, 5);
		gbc_lblSalinityLevels.gridwidth = 3;
		gbc_lblSalinityLevels.gridx = 4;
		gbc_lblSalinityLevels.gridy = 0;
		panel.add(lblSalinityLevels, gbc_lblSalinityLevels);
		
		JScrollBar scrollBar = new JScrollBar();
		GridBagConstraints gbc_scrollBar = new GridBagConstraints();
		gbc_scrollBar.anchor = GridBagConstraints.WEST;
		gbc_scrollBar.fill = GridBagConstraints.VERTICAL;
		gbc_scrollBar.gridheight = 9;
		gbc_scrollBar.gridx = 10;
		gbc_scrollBar.gridy = 0;
		panel.add(scrollBar, gbc_scrollBar);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 5;
		gbc_verticalStrut.gridy = 1;
		panel.add(verticalStrut, gbc_verticalStrut);
		
		JLabel lblBuoy = new JLabel("Buoy 01 - Wray St");
		GridBagConstraints gbc_lblBuoy = new GridBagConstraints();
		gbc_lblBuoy.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblBuoy.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy.gridx = 1;
		gbc_lblBuoy.gridy = 2;
		panel.add(lblBuoy, gbc_lblBuoy);
		
		JLabel lblBuoy_1 = new JLabel("Buoy 03 - Moonlight");
		GridBagConstraints gbc_lblBuoy_1 = new GridBagConstraints();
		gbc_lblBuoy_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblBuoy_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy_1.gridx = 4;
		gbc_lblBuoy_1.gridy = 2;
		panel.add(lblBuoy_1, gbc_lblBuoy_1);
		
		JLabel lblBuoy_2 = new JLabel("Buoy 04 - Budd Island North");
		GridBagConstraints gbc_lblBuoy_2 = new GridBagConstraints();
		gbc_lblBuoy_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblBuoy_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy_2.gridx = 6;
		gbc_lblBuoy_2.gridy = 2;
		panel.add(lblBuoy_2, gbc_lblBuoy_2);
		
		JLabel lblBuoy_3 = new JLabel("Buoy 05 - Snapper Point North West");
		GridBagConstraints gbc_lblBuoy_3 = new GridBagConstraints();
		gbc_lblBuoy_3.anchor = GridBagConstraints.NORTH;
		gbc_lblBuoy_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBuoy_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy_3.gridx = 8;
		gbc_lblBuoy_3.gridy = 2;
		panel.add(lblBuoy_3, gbc_lblBuoy_3);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 3;
		gbc_panel_1.gridwidth = 4;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 3;
		panel.add(panel_1, gbc_panel_1);
		
		//BEGIN INSANE CHART PROCESSING
		panel_1.add(chart1);
		panel_1.add(chart2);
		panel_1.add(chart3);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 6;
		gbc_panel_2.gridy = 3;
		panel.add(panel_2, gbc_panel_2);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 7;
		gbc_panel_3.gridy = 3;
		panel.add(panel_3, gbc_panel_3);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 9;
		gbc_panel_4.gridy = 3;
		panel.add(panel_4, gbc_panel_4);
		
		JLabel lblBuoy_5 = new JLabel("Buoy 09 - Chinaman's Point");
		GridBagConstraints gbc_lblBuoy_5 = new GridBagConstraints();
		gbc_lblBuoy_5.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblBuoy_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy_5.gridx = 6;
		gbc_lblBuoy_5.gridy = 5;
		panel.add(lblBuoy_5, gbc_lblBuoy_5);
		
		JLabel lblBuoy_6 = new JLabel("Buoy 10 - Waterfall Creek");
		GridBagConstraints gbc_lblBuoy_6 = new GridBagConstraints();
		gbc_lblBuoy_6.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblBuoy_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy_6.gridx = 8;
		gbc_lblBuoy_6.gridy = 5;
		panel.add(lblBuoy_6, gbc_lblBuoy_6);
		
		JLabel lblFixedDepth = new JLabel("Fixed Depth - Rocky Point");
		GridBagConstraints gbc_lblFixedDepth = new GridBagConstraints();
		gbc_lblFixedDepth.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblFixedDepth.insets = new Insets(0, 0, 5, 5);
		gbc_lblFixedDepth.gridx = 2;
		gbc_lblFixedDepth.gridy = 6;
		panel.add(lblFixedDepth, gbc_lblFixedDepth);
		
		JLabel lblBuoy_4 = new JLabel("Buoy 08 - Angry Man Point");
		GridBagConstraints gbc_lblBuoy_4 = new GridBagConstraints();
		gbc_lblBuoy_4.anchor = GridBagConstraints.NORTH;
		gbc_lblBuoy_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBuoy_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy_4.gridx = 4;
		gbc_lblBuoy_4.gridy = 6;
		panel.add(lblBuoy_4, gbc_lblBuoy_4);
		
		JLabel lblBuoy_7 = new JLabel("Buoy 11 - Opposite Buckenbowra");
		GridBagConstraints gbc_lblBuoy_7 = new GridBagConstraints();
		gbc_lblBuoy_7.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblBuoy_7.insets = new Insets(0, 0, 0, 5);
		gbc_lblBuoy_7.gridx = 2;
		gbc_lblBuoy_7.gridy = 8;
		panel.add(lblBuoy_7, gbc_lblBuoy_7);
		
		JLabel lblBuoy_8 = new JLabel("Buoy 12 - Big Island West");
		GridBagConstraints gbc_lblBuoy_8 = new GridBagConstraints();
		gbc_lblBuoy_8.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblBuoy_8.insets = new Insets(0, 0, 0, 5);
		gbc_lblBuoy_8.gridx = 4;
		gbc_lblBuoy_8.gridy = 8;
		panel.add(lblBuoy_8, gbc_lblBuoy_8);
		
		JLabel lblBuoy_9 = new JLabel("Buoy 13 - Double Bay");
		GridBagConstraints gbc_lblBuoy_9 = new GridBagConstraints();
		gbc_lblBuoy_9.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblBuoy_9.insets = new Insets(0, 0, 0, 5);
		gbc_lblBuoy_9.gridx = 6;
		gbc_lblBuoy_9.gridy = 8;
		panel.add(lblBuoy_9, gbc_lblBuoy_9);
		//END INSANE CHART PROCESSING
		
		this.setSize(640, 360);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setSize(1328, 720);
	}
}
