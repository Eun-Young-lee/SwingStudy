package threadStudy;

public class PriorityThread {

	public static void main(String[] args) {
		ThreadDemo4 th1 = new ThreadDemo4();
		ThreadDemo4_1 th2=new ThreadDemo4_1();
		
		th2.setPriority(10);
		
		 System.out.println("th1 priority: "+ th1.getPriority());
		 System.out.println("th2 priority: "+ th2.getPriority());
		 
		
		th1.start();
		th2.start();
	}
}

class ThreadDemo4 extends Thread{
	public void run() {
		for(int i = 0; i<500 ; i++) {
			System.out.print("*");
			for(int n =0; n<1000000; n++);				
			/*
			 * try { sleep(50); } catch (InterruptedException e) { e.printStackTrace(); }
			 */
		}
	}	
}

class ThreadDemo4_1 extends Thread{
	public void run() {
		for(int i = 0; i<500 ; i++) {
			System.out.print("#");
			for(int n =0; n<1000000; n++);				
			/*
			 * try { sleep(50); } catch (InterruptedException e) { e.printStackTrace(); }
			 */			
	}
	}
}

