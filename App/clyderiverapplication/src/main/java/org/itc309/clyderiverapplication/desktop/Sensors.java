package org.itc309.clyderiverapplication.desktop;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sensors extends JFrame {
	private EventHandler handler = new EventHandler();
	private Dimension d;
	private CoreFileReader reader = new CoreFileReader();
	private JList nonHarvestList;
	
	//Creates a Window as part of the application.
	public Sensors() {
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
		
		JLabel lblSensors = new JLabel("Sensors");
		lblSensors.setBounds(530, 11, 81, 23);
		lblSensors.setFont(new Font("Verdana", Font.BOLD, 18));
		panel.add(lblSensors);
		
		JLabel lblNonharvestAreas = new JLabel("Non-Harvest Areas");
		lblNonharvestAreas.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNonharvestAreas.setBounds(226, 50, 133, 14);
		panel.add(lblNonharvestAreas);
		
		JLabel lblHarvestAreas = new JLabel("Harvest Areas");
		lblHarvestAreas.setFont(new Font("Verdana", Font.BOLD, 12));
		lblHarvestAreas.setBounds(778, 49, 100, 14);
		panel.add(lblHarvestAreas);
		
		nonHarvestList = new JList(reader.readSensorsTextFile());
		nonHarvestList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("List Option: " + getNonHarvestListValue());
				SingleSensor sinSensor = new SingleSensor(getNonHarvestListValue());
			}
		});

		nonHarvestList.setBounds(182, 75, 227, 570);
		panel.add(nonHarvestList);
		
		JList harvestList = new JList(reader.readHarvestTextFile());
		harvestList.setBounds(711, 74, 227, 570);
		panel.add(harvestList);

		
		this.setSize(640, 360);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setSize(1328, 720);
	}
	
	public String getNonHarvestListValue() {
		return (String) nonHarvestList.getSelectedValue();
	}
	
}
