package javaSwing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestForm {
	
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		jf.setSize(600,600);
		jf.setTitle("Test Form");
		jf.setLayout(null);
		
		//Create jlabel
		
		JLabel jl = new JLabel("Nepal");
		//jl.setSize(50,20);
		jl.setBounds(250, 80, 50, 20);
		jf.add(jl);
		jf.setVisible(true);
	}

}
