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
		
		btns.get(0).setText("안녕하세요");
		btns.get(0).setFont(new Font("궁서체",Font.PLAIN, 35));
		
		add(btns.get(0), "Center");
		add(btns.get(1),"East");
		
		// 액션리스너를 추가한 컴포넌트에는 무언가 이벤트가 발생할때마다 actionPerformed 메서드를 호출한다
		btns.get(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btns.get(1).setText("0번을 누르면 1번이 바뀌게 만들었다");
				label.setText("ABC");
			}
		}); 
		
		btns.get(1).addMouseWheelListener(new MouseWheelListener() {
			int count; //변수를 여기에 선언해도 되고 생성자 밖에 선언해도 된다
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
