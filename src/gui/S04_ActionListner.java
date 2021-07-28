package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import gui.myhandler.MyButtonEventHandler1;

public class S04_ActionListner extends JFrame {
	
	int count = 0;
	
	public S04_ActionListner() {
		super();
		
		ArrayList<JButton> btns = new ArrayList<>();
		
		JLabel label = new JLabel("I am Label");
		
		btns.add(new JButton());
		//btns.add(new gui.mycomponent.MyJButton());
		btns.add(new JButton());
		
		btns.get(0).setText("�ȳ��ϼ���");
		btns.get(0).setFont(new Font("�ü�ü",Font.PLAIN, 35));
		
		add(btns.get(0), "Center");
		add(btns.get(1),"East");
		
		// �׼Ǹ����ʸ� �߰��� ������Ʈ���� ���� �̺�Ʈ�� �߻��Ҷ����� actionPerformed �޼��带 ȣ���Ѵ�
		btns.get(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btns.get(1).setText("0���� ������ 1���� �ٲ�� �������");
				label.setText("ABC");
			}
		}); 
		
		btns.get(1).addMouseWheelListener(new MouseWheelListener() {
			int count; //������ ���⿡ �����ص� �ǰ� ������ �ۿ� �����ص� �ȴ�
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				btns.get(1).setText("" + count++);
			}
		});

		setLocation(100,100);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S04_ActionListner();
	}
}
