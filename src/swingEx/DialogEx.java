package swingEx;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyDialog extends JDialog{
	JTextField input = new JTextField(8);
	JButton btn = new JButton("Check");
	
	public MyDialog(JFrame frame, String title) {
		super (frame, title);
		setLayout(new FlowLayout());
		this.add(input);
		this.add(btn);
		this.setSize(200, 200);
		
		btn.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			 setVisible(false);
		 }
		});
	}
}


public class DialogEx extends JFrame{
	Container cp;
	MyDialog myDialog = new MyDialog(this, "Dialog ex");
	
	public DialogEx() {
		super("DialogEx");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("open Dialog");
		btn.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
			myDialog.setVisible(true);
		}		
		});
		
		cp=this.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(btn);
		
		this.setSize(300, 300);
		this.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new DialogEx();
	}

}
