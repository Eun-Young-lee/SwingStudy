package swingEx;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class JlistTest extends JFrame{
	Container cnp;
	String[] item = {"Seoul","Gyunggi","Busan","Daegoo","DaeJeon","Dublin","Cork","Masan","Ulsan","Gwangjoo"};
	
	public JlistTest(){
		super("Jlist Test");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cnp = this.getContentPane();
		cnp.setLayout(new FlowLayout());
		
		JList list = new JList(item);
		cnp.add(list);
		
		JList listScroll = new JList(item);
		JScrollPane sp = new JScrollPane(listScroll);
		cnp.add(sp);
		
		cnp.add(list);
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JlistTest();
	}

}
