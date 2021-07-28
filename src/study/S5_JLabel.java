package study;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import gui.StudyFrame;

//연습문제 : 버튼을 누르면 다른 그림으로 바뀌도록 만들어보세요.(그림은 계속 순환되어야 함)

public class S5_JLabel extends StudyFrame {

	int count;
	
	public S5_JLabel() {
		super();
		
		Icon[] icons = {
				new ImageIcon("./image/flower/flower1.jpg"),
				new ImageIcon("./image/flower/rose.jpg"),
				new ImageIcon("./image/penguin/penguin1.jpg")};
		
		JButton btn = new JButton();
		JLabel label = new JLabel(icons[count]);
		
		btn.setText("Button");
		label.setText("Label");
		
		add(btn,"South");
		add(label, "Center");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(icons[++count % icons.length]);
			}
		});
	}
	
	public static void main(String[] args) {
		S5_JLabel frame = new S5_JLabel();
		frame.setDefaultOptions();
	}
}
