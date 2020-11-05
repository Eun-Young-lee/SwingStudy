package threadStudy;

import javax.swing.JOptionPane;

public class MultiThread2 {
	
	static boolean chk = false;
	
	public static void main(String[] args) {
		ThreadDemo2 th1 = new ThreadDemo2();
		ThreadDemo3 th2 = new ThreadDemo3();

		th1.start();
		th2.start();
	}

}

class ThreadDemo2 extends Thread{
	
	public void run() {
		for(int i= 10; i>0 ;i--) {
			if(MultiThread2.chk) return; // 현재 메소드를 빠져나간다
			
			System.out.println(i);
			try{
			Thread.sleep(1000);
		}catch(Exception e) {}
			
	} System.out.println("pass 10sec, end program");
	  System.exit(0);		
	}
}


class ThreadDemo3 extends Thread{
	public void run() {
		System.out.println("input in 10 seconds!");
	String input= JOptionPane.showInputDialog("input contents");
	
	MultiThread2.chk = true;
	System.out.println("input :" + input);
	}
}
