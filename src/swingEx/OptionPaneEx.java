package swingEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OptionPaneEx extends JFrame{
	Container cp;
	
	public OptionPaneEx() {
		super("OptionPane test");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		cp=this.getContentPane();
		this.setSize(300, 300);
		PanelDemo pd = new PanelDemo();
		
		cp.add(pd);
		
		this.setVisible(true);
	}
		
		class PanelDemo extends JPanel{
			JButton inBtn = new JButton(" Input Dialog");
			JButton confirmBtn = new JButton(" Confirm Dialog");
			JButton msgBtn = new JButton(" Message Dialog");
			JTextField tf = new JTextField(5);
			
			public PanelDemo() {
				this.setBackground(Color.green);
				this.add(inBtn); this.add(confirmBtn);this.add(msgBtn);this.add(tf);
				
				inBtn.addActionListener(new ActionListener() {
					
						public void actionPerformed(ActionEvent e) {
							String age = JOptionPane.showInputDialog("input your age");
							if(age!=null) tf.setText(age);
							}
				});
				
				confirmBtn.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						int result = JOptionPane.showConfirmDialog(null, "continue?","confirm", JOptionPane.YES_NO_OPTION);
						//System.out.println(result);
						
					//	if(result ==0) 
						if(result ==JOptionPane.YES_OPTION)
							tf.setText("Yes");
					//	else if(result == 1)
						else if(result == JOptionPane.NO_OPTION)
							tf.setText("No");
				    // else 
						else if(result == JOptionPane.CLOSED_OPTION)
							tf.setText("close");
						}					
				});
				msgBtn.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "warning","msg",JOptionPane.WARNING_MESSAGE);
						
					}
				});
				
			}

		}
	

	public static void main(String[] args) {
		new OptionPaneEx();
	}

}
