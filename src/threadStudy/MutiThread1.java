package threadStudy;

import javax.swing.JOptionPane;

public class MutiThread1 {

	public static void main(String[] args) {
		ThreadDemo1 th = new ThreadDemo1();
		th.start();
		String input= JOptionPane.showInputDialog("input contents");
		System.out.println("input :" + input);		
	}
}

class ThreadDemo1 extends Thread{
	
	public void run() {
		for(int i= 10; i>0 ;i--) {
			System.out.println(i);
			try{
			Thread.sleep(1000);
		}catch(Exception e) {}
	}

	}

}
