package javaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Window.Type;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(64, 70, 96, 22);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(216, 72, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(64, 116, 65, 14);
		contentPane.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "Hello");
				
				//===============login Form Validation==============
				if(textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(textField, "username does not blank!!"); 
					//(textField , "username does not blank!!") writing textField in place of null displays the message inside the page. 
					return;
				}
				if(passwordField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(passwordField, "password does not blank!!"); 
					//(textField , "username does not blank!!") writing textField in place of null displays the message inside the page. 
					return;
				}
				
				
				String uName = textField.getText();
				String Psw = String.valueOf(passwordField.getPassword());
//				String Psw = passwordField.getText();
				
				if(uName.equals("Ram") && Psw.equals("123")) {
				
					//JOptionPane.showMessageDialog(null, "login successful!!");
					new HomePage().setVisible(true);
					dispose();
				
				}else {
				JOptionPane.showMessageDialog(null, "login Failed");
			}
				
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogin.setBackground(Color.DARK_GRAY);
		btnLogin.setBounds(230, 186, 75, 23);
		contentPane.add(btnLogin);
		
		JLabel lblUserLogin = new JLabel("User login");
		lblUserLogin.setForeground(new Color(0, 0, 153));
		lblUserLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUserLogin.setBounds(156, 26, 75, 33);
		contentPane.add(lblUserLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(216, 114, 96, 20);
		contentPane.add(passwordField);
	}
}
