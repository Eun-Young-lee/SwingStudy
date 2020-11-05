package swingEx;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ColorChooserEx extends JFrame{
	Container cp;
	JLabel lb = new JLabel("Hello");
	
	public ColorChooserEx() {
		super("Color Pallet Ex");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		cp = this.getContentPane();
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		lb.setFont(new Font("Arial",Font.BOLD,30));
		lb.setOpaque(true);
		makeMenu();
		cp.add(lb);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public void makeMenu() {
		JMenuBar mb= new JMenuBar();
		JMenu menu = new JMenu("Choose Color");
		JMenuItem item = new JMenuItem("Color");
		
		item.addActionListener(new Eventhandler());
		
		menu.add(item);
		mb.add(menu);
		setJMenuBar(mb);
		
	}
	
	class Eventhandler implements ActionListener{
		JColorChooser chooser = new JColorChooser();
			
		public void actionPerformed(ActionEvent ae) {
			String cmd = ae.getActionCommand(); //해당 이벤트 소스(item-color) 을 불러옴
		
			if(cmd.equals("Color")) {
				Color selColor = chooser.showDialog(null, "color pallet", Color.green);
				
				if(selColor!=null)
					lb.setForeground(selColor);
					lb.setBackground(selColor);
			}
		}
			
	}
	
	public static void main(String[] args) {
		new ColorChooserEx();
	}

}
