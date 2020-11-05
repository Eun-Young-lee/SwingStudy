package threadStudy;

/*
 * public class RunnableThread implements Runnable{ int a; String name;
 * 
 * public RunnableThread(String name, int i) { this.name = name; this.a = i;
 * 
 * }
 * 
 * public void run() { int total = 0; for(int i=0; i<a;i++) { try {
 * Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
 * total+=i; System.out.println(name + ":" +total); } }
 * 
 * public static void main(String[] args) { RunnableThread rt= new
 * RunnableThread("thread_1",3); RunnableThread rt1= new
 * RunnableThread("thread_2",3);
 * 
 * Thread tr = new Thread(rt); Thread tr2 = new Thread(rt1);
 * 
 * tr.start(); tr2.start();
 * 
 * } }
 */

public class RunnableThread implements Runnable{
	int a;
		
	public RunnableThread(int i) {
		this.a = i;
		Thread th = new Thread(this);
		th.start();				
	}
	
	public void run() {
		int total = 0;
		for(int i=0; i<a;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			total+=i;
			System.out.println(Thread.currentThread().getName() + ":"+total);
		}
	}
	
	public static void main(String[] args) {
		
		RunnableThread rt = new RunnableThread(3);
		RunnableThread rt1 = new RunnableThread(3);
		RunnableThread rt2 = new RunnableThread(3);

	
	}
}
