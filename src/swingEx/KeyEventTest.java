package swingEx;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyEventTest extends JFrame {
	JPanel p = new JPanel();
	JLabel [] lbMsg;
	
	public KeyEventTest() {
		super("Key Event Ex");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setContentPane(p);
		
		lbMsg = new JLabel[3];
		
		lbMsg[0] = new JLabel(" Keycode ");//아소키코드
		lbMsg[1] = new JLabel(" Unicode ");
		lbMsg[2] = new JLabel(" Keyboard ");
		
		for(int i=0;i<lbMsg.length;i++) {
			p.add(lbMsg[i]);
			lbMsg[i].setOpaque(true); //불투명도
			lbMsg[i].setBackground(Color.RED);
		}
		
		p.addKeyListener(new EventHandler());
		
		setSize(500, 300);
		setVisible(true);
			
		p.requestFocus(); //항상 p가 이벤트 소스가 되게해줌
	}
	
	public class EventHandler extends KeyAdapter{
		public void keyPressed(KeyEvent ke) {
			int keyCode = ke.getKeyCode();
			char keyChar = ke.getKeyChar();
			
			lbMsg[0].setText(Integer.toString(keyCode)); //keycode저장
			lbMsg[1].setText(Character.toString(keyChar)); //키 문자 저장
			lbMsg[2].setText(ke.getKeyText(keyCode));	
			
		}
	}

	public static void main(String[] args) {
		new KeyEventTest ();
		
		}
		
	}


