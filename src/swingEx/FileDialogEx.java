package swingEx;

import java.awt.*;
import java.awt.event.*;
import java.io.FilenameFilter;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;



public class FileDialogEx extends JFrame{
	
	Container cp;
	JLabel imgLb = new JLabel();
	
	public FileDialogEx() {
		super("File Dialog test");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		cp=this.getContentPane();
		cp.add(imgLb);
		makemenu();
		setSize(300,300);
		setVisible(true);
	}
	
	public void makemenu() {
		JMenuBar mb = new JMenuBar();
		JMenu menuFile = new JMenu("File");
		JMenuItem item = new JMenuItem("OPEN");
		
		item.addActionListener(new EventHandler());
		
				menuFile.add(item);
		mb.add(menuFile);
		this.setJMenuBar(mb);
	}
	
	class EventHandler implements ActionListener{
		JFileChooser choice;
		public EventHandler() {
			choice = new JFileChooser();
		}
		
		public void actionPerformed(ActionEvent ae) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG,jpg","jpg");
			choice.setFileFilter(filter);
			int returnVal=choice.showOpenDialog(null);
			if(returnVal !=JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "choose a file","warnning",JOptionPane.WARNING_MESSAGE);
				return;
			}
			String filePath = choice.getSelectedFile().getPath();
			imgLb.setIcon(new ImageIcon(filePath));
			pack(); // 사이즈
		}
	}


	public static void main(String[] args) {
		new FileDialogEx();
	}

}
