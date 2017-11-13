package simpleGUI;


import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class UserInterface {
	
	public static void main( String[] args ){
		JFrame gui = new JFrame();
		gui.setTitle("Login Example");
		gui.setResizable(false);
		gui.setSize(400,250);
		gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		gui.setVisible(true);
		
		
		Container pane = gui.getContentPane();
		//pane.setBackground(new Color(0,0,0));
		JLabel userLabel = new JLabel("User");
		JLabel passLabel = new JLabel("Password");
		JTextField textField = new JTextField(20);
		JPasswordField passField = new JPasswordField(10);
		JButton login = new JButton("Login"); 
		pane.add(login);
		pane.add(userLabel);
		pane.add(passLabel);
		pane.add(textField);
		pane.add(passField);
		login.setBounds(20, 150, 80, 30);
		userLabel.setBounds(50, 30, 80, 30);
		passLabel.setBounds(50, 80, 80, 30);
		textField.setBounds(150, 30, 150, 30);
		passField.setBounds(150, 80, 150, 30);
		
		
	}

}
