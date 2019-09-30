package javaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class FacebookForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtFirstName;
	private JTextField txtSurname;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacebookForm frame = new FacebookForm();
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
	public FacebookForm() {
		setTitle("Facebook");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1039, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 647, 75);
		panel.setBackground(new Color(0, 102, 204));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFacebook = new JLabel("facebook");
		lblFacebook.setFont(new Font("Uptight", Font.BOLD, 12));
		lblFacebook.setBounds(10, 11, 79, 25);
		panel.add(lblFacebook);
		
		JLabel lblEmailOrPhone = new JLabel("Email or Phone");
		lblEmailOrPhone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmailOrPhone.setBounds(357, 11, 91, 14);
		panel.add(lblEmailOrPhone);
		
		textField = new JTextField();
		textField.setBounds(357, 30, 79, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(466, 11, 56, 14);
		panel.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(466, 30, 79, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.setBackground(new Color(0, 128, 128));
		btnLogIn.setForeground(new Color(0, 0, 0));
		btnLogIn.setBounds(569, 29, 68, 23);
		panel.add(btnLogIn);
		
		JLabel lblForgottenPassword = new JLabel("Forgotten Account ?");
		lblForgottenPassword.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblForgottenPassword.setBounds(357, 50, 99, 14);
		panel.add(lblForgottenPassword);
		
		JLabel lblCreateANew = new JLabel("Create a new account");
		lblCreateANew.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCreateANew.setBounds(376, 86, 175, 14);
		contentPane.add(lblCreateANew);
		
		JLabel lblItsVeryQuick = new JLabel("It's quick and easy");
		lblItsVeryQuick.setBounds(376, 111, 125, 14);
		contentPane.add(lblItsVeryQuick);
		
		txtFirstName = new JTextField();
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(386, 136, 96, 20);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtSurname = new JTextField();
		txtSurname.setText("Surname");
		txtSurname.setBounds(541, 134, 96, 20);
		contentPane.add(txtSurname);
		txtSurname.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(396, 170, 204, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}
}
