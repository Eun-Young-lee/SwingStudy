package threadStudy;

import javax.swing.JOptionPane;

public class SingleThread1 {

	public static void main(String[] args) throws Exception {
		String input= JOptionPane.showInputDialog("input contents");
		System.out.println("input :" + input);
		
		for(int i= 10; i>0 ;i--) {
			System.out.println(i);
			try{
			Thread.sleep(1000);
		}catch(Exception e) {}
		}

	}

}
