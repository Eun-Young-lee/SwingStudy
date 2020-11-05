package swingEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class JButtonTest extends JFrame {
	
	Container cnp;
	JButton btn;


	public JButtonTest(){
		setTitle("button test ex");
		
		cnp = this.getContentPane();
		//cnp.setLayout(new FlowLayout());
		cnp.setLayout(new GridLayout(1,0));
		
		ImageIcon icon1 = new ImageIcon("square.jpg");
		ImageIcon icon2 = new ImageIcon("circle.jpg");
		ImageIcon icon3 = new ImageIcon("Heart.jpg");

		btn = new JButton("play", icon1);
		btn.setHorizontalAlignment(SwingConstants.RIGHT);
		btn.setVerticalAlignment(SwingConstants.CENTER);
		
		btn.setHorizontalTextPosition(JButton.LEFT);
		btn.setVerticalTextPosition(JButton.BOTTOM);
		
		btn.setToolTipText("Balloon..");
	//	btn.setBorder(new LineBorder(Color.BLUE, 5));
	//	btn.setBorder(new TitledBorder("title button"));
		btn.setBorder(new BevelBorder(BevelBorder.RAISED)); //입체감
		btn.setBorder(new EtchedBorder(Color.cyan, Color.red));
			
		btn.setRolloverIcon(icon2);
		btn.setPressedIcon(icon3);
		cnp.add(btn);		
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		setSize(100,100);
		setVisible(true);
	}

	

	public static void main(String[] args) {
		new JButtonTest();
	}
	}


