package javaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableForm extends JFrame {

	private JPanel contentPane;
	private JTextField nameTxt;
	private JTextField addressTxt;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableForm frame = new TableForm();
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
	public TableForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 35, 48, 14);
		contentPane.add(lblName);
		
		nameTxt = new JTextField();
		nameTxt.setBounds(49, 32, 78, 20);
		contentPane.add(nameTxt);
		nameTxt.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(149, 35, 48, 14);
		contentPane.add(lblAddress);
		
		addressTxt = new JTextField();
		addressTxt.setBounds(207, 32, 57, 20);
		contentPane.add(addressTxt);
		addressTxt.setColumns(10);
		
		JLabel lblCollege = new JLabel("College");
		lblCollege.setBounds(285, 35, 48, 14);
		contentPane.add(lblCollege);
		
		JComboBox collegeTxt = new JComboBox();
		collegeTxt.setModel(new DefaultComboBoxModel(new String[] {"select", "NCC", "KEC", "MIT", "IIT", "CIT"}));
		collegeTxt.setBounds(331, 31, 78, 22);
		contentPane.add(collegeTxt);
		
		JLabel Gender = new JLabel("Gender");
		Gender.setBounds(10, 76, 48, 14);
		contentPane.add(Gender);
		
		JRadioButton malerbtn = new JRadioButton("Male");
		buttonGroup.add(malerbtn);
		malerbtn.setBounds(54, 72, 57, 23);
		contentPane.add(malerbtn);
		
		JRadioButton femalerbtn = new JRadioButton("Female");
		buttonGroup.add(femalerbtn);
		femalerbtn.setBounds(128, 72, 61, 23);
		contentPane.add(femalerbtn);
		
		JCheckBox agreechk = new JCheckBox("Agree");
		agreechk.setBounds(215, 72, 69, 23);
		contentPane.add(agreechk);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 101, 414, 2);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 114, 402, 136);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Address", "college" ,"Gender ", "Agree"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton Save = new JButton("Save");
		Save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String name = nameTxt.getText();
				String adr = addressTxt.getText();
				String colg = collegeTxt.getSelectedItem().toString();
				
				String gender;
				
				if(malerbtn.isSelected()) {
					gender = "male";
				}else {
					gender = "female";
				}
				
				String check;
				if(agreechk.isSelected()) {
					
					check = "Yes";
				}else {
					check = "no";
				}
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] { name , adr , colg ,gender ,check});
			}
		});
		Save.setBounds(331, 72, 69, 23);
		contentPane.add(Save);
	}
}
