package swingEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderEx extends JFrame{
	Container cnp;
	JLabel lb;
	JSlider [] slider = new JSlider[3];
	
	public SliderEx() {
		super("Slider Test");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		cnp = getContentPane();
		cnp.setLayout(new FlowLayout());
		lb=new JLabel("                                                                                                                  ");
		
		for(int i=0; i<slider.length; i++) {
			slider[i] = new JSlider(JSlider.HORIZONTAL,0,255,0);
			slider[i].setPaintTicks(true);
			slider[i].setMinorTickSpacing(10);
			slider[i].setPaintLabels(true);
			slider[i].setMajorTickSpacing(50);
			slider[i].addChangeListener(new EventHandler());
			cnp.add(slider[i]);
		}
		
		slider[0].setBackground(Color.red);
		slider[1].setBackground(Color.green);
		slider[2].setBackground(Color.blue);
		
		lb.setOpaque(true);
		lb.setBackground(
				new Color(slider[0].getValue(),
					 	  slider[1].getValue(),
						  slider[2].getValue()));
		cnp.add(lb);
		
		setSize(300,300);
		setVisible(true);
	}

	class EventHandler implements ChangeListener{
		public void stateChanged(ChangeEvent ce) {
			lb.setBackground(
					new Color(slider[0].getValue(),
						 	  slider[1].getValue(),
							  slider[2].getValue()));
		}
	}
	public static void main(String[] args) {
		new SliderEx();
	}

}
