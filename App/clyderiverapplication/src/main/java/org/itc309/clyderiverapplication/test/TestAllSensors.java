package org.itc309.clyderiverapplication.test;

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
import java.awt.Component;

public class TestAllSensors extends JFrame {
	private TestEventHandler handler = new TestEventHandler();
	private Dimension d;
	private String Ltype;
	public TestAllSensors(String type) {
		Ltype = type;
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
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblSalinityLevels = new JLabel(Ltype + " Levels - All Sensors");
		lblSalinityLevels.setAlignmentY(Component.TOP_ALIGNMENT);
		lblSalinityLevels.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblSalinityLevels.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalinityLevels.setFont(new Font("Verdana", Font.BOLD, 18));
		lblSalinityLevels.setBounds(480, 11, 444, 23);
		panel.add(lblSalinityLevels);
		
		JLabel lblBuoy = new JLabel("Buoy 01 - Wray St");
		lblBuoy.setBounds(35, 59, 94, 14);
		panel.add(lblBuoy);
		
		JLabel lblBuoy_1 = new JLabel("Buoy 03 - Moonlight");
		lblBuoy_1.setBounds(386, 59, 102, 14);
		panel.add(lblBuoy_1);
		
		JLabel lblBuoy_2 = new JLabel("Buoy 04 - Budd Island North");
		lblBuoy_2.setBounds(700, 59, 141, 14);
		panel.add(lblBuoy_2);
		
		JLabel lblBuoy_3 = new JLabel("Buoy 05 - Snapper Point North West");
		lblBuoy_3.setBounds(1014, 59, 180, 14);
		panel.add(lblBuoy_3);
		
		JLabel lblFixedDepth = new JLabel("Fixed Depth - Rocky Point");
		lblFixedDepth.setBounds(35, 234, 130, 14);
		panel.add(lblFixedDepth);
		
		JLabel lblBuoy_4 = new JLabel("Buoy 08 - Angry Man Point");
		lblBuoy_4.setBounds(386, 234, 141, 14);
		panel.add(lblBuoy_4);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1247, 0, 17, 657);
		panel.add(scrollBar);
		
		JLabel lblBuoy_5 = new JLabel("Buoy 09 - Chinaman's Point");
		lblBuoy_5.setBounds(700, 234, 130, 14);
		panel.add(lblBuoy_5);
		
		JLabel lblBuoy_6 = new JLabel("Buoy 10 - Waterfall Creek");
		lblBuoy_6.setBounds(1014, 234, 124, 14);
		panel.add(lblBuoy_6);
		
		JLabel lblBuoy_7 = new JLabel("Buoy 11 - Opposite Buckenbowra");
		lblBuoy_7.setBounds(35, 425, 159, 14);
		panel.add(lblBuoy_7);
		
		JLabel lblBuoy_8 = new JLabel("Buoy 12 - Big Island West");
		lblBuoy_8.setBounds(386, 425, 124, 14);
		panel.add(lblBuoy_8);
		
		JLabel lblBuoy_9 = new JLabel("Buoy 13 - Double Bay");
		lblBuoy_9.setBounds(700, 425, 103, 14);
		panel.add(lblBuoy_9);
		
		this.setSize(640, 360);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setSize(1328, 720);
	}
}
