package swingEx;

import java.awt.*;
import javax.swing.*;

public class JSliderTest extends JFrame {
	Container cnp;
	public JSliderTest() {
		super("slider test");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		cnp=this.getContentPane();
		cnp.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,300,150);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(50);
		
		cnp.add(slider);
		setSize(300,300);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new JSliderTest();
	}

}
