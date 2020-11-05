package swingEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;


import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest3 extends JFrame {

	Container conP;
	JButton btn1, btn2,btn3, btn4;
	
	public SwingTest3() {
		super("button Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		conP = this.getContentPane();
		conP.setLayout(new FlowLayout());
		
		btn1 = new JButton("Button1"); //위치와 크기 버튼
		btn1.addActionListener(new Eventhandler());
		conP.add(btn1);
		
		btn2 = new JButton("Button2");
		btn2.setOpaque(true);
		btn2.setForeground(Color.BLUE);
		btn2.setBackground(Color.YELLOW);
		btn2.setFont(new Font("verdana", Font.BOLD, 20));
		btn2.addActionListener(new Eventhandler());

		conP.add(btn2);
		
		btn3 = new JButton("Button2");
		btn3.setEnabled(false);  //비활성화
		btn3.addActionListener(new Eventhandler());

		conP.add(btn3);
		
		btn4 = new JButton("Toggle");	
		btn4.addActionListener(new Eventhandler());

		conP.add(btn4);
		
				
		setSize(300,300);
		setVisible (true);
				
	}
	
	public class Eventhandler implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			Object obj = ae.getSource();
			if(obj == btn1) { //버튼의 위치와 크기 출력
				System.out.println("location: "+btn1.getX()+","+btn1.getY() +" size: "+btn1.getSize());
			}else if (obj ==btn2) {
				System.out.println("Font: "+btn2.getFont() +"color: "+btn2.getForeground());
			}else {
				if(btn1.isVisible()) {
					btn1.setVisible(false);
					btn2.setVisible(false);
					btn3.setVisible(false);
				}else {
					btn1.setVisible(true);
					btn2.setVisible(true);
					btn3.setVisible(true);

				}
			}
		}
}
			
						
	public static void main(String[] args) {
		new SwingTest3();
		
	}
	}
