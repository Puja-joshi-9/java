package javaSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;



import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.Font;

public class IndexPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndexPage frame = new IndexPage();
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
	public IndexPage() {
		setTitle("Index");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(SystemColor.textInactiveText);
		menuBar.setBackground(SystemColor.activeCaption);
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmName = new JMenuItem("open");
		mntmName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new LoginForm().setVisible(true);
			}
		});
		mnFile.add(mntmName);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmShowHelp = new JMenuItem("Show Help");
		mnHelp.add(mntmShowHelp);
		
		JMenu mnDrinks = new JMenu("Drinks");
		menuBar.add(mnDrinks);
		
		JMenu mnSoftDrinks = new JMenu("soft drinks");
		mnDrinks.add(mnSoftDrinks);
		
		JMenuItem mntmSlice = new JMenuItem("slice");
		mnSoftDrinks.add(mntmSlice);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(26, 34, 139, 158);
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Acer\\Desktop\\IMG_2430.jpg").getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
	    contentPane.add(lblNewLabel);
	    
	    JLabel lblP = new JLabel("P");
	    lblP.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblP.setBounds(46, 203, 68, 25);
	    contentPane.add(lblP);

	    
	    JButton btnUpload = new JButton("Upload");
	    btnUpload.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		JFileChooser jf = new JFileChooser();  //NEW
	    		jf.showOpenDialog(null);               //NEW
	    
	    		
	    		
	    		java.io.File image = jf.getSelectedFile();
	    		
	    		//Check image size
	    		long size = image.length()/1024;
	    		
	    		String extension = image.getName().split("\\.")[1];
	    		
	    		if(!extension.equalsIgnoreCase("jpg")) {
	    			
	    			JOptionPane.showMessageDialog(null, "image should be in JPG");
	    			return;
	    		}
	    		//JOptionPane.showMessageDialog(null, "image size is"+" "+size);
	    		
	    		if(size > 300) {
	    			
	    			JOptionPane.showMessageDialog(null, "image size must be less than 300kb");
	    			return;
	    		}
	    		lblNewLabel.setIcon(new ImageIcon(new ImageIcon(image.getAbsolutePath()).getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
	    	    
	    		lblP.setText(image.getName());
	    	}
	    });
	    btnUpload.setBounds(223, 33, 89, 23);
	    contentPane.add(btnUpload);
	    
	   	}
}
