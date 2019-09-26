package javaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserPasswordLogin {
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		
		jf.setSize(700, 700);
		jf.setTitle("Log in");
		jf.setLayout(null);
		
		JLabel jl = new JLabel("User Name");
		jl.setBounds(200, 100, 75, 20);
		
		JTextField jt = new JTextField();
		jt.setBounds(300, 100, 75, 20);
		
		jf.add(jl);
		jf.add(jt);
		
		JLabel jj = new JLabel("Password");
		jj.setBounds(200, 150, 75, 20);
		jf.add(jj);
		
		JPasswordField jp = new JPasswordField();
		jp.setBounds(300, 150, 75, 20);
		jf.add(jp);
		
		JButton ji = new JButton("Log in");
		ji.setBounds(300, 200, 75, 20);
		jf.add(ji);
		
		
		jf.setVisible(true);
	}

}
