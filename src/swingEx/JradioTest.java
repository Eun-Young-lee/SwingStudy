package swingEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class JradioTest extends JFrame{
	
	Container cnp;	
	JRadioButton [] lang=new JRadioButton[3];
	String [] str = {"C language", "java","C++"};
	ImageIcon [] img = 
	   {new ImageIcon("circle.jpg"),
		new ImageIcon("square.jpg"),
		new ImageIcon("Heart.jpg")
		};
	
	JLabel lb = new JLabel("", JLabel.CENTER);
	
	public JradioTest() {
		super("radio button test");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		cnp=this.getContentPane();
		/*
		cnp.setLayout(new FlowLayout());
				
		ImageIcon imgIcon = new ImageIcon("circle.jpg");
		ImageIcon imgChecked = new ImageIcon("square.jpg");
		*/
		
		JPanel pan = new JPanel();
		pan.setBackground(Color.GREEN);
		
		ButtonGroup group = new ButtonGroup();
		for(int i =0; i<lang.length;i++) {
			lang[i] = new JRadioButton(str[i]);
			lang[i].setOpaque(false);
			group.add(lang[i]);
			pan.add(lang[i]);	
			
			lang[i].addItemListener(new EventHandler());
		}
		
		lang[1].setSelected(true);
		
		cnp.add(pan,"North");
		cnp.add(lb,"Center");
		
		
	//	lb.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		/*
		JRadioButton cLang = new JRadioButton("C language");
		JRadioButton java = new JRadioButton("JAVA", imgIcon);
		JRadioButton cpp = new JRadioButton("C++");
		 
	 
		java.setBorderPainted(true);
		java.setSelectedIcon(imgChecked);
		
		group.add(cLang);group.add(java);group.add(cpp);
		
		cnp.add(cLang);cnp.add(java);cnp.add(cpp);
		*/
		
		setSize(300,300);
		setVisible(true);			
	}
	
	class EventHandler implements ItemListener{
		public void itemStateChanged(ItemEvent ie) {
			if(lang[0].isSelected()) 
				lb.setIcon(img[0]);
			
			else if(lang[2].isSelected())
				lb.setIcon(img[2]);
			
			else
				lb.setIcon(img[1]);
	}
}
	
	public static void main(String[] args) {
		new JradioTest();
	}
}


