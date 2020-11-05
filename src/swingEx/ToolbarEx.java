package swingEx;

import java.awt.*;
import javax.swing.*;

public class ToolbarEx extends JFrame{
	
	Container cp;
	
	public ToolbarEx() {
		super ("tool bar test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp=getContentPane();
		makeToolBar();
		
		setSize(400,400);
		setVisible(true);
	}
	
	public void makeToolBar() {
		JToolBar tb = new JToolBar("Toolbar Menu");
		tb.setFloatable(false); //툴바 고정
		
		JComboBox cb = new JComboBox();
		cb.addItem("Java Project");
		cb.addItem("Project");
		cb.addItem("Package");
		cb.addItem("Class");
		tb.add(cb);
		tb.addSeparator(); // 공간을 띄워줌
		
		tb.add(new JButton("new"));
		tb.addSeparator();
		tb.add(new JButton(new ImageIcon("open.jpg")));
		tb.addSeparator();
		tb.add(new JButton(new ImageIcon("save.jpg")));
	
		cp.add(tb,BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ToolbarEx();
	}

}
