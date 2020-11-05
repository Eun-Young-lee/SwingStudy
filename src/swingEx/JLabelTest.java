package swingEx;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;


public class JLabelTest extends JFrame {
	
	Container conp;
	
	public JLabelTest(){
		setTitle("Label test");
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		conp = getContentPane();
		
		conp.setLayout(new FlowLayout());
		
		JLabel lb1 = new JLabel("string");
		
		ImageIcon imgIcon = new ImageIcon("coffee.jpg");
		ImageIcon imgIcon1 = new ImageIcon("Heart.jpg");

		
		JLabel lb2 = new JLabel(imgIcon);
		JLabel lb3 = new JLabel("이미지1: ",imgIcon1,SwingConstants.LEFT);
		
		conp.add(lb1);
		conp.add(lb2);
		conp.add(lb3);

		setSize(500,500);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new JLabelTest();
	
	}

}
