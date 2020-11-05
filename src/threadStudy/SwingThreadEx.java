package threadStudy;

import java.awt.*;

import javax.swing.*;

public class SwingThreadEx extends JFrame {

	public SwingThreadEx() {
		super("Thread ex");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		JLabel lb = new JLabel();
		lb.setFont(new Font("Arial", Font.ITALIC, 60));
		
      //TimeThread th = new TimeThread(lb);

        TimeThread thr = new TimeThread(lb);
		Thread th = new Thread(thr);
		
		cp.add(lb);
		
		setSize(300,200);
		setVisible(true);
		
		th.start();
	}
	
	public static void main(String[] args) {
		new SwingThreadEx();
	}

}

/*
 * class TimeThread extends Thread{ JLabel timelb;
 * 
 * public TimeThread(JLabel timelb) { this.timelb = timelb; }
 * 
 * public void run() { int n = 0;
 * 
 * while(true) { timelb.setText(Integer.toString(n)+"  "); n++; try {
 * sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); } } } }
 */


class TimeThread implements Runnable{
	JLabel timelb;
	
	public TimeThread(JLabel timelb) {
		this.timelb = timelb;
	}
	
	public void run() {
		int n = 0;
		
		while(true) {
			timelb.setText(Integer.toString(n)+"  ");
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
