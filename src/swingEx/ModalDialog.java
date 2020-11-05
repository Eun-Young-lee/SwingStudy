package swingEx;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyDialog1 extends JDialog{
	JTextField input = new JTextField(8);
	JButton btn = new JButton("Check");
	
	public MyDialog1(JFrame frame, String title) {
		super (frame, title, true); //true:modal dialog 설정
		setLayout(new FlowLayout());
		this.add(input);
		this.add(btn);
		this.setSize(200, 100);
		
		btn.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			 setVisible(false);
		 }
		});
	}
	public String getInput() {
		if (input.getText().length() == 0) return null;
		return input.getText();
	}
}



public class ModalDialog extends JFrame{
	Container cp;
	MyDialog1 myDialog = new MyDialog1(this, "Modal Dialog ex");
	JButton btn;
	
	public ModalDialog() {
		super("DialogEx");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		btn = new JButton("open ModalDialog");
		btn.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
			myDialog.setVisible(true);
			
			String str = myDialog.getInput();
			JButton btn=(JButton)e.getSource();
			btn.setText(str);
		}		
		});
		
		cp=this.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(btn);
		
		this.setSize(300, 300);
		this.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new ModalDialog();

	}

}
