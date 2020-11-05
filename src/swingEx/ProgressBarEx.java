package swingEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.border.Border;


public class ProgressBarEx extends JFrame {

	Container cp;
	JProgressBar pb;
	JButton btn;
	
	public ProgressBarEx() {
		super("ProgressBar test");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		cp=getContentPane();
		cp.setLayout(new FlowLayout());
		
		pb= new JProgressBar(0,100);
		Border border = BorderFactory.createTitledBorder("reading data...");
		pb.setBorder(border);
		pb.setStringPainted(true);
		
		btn = new JButton("start");
		
		btn.addActionListener(new EventHandler());
		
		cp.add(pb); cp.add(btn);
		setSize(400,100);
		setVisible(true);
		
	}
	
	class MyThread extends Thread{
		public void run() {
			for(int i=pb.getMinimum(); i<=pb.getMaximum();i++) {
				pb.setValue(pb.getMaximum() - i);
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
	
	class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			Object obj = ae.getSource();
			
			if(obj == btn) {
				MyThread th = new MyThread();
				th.start();
			}
				
		}
	}
	
	public static void main(String[] args) {
		new ProgressBarEx();
	}

}
