package swingEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboEvent extends JFrame {
	Container cnp;
	String[] lang = {"C language"," C++", "JAVA"};
	ImageIcon[] img = {
			new ImageIcon("square.jpg"),
			new ImageIcon("Heart.jpg"),
			new ImageIcon("circle.jpg"),			
	};
	
	JLabel imglb = new JLabel(img[0]);
	
	public ComboEvent() {
		super("combo box event");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		cnp=getContentPane();
		cnp.setLayout(new FlowLayout());
		
		JComboBox comb=new JComboBox(lang);
		
		comb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				JComboBox obj = (JComboBox)ae.getSource();
				int idx =  obj.getSelectedIndex();
				imglb.setIcon(img[idx]);
			}			
		});
		
		cnp.add(comb); cnp.add(imglb);
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ComboEvent();
	}

}
