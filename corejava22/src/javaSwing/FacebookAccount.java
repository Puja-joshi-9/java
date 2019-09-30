package javaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;

public class FacebookAccount extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtFirstName;
	private JTextField txtSurname;
	private JTextField txtMobileNumberOr;
	private JTextField txtNewPassword;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacebookAccount frame = new FacebookAccount();
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
	public FacebookAccount() {
		setTitle("Facebook");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1046, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 204));
		panel.setBounds(0, 0, 1030, 94);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(499, 5, 0, 0);
		panel.add(label);
		
		JLabel lblFacebook = new JLabel("facebook");
		lblFacebook.setForeground(SystemColor.text);
		lblFacebook.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblFacebook.setBounds(85, 31, 141, 28);
		panel.add(lblFacebook);
		
		JLabel lblEmailOrPhone = new JLabel("Email or Phone");
		lblEmailOrPhone.setForeground(SystemColor.text);
		lblEmailOrPhone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmailOrPhone.setBounds(620, 16, 96, 14);
		panel.add(lblEmailOrPhone);
		
		textField = new JTextField();
		textField.setBounds(620, 41, 127, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(SystemColor.text);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(775, 16, 74, 14);
		panel.add(lblPassword);
		
		JLabel lblNewLabel = new JLabel("Forgotten Account?");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(775, 69, 118, 14);
		panel.add(lblNewLabel);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.setForeground(new Color(0, 0, 0));
		btnLogIn.setBackground(new Color(72, 209, 204));
		btnLogIn.setBounds(915, 40, 74, 23);
		panel.add(btnLogIn);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(775, 41, 118, 20);
		panel.add(passwordField);
		
		JLabel lblCreate = new JLabel("Create a new account");
		lblCreate.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblCreate.setBounds(615, 104, 315, 32);
		contentPane.add(lblCreate);
		
		JLabel lblItsQuickAnd = new JLabel("It's quick and easy.");
		lblItsQuickAnd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblItsQuickAnd.setBounds(625, 147, 158, 20);
		contentPane.add(lblItsQuickAnd);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFirstName.setForeground(SystemColor.inactiveCaption);
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(615, 188, 182, 32);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtSurname = new JTextField();
		txtSurname.setForeground(SystemColor.inactiveCaption);
		txtSurname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSurname.setText("Surname");
		txtSurname.setBounds(807, 188, 149, 32);
		contentPane.add(txtSurname);
		txtSurname.setColumns(10);
		
		txtMobileNumberOr = new JTextField();
		txtMobileNumberOr.setForeground(SystemColor.inactiveCaption);
		txtMobileNumberOr.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMobileNumberOr.setText("Mobile number or email address");
		txtMobileNumberOr.setBounds(615, 231, 341, 32);
		contentPane.add(txtMobileNumberOr);
		txtMobileNumberOr.setColumns(10);
		
		txtNewPassword = new JTextField();
		txtNewPassword.setForeground(SystemColor.inactiveCaption);
		txtNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNewPassword.setText("New Password");
		txtNewPassword.setBounds(615, 284, 341, 32);
		contentPane.add(txtNewPassword);
		txtNewPassword.setColumns(10);
		
		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setForeground(UIManager.getColor("TextPane.inactiveForeground"));
		lblBirthday.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBirthday.setBounds(615, 326, 70, 20);
		contentPane.add(lblBirthday);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(648, 378, -21, 10);
		contentPane.add(panel_1);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(UIManager.getColor("TextField.darkShadow"));
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGender.setBounds(615, 388, 70, 14);
		contentPane.add(lblGender);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(625, 409, 21, 28);
		contentPane.add(radioButton);
		
		JLabel lblMale = new JLabel("Male");
		lblMale.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMale.setBounds(648, 423, 48, 14);
		contentPane.add(lblMale);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(744, 409, 21, 28);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBounds(847, 409, 21, 28);
		contentPane.add(radioButton_2);
		
		JLabel lblFemale = new JLabel("Female");
		lblFemale.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFemale.setBounds(766, 423, 48, 14);
		contentPane.add(lblFemale);
		
		JLabel lblCustom = new JLabel("Custom");
		lblCustom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCustom.setBounds(868, 424, 48, 14);
		contentPane.add(lblCustom);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(328, 368, -34, 20);
		contentPane.add(formattedTextField);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(1), null, null, new Integer(1)));
		spinner.setBounds(615, 357, 40, 20);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerListModel(new String[] {"Jan", "Feb", "Mar ", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}));
		spinner_1.setBounds(677, 357, 48, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerListModel(new String[] {}));
		spinner_2.setBounds(744, 357, 40, 20);
		contentPane.add(spinner_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(264, 231, 48, -19);
		contentPane.add(separator);
	}
}
