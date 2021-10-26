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
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

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
		XChartPanel<CategoryChart> chart = creator.createCategoryChart(300, 320, "Test Chart", "Test X Data", "Test Y Data",location,0);
		XChartPanel<CategoryChart> chart1 = creator.createCategoryChart(300, 320, "Test Chart", "Test X Data", "Test Y Data",location,0);
		XChartPanel<CategoryChart> chart2 = creator.createCategoryChart(300, 320, "Test Chart", "Test X Data", "Test Y Data",location,1);
		XChartPanel<CategoryChart> chart3 = creator.createCategoryChart(300, 320, "Test Chart", "Test X Data", "Test Y Data",location,0);
		XChartPanel<CategoryChart> chart4 = creator.createCategoryChart(300, 320, "Test Chart", "Test X Data", "Test Y Data",location,0);
		XChartPanel<CategoryChart> chart5 = creator.createCategoryChart(300, 320, "Test Chart", "Test X Data", "Test Y Data",location,1);
		XChartPanel<CategoryChart> chart6 = creator.createCategoryChart(300, 320, "Test Chart", "Test X Data", "Test Y Data",location,0);
		XChartPanel<CategoryChart> chart7 = creator.createCategoryChart(300, 320, "Test Chart", "Test X Data", "Test Y Data",location,0);
		XChartPanel<CategoryChart> chart8 = creator.createCategoryChart(300, 320, "Test Chart", "Test X Data", "Test Y Data",location,1);
		XChartPanel<CategoryChart> chart9 = creator.createCategoryChart(300, 320, "Test Chart", "Test X Data", "Test Y Data",location,0);
		XChartPanel<CategoryChart> chart10 = creator.createCategoryChart(300, 320, "Test Chart", "Test X Data", "Test Y Data",location,0);
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
		//END INSANE CHART PROCESSING
		
		this.setSize(640, 360);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setSize(1328, 720);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{174, 174, 174, 0, 174, 271, 0, 0, 174, 96, 0};
		gbl_panel.rowHeights = new int[]{79, 79, 79, 79, 79, 79, 79, 79, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.BOTH;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);
		
		JLabel label_1 = new JLabel("");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.fill = GridBagConstraints.BOTH;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 0;
		panel.add(label_1, gbc_label_1);
		
		JLabel label_2 = new JLabel("");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.fill = GridBagConstraints.BOTH;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 2;
		gbc_label_2.gridy = 0;
		panel.add(label_2, gbc_label_2);
		
		JLabel label_3 = new JLabel("");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.fill = GridBagConstraints.BOTH;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 4;
		gbc_label_3.gridy = 0;
		panel.add(label_3, gbc_label_3);
		
		JLabel lblSummarytitle = new JLabel(Ltype + " Levels - All Sensors");
		lblSummarytitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSummarytitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblSummarytitle = new GridBagConstraints();
		gbc_lblSummarytitle.fill = GridBagConstraints.BOTH;
		gbc_lblSummarytitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblSummarytitle.gridx = 5;
		gbc_lblSummarytitle.gridy = 0;
		panel.add(lblSummarytitle, gbc_lblSummarytitle);
		
		JLabel label_4 = new JLabel("");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.fill = GridBagConstraints.BOTH;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 8;
		gbc_label_4.gridy = 0;
		panel.add(label_4, gbc_label_4);
		
		JLabel label_8 = new JLabel("");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.fill = GridBagConstraints.BOTH;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 0;
		gbc_label_8.gridy = 1;
		panel.add(label_8, gbc_label_8);
		
		JLabel lblBuoy = new JLabel("Buoy 01 - Wray St");
		lblBuoy.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBuoy.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblBuoy = new GridBagConstraints();
		gbc_lblBuoy.fill = GridBagConstraints.BOTH;
		gbc_lblBuoy.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy.gridx = 1;
		gbc_lblBuoy.gridy = 1;
		panel.add(lblBuoy, gbc_lblBuoy);
		
		JLabel lblBuoy_1 = new JLabel("Buoy 03 - Moonlight");
		lblBuoy_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBuoy_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblBuoy_1 = new GridBagConstraints();
		gbc_lblBuoy_1.fill = GridBagConstraints.BOTH;
		gbc_lblBuoy_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy_1.gridx = 3;
		gbc_lblBuoy_1.gridy = 1;
		panel.add(lblBuoy_1, gbc_lblBuoy_1);
		
		JLabel label_9 = new JLabel("");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.fill = GridBagConstraints.BOTH;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 4;
		gbc_label_9.gridy = 1;
		panel.add(label_9, gbc_label_9);
		
		JLabel lblBuoy_2 = new JLabel("Buoy 04 - Budd Island North");
		lblBuoy_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBuoy_2.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblBuoy_2 = new GridBagConstraints();
		gbc_lblBuoy_2.fill = GridBagConstraints.BOTH;
		gbc_lblBuoy_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy_2.gridx = 5;
		gbc_lblBuoy_2.gridy = 1;
		panel.add(lblBuoy_2, gbc_lblBuoy_2);
		
		JLabel lblBuoy_3 = new JLabel("Buoy 05 - Snapper Point North West");
		lblBuoy_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBuoy_3.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblBuoy_3 = new GridBagConstraints();
		gbc_lblBuoy_3.fill = GridBagConstraints.BOTH;
		gbc_lblBuoy_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy_3.gridx = 8;
		gbc_lblBuoy_3.gridy = 1;
		panel.add(lblBuoy_3, gbc_lblBuoy_3);
		
		JLabel label_13 = new JLabel("");
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.fill = GridBagConstraints.BOTH;
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 0;
		gbc_label_13.gridy = 2;
		panel.add(label_13, gbc_label_13);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 2;
		panel.add(panel_1, gbc_panel_1);
		
		JPanel panel_1_1 = new JPanel();
		GridBagConstraints gbc_panel_1_1 = new GridBagConstraints();
		gbc_panel_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_1.gridx = 3;
		gbc_panel_1_1.gridy = 2;
		panel.add(panel_1_1, gbc_panel_1_1);
		
		JLabel label_14 = new JLabel("");
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.fill = GridBagConstraints.BOTH;
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 4;
		gbc_label_14.gridy = 2;
		panel.add(label_14, gbc_label_14);
		
		JPanel panel_1_1_1 = new JPanel();
		GridBagConstraints gbc_panel_1_1_1 = new GridBagConstraints();
		gbc_panel_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_1_1.gridx = 5;
		gbc_panel_1_1_1.gridy = 2;
		
		JPanel panel_1_1_1_1 = new JPanel();
		GridBagConstraints gbc_panel_1_1_1_1 = new GridBagConstraints();
		gbc_panel_1_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_1_1_1.gridx = 8;
		gbc_panel_1_1_1_1.gridy = 2;
		panel.add(panel_1_1_1_1, gbc_panel_1_1_1_1);
		panel.add(panel_1_1_1, gbc_panel_1_1_1);
		
		JLabel label_18 = new JLabel("");
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.fill = GridBagConstraints.BOTH;
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 0;
		gbc_label_18.gridy = 3;
		panel.add(label_18, gbc_label_18);
		
		JLabel lblFixedDepth = new JLabel("Fixed Depth - Rocky Point");
		lblFixedDepth.setHorizontalTextPosition(SwingConstants.CENTER);
		lblFixedDepth.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblFixedDepth = new GridBagConstraints();
		gbc_lblFixedDepth.fill = GridBagConstraints.BOTH;
		gbc_lblFixedDepth.insets = new Insets(0, 0, 5, 5);
		gbc_lblFixedDepth.gridx = 1;
		gbc_lblFixedDepth.gridy = 3;
		panel.add(lblFixedDepth, gbc_lblFixedDepth);
		
		JLabel lblBuoy_4 = new JLabel("Buoy 08 - Angry Man Point");
		lblBuoy_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBuoy_4.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblBuoy_4 = new GridBagConstraints();
		gbc_lblBuoy_4.fill = GridBagConstraints.BOTH;
		gbc_lblBuoy_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy_4.gridx = 3;
		gbc_lblBuoy_4.gridy = 3;
		panel.add(lblBuoy_4, gbc_lblBuoy_4);
		
		JLabel label_19 = new JLabel("");
		GridBagConstraints gbc_label_19 = new GridBagConstraints();
		gbc_label_19.fill = GridBagConstraints.BOTH;
		gbc_label_19.insets = new Insets(0, 0, 5, 5);
		gbc_label_19.gridx = 4;
		gbc_label_19.gridy = 3;
		panel.add(label_19, gbc_label_19);
		
		JLabel lblBuoy_5 = new JLabel("Buoy 09 - Chinaman's Point");
		lblBuoy_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBuoy_5.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblBuoy_5 = new GridBagConstraints();
		gbc_lblBuoy_5.fill = GridBagConstraints.BOTH;
		gbc_lblBuoy_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy_5.gridx = 5;
		gbc_lblBuoy_5.gridy = 3;
		panel.add(lblBuoy_5, gbc_lblBuoy_5);
		
		JLabel lblBuoy_6 = new JLabel("Buoy 10 - Waterfall Creek");
		lblBuoy_6.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBuoy_6.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblBuoy_6 = new GridBagConstraints();
		gbc_lblBuoy_6.fill = GridBagConstraints.BOTH;
		gbc_lblBuoy_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy_6.gridx = 8;
		gbc_lblBuoy_6.gridy = 3;
		panel.add(lblBuoy_6, gbc_lblBuoy_6);
		
		JLabel label_23 = new JLabel("");
		GridBagConstraints gbc_label_23 = new GridBagConstraints();
		gbc_label_23.fill = GridBagConstraints.BOTH;
		gbc_label_23.insets = new Insets(0, 0, 5, 5);
		gbc_label_23.gridx = 0;
		gbc_label_23.gridy = 4;
		panel.add(label_23, gbc_label_23);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		GridBagConstraints gbc_panel_1_1_1_1_1 = new GridBagConstraints();
		gbc_panel_1_1_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_1_1_1_1.gridx = 1;
		gbc_panel_1_1_1_1_1.gridy = 4;
		panel.add(panel_1_1_1_1_1, gbc_panel_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_1_1 = new JPanel();
		GridBagConstraints gbc_panel_1_1_1_1_1_1 = new GridBagConstraints();
		gbc_panel_1_1_1_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_1_1_1_1_1.gridx = 3;
		gbc_panel_1_1_1_1_1_1.gridy = 4;
		panel.add(panel_1_1_1_1_1_1, gbc_panel_1_1_1_1_1_1);
		
		JLabel label_24 = new JLabel("");
		GridBagConstraints gbc_label_24 = new GridBagConstraints();
		gbc_label_24.fill = GridBagConstraints.BOTH;
		gbc_label_24.insets = new Insets(0, 0, 5, 5);
		gbc_label_24.gridx = 4;
		gbc_label_24.gridy = 4;
		panel.add(label_24, gbc_label_24);
		
		JPanel panel_1_1_1_1_1_1_1 = new JPanel();
		GridBagConstraints gbc_panel_1_1_1_1_1_1_1 = new GridBagConstraints();
		gbc_panel_1_1_1_1_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1_1_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_1_1_1_1_1_1.gridx = 5;
		gbc_panel_1_1_1_1_1_1_1.gridy = 4;
		panel.add(panel_1_1_1_1_1_1_1, gbc_panel_1_1_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_1_1_1_1 = new JPanel();
		GridBagConstraints gbc_panel_1_1_1_1_1_1_1_1 = new GridBagConstraints();
		gbc_panel_1_1_1_1_1_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1_1_1_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_1_1_1_1_1_1_1.gridx = 8;
		gbc_panel_1_1_1_1_1_1_1_1.gridy = 4;
		panel.add(panel_1_1_1_1_1_1_1_1, gbc_panel_1_1_1_1_1_1_1_1);
		
		JLabel label_28 = new JLabel("");
		GridBagConstraints gbc_label_28 = new GridBagConstraints();
		gbc_label_28.fill = GridBagConstraints.BOTH;
		gbc_label_28.insets = new Insets(0, 0, 5, 5);
		gbc_label_28.gridx = 0;
		gbc_label_28.gridy = 5;
		panel.add(label_28, gbc_label_28);
		
		JLabel lblBuoy_7 = new JLabel("Buoy 11 - Opposite Buckenbowra");
		lblBuoy_7.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBuoy_7.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblBuoy_7 = new GridBagConstraints();
		gbc_lblBuoy_7.fill = GridBagConstraints.BOTH;
		gbc_lblBuoy_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy_7.gridx = 1;
		gbc_lblBuoy_7.gridy = 5;
		panel.add(lblBuoy_7, gbc_lblBuoy_7);
		
		JLabel lblBuoy_8 = new JLabel("Buoy 12 - Big Island West");
		lblBuoy_8.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBuoy_8.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblBuoy_8 = new GridBagConstraints();
		gbc_lblBuoy_8.fill = GridBagConstraints.BOTH;
		gbc_lblBuoy_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy_8.gridx = 3;
		gbc_lblBuoy_8.gridy = 5;
		panel.add(lblBuoy_8, gbc_lblBuoy_8);
		
		JLabel label_29 = new JLabel("");
		GridBagConstraints gbc_label_29 = new GridBagConstraints();
		gbc_label_29.fill = GridBagConstraints.BOTH;
		gbc_label_29.insets = new Insets(0, 0, 5, 5);
		gbc_label_29.gridx = 4;
		gbc_label_29.gridy = 5;
		panel.add(label_29, gbc_label_29);
		
		JLabel lblBuoy_9_1 = new JLabel("Buoy 13 - Double Bay");
		lblBuoy_9_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBuoy_9_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblBuoy_9_1 = new GridBagConstraints();
		gbc_lblBuoy_9_1.fill = GridBagConstraints.BOTH;
		gbc_lblBuoy_9_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuoy_9_1.gridx = 5;
		gbc_lblBuoy_9_1.gridy = 5;
		panel.add(lblBuoy_9_1, gbc_lblBuoy_9_1);
		
		JLabel label_30 = new JLabel("");
		GridBagConstraints gbc_label_30 = new GridBagConstraints();
		gbc_label_30.fill = GridBagConstraints.BOTH;
		gbc_label_30.insets = new Insets(0, 0, 5, 5);
		gbc_label_30.gridx = 8;
		gbc_label_30.gridy = 5;
		panel.add(label_30, gbc_label_30);
		
		JLabel label_34 = new JLabel("");
		GridBagConstraints gbc_label_34 = new GridBagConstraints();
		gbc_label_34.fill = GridBagConstraints.BOTH;
		gbc_label_34.insets = new Insets(0, 0, 5, 5);
		gbc_label_34.gridx = 0;
		gbc_label_34.gridy = 6;
		panel.add(label_34, gbc_label_34);
		
		JPanel panel_1_1_1_1_1_1_1_1_1 = new JPanel();
		GridBagConstraints gbc_panel_1_1_1_1_1_1_1_1_1 = new GridBagConstraints();
		gbc_panel_1_1_1_1_1_1_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1_1_1_1_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_1_1_1_1_1_1_1_1.gridx = 1;
		gbc_panel_1_1_1_1_1_1_1_1_1.gridy = 6;
		panel.add(panel_1_1_1_1_1_1_1_1_1, gbc_panel_1_1_1_1_1_1_1_1_1);
		
		JPanel panel_1_1_1_1_1_1_1_1_1_1 = new JPanel();
		GridBagConstraints gbc_panel_1_1_1_1_1_1_1_1_1_1 = new GridBagConstraints();
		gbc_panel_1_1_1_1_1_1_1_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1_1_1_1_1_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_1_1_1_1_1_1_1_1_1.gridx = 3;
		gbc_panel_1_1_1_1_1_1_1_1_1_1.gridy = 6;
		panel.add(panel_1_1_1_1_1_1_1_1_1_1, gbc_panel_1_1_1_1_1_1_1_1_1_1);
		
		JLabel label_35 = new JLabel("");
		GridBagConstraints gbc_label_35 = new GridBagConstraints();
		gbc_label_35.fill = GridBagConstraints.BOTH;
		gbc_label_35.insets = new Insets(0, 0, 5, 5);
		gbc_label_35.gridx = 4;
		gbc_label_35.gridy = 6;
		panel.add(label_35, gbc_label_35);
		
		JPanel panel_1_1_1_1_1_1_1_1_1_1_1 = new JPanel();
		GridBagConstraints gbc_panel_1_1_1_1_1_1_1_1_1_1_1 = new GridBagConstraints();
		gbc_panel_1_1_1_1_1_1_1_1_1_1_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1_1_1_1_1_1_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1_1_1_1_1_1_1_1_1_1_1.gridx = 5;
		gbc_panel_1_1_1_1_1_1_1_1_1_1_1.gridy = 6;
		panel.add(panel_1_1_1_1_1_1_1_1_1_1_1, gbc_panel_1_1_1_1_1_1_1_1_1_1_1);
		panel_1_1_1_1_1_1_1_1_1_1_1.add(chart10);
		
		JLabel label_36 = new JLabel("");
		GridBagConstraints gbc_label_36 = new GridBagConstraints();
		gbc_label_36.fill = GridBagConstraints.BOTH;
		gbc_label_36.insets = new Insets(0, 0, 5, 5);
		gbc_label_36.gridx = 8;
		gbc_label_36.gridy = 6;
		panel.add(label_36, gbc_label_36);
		
		JLabel label_40 = new JLabel("");
		GridBagConstraints gbc_label_40 = new GridBagConstraints();
		gbc_label_40.fill = GridBagConstraints.BOTH;
		gbc_label_40.insets = new Insets(0, 0, 0, 5);
		gbc_label_40.gridx = 0;
		gbc_label_40.gridy = 7;
		panel.add(label_40, gbc_label_40);
		
		JLabel label_41 = new JLabel("");
		GridBagConstraints gbc_label_41 = new GridBagConstraints();
		gbc_label_41.fill = GridBagConstraints.BOTH;
		gbc_label_41.insets = new Insets(0, 0, 0, 5);
		gbc_label_41.gridx = 1;
		gbc_label_41.gridy = 7;
		panel.add(label_41, gbc_label_41);
		
		JLabel label_42 = new JLabel("");
		GridBagConstraints gbc_label_42 = new GridBagConstraints();
		gbc_label_42.fill = GridBagConstraints.BOTH;
		gbc_label_42.insets = new Insets(0, 0, 0, 5);
		gbc_label_42.gridx = 2;
		gbc_label_42.gridy = 7;
		panel.add(label_42, gbc_label_42);
		
		JLabel label_43 = new JLabel("");
		GridBagConstraints gbc_label_43 = new GridBagConstraints();
		gbc_label_43.fill = GridBagConstraints.BOTH;
		gbc_label_43.insets = new Insets(0, 0, 0, 5);
		gbc_label_43.gridx = 4;
		gbc_label_43.gridy = 7;
		panel.add(label_43, gbc_label_43);
		
		JLabel label_44 = new JLabel("");
		GridBagConstraints gbc_label_44 = new GridBagConstraints();
		gbc_label_44.fill = GridBagConstraints.BOTH;
		gbc_label_44.insets = new Insets(0, 0, 0, 5);
		gbc_label_44.gridx = 5;
		gbc_label_44.gridy = 7;
		panel.add(label_44, gbc_label_44);
		
		panel_1.add(chart);
		panel_1_1.add(chart1);
		panel_1_1_1.add(chart2);
		panel_1_1_1_1.add(chart3);
		panel_1_1_1_1_1.add(chart4);
		panel_1_1_1_1_1_1.add(chart5);
		panel_1_1_1_1_1_1_1.add(chart6);
		panel_1_1_1_1_1_1_1_1.add(chart7);
		panel_1_1_1_1_1_1_1_1_1.add(chart8);
		panel_1_1_1_1_1_1_1_1_1_1.add(chart9);
		
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
	
	}
	
	public JFrame getFrame() {
		return this;
	}
}
