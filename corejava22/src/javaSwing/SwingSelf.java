package javaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingSelf {

public static void main(String[] args) {
	
	JFrame jf = new JFrame();
	jf.setSize(700, 700);
	jf.setTitle("Google login");
	
	jf.setLayout(null);
	
	JLabel jf1 = new JLabel("Email Id");
	jf1.setBounds(200, 200, 100, 20);
	jf.add(jf1);
	
	JTextField jf2 = new JTextField();
	jf2.setBounds(300, 200, 100, 20);
	jf.add(jf2);
	
	JLabel jf3 = new JLabel("Password");
	jf3.setBounds(200, 250, 100, 20);
	jf.add(jf3);
	
	JTextField jf4 = new JTextField();
	jf4.setBounds(300, 250, 100, 20);
	jf.add(jf4);
	
	JButton jf5 = new JButton("Log in ");
	jf5.setBounds(300, 300, 75,20);
	jf.add(jf5);
	
	
	
	
	jf.setVisible(true);
	
	
}
}
