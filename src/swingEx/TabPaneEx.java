package swingEx;

import java.awt.*;
import javax.swing.*;

public class TabPaneEx extends JFrame {
	Container cp;
	
	public TabPaneEx() {
		super("TapPane Ex");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		cp = this.getContentPane();
		
		JTabbedPane tp = makeTab(); //makeTab: tap을 생성하는 메소드 
		cp.add(tp, BorderLayout.CENTER);
		this.setSize(300,300);
		this.setVisible(true);
	
	}
	
	public JTabbedPane makeTab(){
		JTabbedPane tp = new JTabbedPane();
		tp.addTab("C language", new JLabel(new ImageIcon("c_img.jpg")));
		tp.addTab("JAVA", new JLabel(new ImageIcon("java_img.jpg")));
		tp.addTab("Graphic", new MyPanel());
		return tp;
	}
	
	class MyPanel extends JPanel{
		public MyPanel(){
			this.setBackground(Color.green);			
		}
		
		public void paintComponent(Graphics g){
			super.paintComponent(g); //JPanel에서 기본적으로 제공
			g.setColor(Color.BLUE);
			g.drawRect(100, 100, 100, 100);
			g.setColor(Color.red);
			g.drawOval(10,10, 100, 100);			
		}	
		
	}	

	public static void main(String[] args) {
		new TabPaneEx();
		
	}

}
