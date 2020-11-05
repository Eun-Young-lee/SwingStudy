package swingEx;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GameEx extends JFrame{
	ImageIcon [] img = {
			new ImageIcon("gawi.jpg"),
			new ImageIcon("bawi.jpg"),
			new ImageIcon("bo.jpg")
	};
	
	SelectPanel select = new SelectPanel();
	ResultDisplay resultDisplay = new ResultDisplay();
	
	public GameEx() {
		super("rock scissor paper");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		add(resultDisplay,"Center");
		add(select,"South");
		
		setSize(500,500);
		setVisible(true);		
		
	}
	
	class SelectPanel extends JPanel{
		JButton [] btn = new JButton[3];
		public SelectPanel() {
			setBackground(Color.green);
			for(int i =0; i<img.length;i++) {
			btn[i] = new JButton(img[i]);
			this.add(btn[i]);
			
			btn[i].addActionListener(new EventHandler());
			}
		}
	}
	
	class ResultDisplay extends JPanel{
		JLabel userlb = new JLabel("you");
		JLabel com = new JLabel("computer");
		JLabel result = new JLabel("winner");
		
		public ResultDisplay() {
			setBackground(Color.yellow);
			add(userlb);
			add(result);
			add(com);
		}
		
		public void output(Icon img, Icon comImage,String res) {
			userlb.setIcon(img);
			userlb.setHorizontalTextPosition(JLabel.LEFT);
			com.setIcon(comImage);
			result.setText(res);
			result.setForeground(Color.RED);
			result.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));
			}
		}
	
	
	class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			JButton btnSrc = (JButton)ae.getSource();
			int selCom=(int)(Math.random()*3); //0 =gawi, 1=bawi, 2=bo
			
			String res = ""; // 최종 결과값
			
			//user가 이기는 경우
			if(btnSrc.getIcon() == img[0] && selCom == 2 ||
				btnSrc.getIcon() == img[1] && selCom ==0 ||
				btnSrc.getIcon() == img[2]&&selCom ==1)
				res="you win!";
			else if(btnSrc.getIcon() == img[0] && selCom ==0 ||
					btnSrc.getIcon() == img[1] && selCom ==1 ||
					btnSrc.getIcon() == img[2] && selCom ==2
					)
				res = "tie!";
			else
				res = "you lose!";
			
			resultDisplay.output(btnSrc.getIcon(), img[selCom], res);
		}
	}
	
		
	public static void main(String[] args) {
		new GameEx();
	}

}
