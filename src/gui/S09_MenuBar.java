package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class S09_MenuBar extends StudyFrame {
	
	public S09_MenuBar() {
		super();
	
		JMenuBar bar = new JMenuBar();
		
		JMenu main  = new JMenu("Main Menu");
		JMenu sub = new JMenu("Sub Menu");

		JMenuItem main_item1 = new JMenuItem("New");
		JMenuItem main_item2 = new JMenuItem("Laod");
		JMenuItem main_item3 = new JMenuItem("Save");
		
		JMenuItem sub_item1 = new JMenuItem("Update");
		JMenuItem sub_item2 = new JMenuItem("Delete");
		
		main.add(main_item1);
		main.add(main_item2);
		main.add(main_item3);
		main.add(sub);
		
		sub.add(sub_item1);
		sub.add(sub_item2);
		
		bar.add(main);
		
		setJMenuBar(bar);
		
		JLabel label = new JLabel();
		add(label);
		
		class MenuItemListener implements ActionListener {
			String path;
			
			public MenuItemListener(String path) {
				this.path = path;
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(new ImageIcon(path));
			}
		}
		
		sub_item1.addActionListener(new MenuItemListener("./image/fruits/gyul.jpg"));
		sub_item2.addActionListener(new MenuItemListener("./image/fruits/strawberry.jpg"));
		main_item1.addActionListener(new MenuItemListener("./image/fruits/tomato.jpg"));
		
	}	
	
	public static void main(String[] args) {
		S09_MenuBar frame = new S09_MenuBar();
		frame.setDefaultOptions();
	}
}






