package swingEx;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class CheckBoxTest extends JFrame{
	Container cnp;
	JLabel lb1,lb2;
	JCheckBox [] lang=new JCheckBox[3];
	String[] langName = {"C language", "java", "C++"};
	int sum;	


	public CheckBoxTest() {
		super ("check box test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		cnp=getContentPane();
		cnp.setLayout(new FlowLayout());
		
		lb1 = new JLabel("choose class!");
		
		ImageIcon imgIcon = new ImageIcon("circle.jpg");
		ImageIcon imgChecked = new ImageIcon("square.jpg");
		
		cnp.add(lb1);
		
		for(int i =0; i<lang.length;i++) {
			lang[i] = new JCheckBox(langName[i]);
			lang[i].setBorderPainted(true);
			lang[i].addItemListener(new EventHandler());
			cnp.add(lang[i]);
			}
		/*
		JCheckBox Clang = new JCheckBox("c language");
		JCheckBox java = new JCheckBox("java", imgIcon);
		JCheckBox Cpp = new JCheckBox("c++");
		
		java.setBorderPainted(true); //해당 체크박스 테두리
		Clang.setBorderPainted(true); 		
		Cpp.setBorderPainted(true); 

		java.setSelectedIcon(imgChecked);
		
		
		cnp.add(Clang);
		cnp.add(java);
		cnp.add(Cpp);
		*/
		
		lb2 = new JLabel("fee is 0");
		//cnp.add(lb1);
		cnp.add(lb2);

		
		setSize(300,300);
		setVisible(true);
	}

	
	class EventHandler implements ItemListener{
		public void itemStateChanged(ItemEvent ie) {
			int chksw = 1;
			
			if(ie.getStateChange()==ItemEvent.SELECTED) 
				chksw =1;
			else 
				chksw = -1;
				
			if(ie.getItem()==lang[0]) 
				sum = sum + chksw*10000;
			else if(ie.getItem() ==lang[1]) 
				sum = sum +chksw *20000;
			else if(ie.getItem()==lang[2]) 
				sum = sum +chksw *15000;
			
			lb2.setText("Your fee is" + sum );
			}
	}


	public static void main(String[] args) {
		new CheckBoxTest();
	}
}
	

