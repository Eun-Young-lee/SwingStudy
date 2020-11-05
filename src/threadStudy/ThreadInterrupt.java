package threadStudy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class ThreadDemo5 implements Runnable{
	JLabel lb;
	
	public ThreadDemo5(JLabel lb) {
		this.lb = lb;
	}
	
	public void run() {
		int n=0;
		while(true) {
			lb.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return; //run()메소드 종료, 반환타입이 void 일때만 가능
			}
		}
	}
	
}

public class ThreadInterrupt extends JFrame{
	Thread th;
	
	public ThreadInterrupt() {
		super("thread interrupt ex");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
				
		JLabel lb = new JLabel();
		lb.setFont(new Font("Arial", Font.BOLD,60));
		
		ThreadDemo5 thr = new ThreadDemo5(lb);
		th = new Thread(thr);
		
		JButton btn = new JButton("Thread Interrupt");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			th.interrupt();
			JButton btn = (JButton)e.getSource();
			btn.setBackground(Color.red);			
			}			
		});
		
		cp.add(lb);
		cp.add(btn);
		
		setSize(300,200);
		setVisible(true);
		
		th.start();
		
	}

	public static void main(String[] args) {
		new ThreadInterrupt();

	}

}
