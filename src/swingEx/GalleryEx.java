package swingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class GalleryEx extends JFrame {
	Container cnp;
	JLabel imgLb;
	ImageIcon [] img= new ImageIcon[4];
	int imgId;
	
	public GalleryEx() {
		super("Gallery Ex");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		cnp=this.getContentPane();
		
		for(int i =0; i<img.length;i++)
			img[i] = new ImageIcon("car"+(i+1)+".jpg");
	
	imgLb = new JLabel(img[imgId]);
	
	cnp.add(imgLb,"Center");
	cnp.add(new ArrowBtn(),"North");
		
	setSize(400,400);
	setVisible(true);	
	
	}
	
	class ArrowBtn extends JPanel{
		public ArrowBtn() {
			setBackground(Color.yellow);
			ImageIcon left = new ImageIcon("left.png");
			ImageIcon right = new ImageIcon("right.png");

			JButton leftBtn = new JButton(left);
			JButton rightBtn = new JButton(right);
			
			this.add(leftBtn); this.add(rightBtn);
			
			//왼쪽버튼
			leftBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					imgId--; //이전이미지로 되돌리기 위해서
					imgId += img.length; // imgID+img.length
					imgId %= img.length;
					imgLb.setIcon(img[imgId]);
				}
			});		
			//오른쪽버튼
			rightBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					imgId++;
					imgId += img.length; 
					imgId %= img.length;
					imgLb.setIcon(img[imgId]);
				}
			});
		}		
	}

	
	public static void main(String[] args) {
		new GalleryEx();
	}
}
