package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class S05_JLabel extends StudyFrame {
	
	/*
	 	# S5_JLabel
	 	
	 	 - �ؽ�Ʈ�� ���� �뵵�� ���Ǵ� ������Ʈ
	 	 
	 	# Icon���� �̹��� �ֱ�
	 */
	
	int count;
	
	public S05_JLabel() {
		super();
		
		Icon[] icons = {
			new ImageIcon("./image/penguin/penguin1.jpg"),
			new ImageIcon("./image/flower/rose.jpg"),
			new ImageIcon("./image/flower/flower1.jpg")
			};
		
		JButton btn = new JButton();
		JLabel label = new JLabel(icons[count]);
		
		btn.setText("Button");
		label.setText("Label");
		
		add(btn,"South");
		add(label,"Center");
		
		//�������� : ��ư�� ������ �ٸ� �׸����� �ٲ�� ��������.(�׸��� ��� ��ȯ�Ǿ�� ��)
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(icons[++count % icons.length]);
			}
		});
	}
	
	public static void main(String[] args) {	
		S05_JLabel frame = new S05_JLabel();
		frame.setDefaultOptions();
	}
}
