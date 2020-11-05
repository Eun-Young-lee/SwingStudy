package threadStudy;

public class SingleThread {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<1000;i++) {
			System.out.print("*");
		}
		
		System.out.println("time: " +(System.currentTimeMillis()-startTime));

		for(int i=0; i<1000;i++) {
			System.out.print("#");
		}
		System.out.println("time: " +(System.currentTimeMillis()-startTime));

	}

}
