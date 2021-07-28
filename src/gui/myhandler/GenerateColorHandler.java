package gui.myhandler;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class GenerateColorHandler implements ActionListener{
	//버튼이 클릭 될때마다 Handler를 불러다 쓸 수 있다.

	ArrayList<JButton> btns;
	
	public GenerateColorHandler(ArrayList<? extends JButton> btns) {
		this.btns = (ArrayList<JButton>) btns;
	}
	
	
	private void generateColor() {
		for(JButton btn : btns) {
			btn.setBackground(new Color((int)(Math.random() * 0XFFFFFF)));
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		generateColor();
	}

}
