package threadStudy;

public class MultiThread {
	static long startTime = 0;

	public static void main(String[] args) {
		ThreadDemo th = new ThreadDemo();
		th.start();
		
		startTime = System.currentTimeMillis();
		for(int i=0; i<1000;i++) {
			System.out.print("*");
		}
		
		System.out.println("time: "+ (System.currentTimeMillis()-startTime));
	}

}

class ThreadDemo extends Thread{
	public void run() {
		for(int i=0; i<300;i++) {
			System.out.print("#");
	}
		System.out.println("time: "+ (System.currentTimeMillis()-MultiThread.startTime));
	}
}