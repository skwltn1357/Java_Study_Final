package gui.mycomponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyJButton extends JButton {

	int value;
	
	public MyJButton() {
		super();
		
		setText("" + value);
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 이벤트 발생시 ActionEvent 인스턴스에 해당 이벤트 정보가 넘어온다.
				System.out.println("정보1: " + e.getID());
				System.out.println("정보2: " + e.getModifiers());
				System.out.println("정보3: " + e.getWhen());	//누른 시간
				System.out.println("정보4: " + e.getActionCommand()); //setText에 설정된 값이 넘어온 것
				System.out.println("정보5: " + e.getSource());
				
				//MyJButton으로 다운캐스팅하여 setText해주고 1씩 증가
				((MyJButton) e.getSource()).setText("" + ++value); 
				
				
			}
		});
	}
	
	
	
	
}
