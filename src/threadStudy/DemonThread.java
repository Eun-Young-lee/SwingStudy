package threadStudy;

public class DemonThread implements Runnable {
	static boolean save;

	public static void main(String[] args) {
		Thread th = new Thread(new DemonThread());
		
		th.setDaemon(true); //데몬 스레드로 지정, 20이 되는 순간에 종료
		
		th.start(); //자식스레드
		
		for(int i =1; i<20; i++) {
			try{
				Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(i);
		if (i==3)
			save = true;
	}	
		System.out.println("program End");
}
	
public void run() {
	for(;;) {
		try {
			Thread.sleep(2*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	if(save) {
		save();
		}
	} //for
}
//run()


public void save() {
	System.out.println("save");
	}
}
