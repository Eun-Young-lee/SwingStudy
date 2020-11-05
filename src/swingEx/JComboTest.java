package swingEx;

import java.awt.*;

import javax.swing.*;

public class JComboTest extends JFrame {
	Container cnp;
	String[] item = {"Seoul","Jajoo","Busan","Daegoo","DaeJeon","Dublin","Cork","Masan","Ulsan","Gwangjoo"};

	public JComboTest() {
		super("JComboBox Test");
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		cnp=getContentPane();
		cnp.setLayout(new FlowLayout());
		
		// 두가지 방법
		JComboBox comb = new JComboBox(item);
		
		JComboBox comb1 = new JComboBox();		
		for(int i = 0; i<item.length; i++) 
			comb1.addItem(item[i]);
		
		cnp.add(comb); cnp.add(comb1);
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JComboTest();
	}

}
