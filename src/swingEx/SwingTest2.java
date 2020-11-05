package swingEx;

import java.awt.*;

import javax.swing.*;


public class SwingTest2 extends JFrame{

	public SwingTest2() {
		super(" Add component ");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.setBackground(Color.YELLOW);
		
		
		setSize(300,300);
		setVisible(true);	
		
		contentPane.add(new JButton("Check"));
		contentPane.add(new JButton("Cancel"));		
	
	}
	
	public static void main(String[] args) {
		new SwingTest2();		
		}
	}


