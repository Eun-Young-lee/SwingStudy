package threadStudy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ThreadFlag extends JFrame {
	ThreadDemo6 th;
	
	public ThreadFlag() {
		super("Flag ex");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		Container cp = this.getContentPane();
		
		cp.addMouseListener(new MouseAdapter() {
			public void mousepPressed(MouseEvent me) {
				 th.kill();
			}
		});
		
		th = new ThreadDemo6(cp);
		
		setSize(500,500);
		setVisible(true);
		
		th.start();	
	}


	public static void main(String[] args) {
		new ThreadFlag();
	}
}

class ThreadDemo6 extends Thread{
	Container cp;
	boolean flag = false;
	
	public ThreadDemo6(Container cp) {
		this.cp=cp;
	}
	
	void kill() {
		flag = true;
	}
	
	public void run() {
		while(true) {
			int x =(int)(Math.random()*cp.getWidth());
			int y = (int)(Math.random()*cp.getHeight());
			
			JLabel lb = new JLabel("Hi JAVA!");
			lb.setSize(100,30);
			lb.setLocation(x,y);
			cp.add(lb);
			cp.repaint();
			try {
				sleep(500);
				if(flag ==true) {
					cp.removeAll();
					lb=new JLabel("thread end");
					lb.setSize(100,30);
					lb.setLocation(250,250);
					lb.setForeground(Color.RED);
					cp.add(lb);
					cp.repaint();
					return;
				}
				
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

