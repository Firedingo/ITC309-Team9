package org.itc309.clyderiverapplication.desktop;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Popup extends JFrame {
	//Creates a Window as part of the application. - May be replaced.
	public Popup() {
		setTitle("Alert");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea txtrAlertMessage = new JTextArea();
		txtrAlertMessage.setFont(new Font("Verdana", Font.BOLD, 20));
		txtrAlertMessage.setOpaque(false);
		txtrAlertMessage.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		txtrAlertMessage.setAlignmentX(Component.RIGHT_ALIGNMENT);
		txtrAlertMessage.setEditable(false);
		txtrAlertMessage.setWrapStyleWord(true);
		txtrAlertMessage.setLineWrap(true);
		txtrAlertMessage.setRows(5);
		txtrAlertMessage.setText("Are you sure you want to replace your currently selected favourite location?");
		txtrAlertMessage.setBounds(57, 31, 350, 124);
		panel.add(txtrAlertMessage);
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//	String input = "Yes";
			//	return input;
			}
		});
		btnYes.setBounds(0, 201, 223, 60);
		panel.add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.setBounds(223, 201, 211, 60);
		panel.add(btnNo);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
	}
}
