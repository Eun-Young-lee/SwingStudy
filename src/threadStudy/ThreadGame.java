package threadStudy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ThreadGame extends JFrame{
	JPanel stage = new Stage("★", "◆", 'q', 100);
	
	public ThreadGame() {
		super("Thread Game");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		this.setContentPane(stage); //stage를 컨텐트 팬으로 사용
		
		this.setSize(500, 500);
		this.setVisible(true);		
		
		stage.requestFocus();
	}
	
	class Stage extends JPanel{
		String star;
		String diamondchar;
		long delayTime;
		char q; //종료 문자
		
		JLabel starLB;//별을 나타내는 레이블
		JLabel diamondLB; // 다이아몬드 레이블
		
		final int STAR_MOVE =10; //별이 한번에 움직이는 픽셀 수
		
		public Stage(String star, String diamondchar, char q, long delayTime) {
			this.star = star;
			this.diamondchar = diamondchar;
			this.q = q;
			this.delayTime = delayTime;
			
			starLB=new JLabel(star);
			diamondLB = new JLabel(diamondchar);
			
			this.setLayout(null); //위치값 자유자재
			this.addKeyListener(new EventHandler());
			
			starLB.setLocation(100, 100);//초기위치값
			starLB.setSize(15, 15);
			starLB.setForeground(Color.red);
			
			diamondLB.setLocation(200, 50);
			diamondLB.setSize(15, 15);
			diamondLB.setForeground(Color.blue);
			
			add(starLB);	
			add(diamondLB);
			
			DiamondThread th = new DiamondThread(diamondLB, starLB, delayTime);
			th.start();			
		}	
		
		class EventHandler extends KeyAdapter{
			
			public void keyPressed(KeyEvent ke) {
				if(ke.getKeyChar() == q)
					System.exit(0); //프로그램 종료
				
				int keyCode = ke.getKeyCode();
				
				switch(keyCode) {
				case KeyEvent .VK_UP:
					starLB.setLocation(starLB.getX(), starLB.getY() - STAR_MOVE);
					break;
					
				case KeyEvent .VK_DOWN:
					starLB.setLocation(starLB.getX(), starLB.getY() + STAR_MOVE);
					break;
					
				case KeyEvent .VK_LEFT:
					starLB.setLocation(starLB.getX()-STAR_MOVE, starLB.getY());
					break;
					
				case KeyEvent .VK_RIGHT:
					starLB.setLocation(starLB.getX()+STAR_MOVE, starLB.getY());
					break;
				}
				
			starLB.getParent().repaint();//별의 기존 의치에서 변경,별의 부모패널에게 다시 그리게 함.		
				
			}			
		}
	} //내부 stage 클래스
	
	class DiamondThread extends Thread{
		JLabel diamondLB;
		JLabel starLB;
		long delayTime;
		
		final int DIAMOND_MOVE = 5; //다이아몬드 속도, 별보다 느리게
		
		public DiamondThread(JLabel starLB, JLabel diamondLB, long delayTime) {
			this.starLB = starLB;
			this.diamondLB =diamondLB;
			this.delayTime = delayTime;
		}
		
		public void run() {
			int x = diamondLB.getX(), y= diamondLB.getY();
			
			for(;;) {
				if(starLB.getX() < diamondLB.getX())
					x = diamondLB.getX()- DIAMOND_MOVE;
				else
					x = diamondLB.getX()+DIAMOND_MOVE;
				
				if (starLB.getY()<diamondLB.getY())
					y = diamondLB.getY()- DIAMOND_MOVE;
				
				else
					y = diamondLB.getY()+ DIAMOND_MOVE;
				
				diamondLB.setLocation(x, y);
								
				diamondLB.getParent().repaint();	
				
				try {
					this.sleep(delayTime);					
				} catch (InterruptedException e) {
					return;	
			}							
		}
			
	}
}
	

	public static void main(String[] args) {
		new ThreadGame();
		
	}
}
