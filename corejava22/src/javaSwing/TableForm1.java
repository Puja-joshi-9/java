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
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableForm1 extends JFrame {

	private JPanel contentPane;
	private JTextField nameTxt;
	private JTextField addressTxt;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableForm1 frame = new TableForm1();
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
	public TableForm1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 11, 48, 14);
		contentPane.add(lblName);
		
		nameTxt = new JTextField();
		nameTxt.setBounds(43, 8, 70, 20);
		contentPane.add(nameTxt);
		nameTxt.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(136, 11, 48, 14);
		contentPane.add(lblAddress);
		
		addressTxt = new JTextField();
		addressTxt.setBounds(183, 8, 70, 20);
		contentPane.add(addressTxt);
		addressTxt.setColumns(10);
		
		JLabel lblCollege = new JLabel("College");
		lblCollege.setBounds(275, 11, 48, 14);
		contentPane.add(lblCollege);
		
		JComboBox collegeTxt = new JComboBox();
		collegeTxt.setModel(new DefaultComboBoxModel(new String[] {"Select", "KU", "PU", "TU", "FU", "PoU"}));
		collegeTxt.setBounds(320, 7, 70, 22);
		contentPane.add(collegeTxt);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 57, 48, 14);
		contentPane.add(lblGender);
		
		JRadioButton malerbtn = new JRadioButton("Male");
		buttonGroup.add(malerbtn);
		malerbtn.setBounds(62, 53, 58, 23);
		contentPane.add(malerbtn);
		
		JRadioButton femalerbtn = new JRadioButton("Female");
		buttonGroup.add(femalerbtn);
		femalerbtn.setBounds(122, 53, 70, 23);
		contentPane.add(femalerbtn);
		
		JCheckBox agreechk = new JCheckBox("Agree");
		agreechk.setBounds(221, 53, 60, 23);
		contentPane.add(agreechk);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 82, 414, 2);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 95, 414, 155);
		contentPane.add(scrollPane);
		
		

		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Address", "College" , "Gender","Agree"
			}
		));
		table.setShowHorizontalLines(false);
		scrollPane.setViewportView(table);
		
		JButton save = new JButton("Save");
		save.addActionListener(new ActionListener() {
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
 				check ="No";
 			}
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[] { name , adr , colg ,gender ,check});
			}
		});
		save.setBounds(320, 53, 58, 23);
		contentPane.add(save);
		
		
				
	}
}
