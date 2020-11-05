package threadStudy;

public class ThreadEx extends Thread{

	int a;
	
	public ThreadEx(String name, int i) {
		super(name);
		this.a = i;
	}
	
	public void run() {
		int total = 0;
		for(int i=0; i<a;i++) {
			try {
				this.sleep(500);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			total +=i;
			System.out.println(getName()+":"+total);
		}
	}
	
	
	public static void main(String[] args) {
		ThreadEx tr = new ThreadEx("thread_1",3);
		ThreadEx tr2 = new ThreadEx("thread_2",3);
	
		tr.start();
		tr2.start();
		
	}
}
