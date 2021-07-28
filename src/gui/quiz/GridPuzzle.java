package gui.quiz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;

import gui.StudyFrame;

public class GridPuzzle extends StudyFrame implements ActionListener{

	int[] randNum = new int[16];
	JButton[] btn = new JButton[16];
	
	public void ranNum() {
		int num = 0;
		Random ran = new Random();
		boolean check = false;
		for(int i=0; i<16; i++) {
			check = true;
			while(check) {
				num = ran.nextInt(16);
				check = false;
				for(int j=0; j<i; j++) { //중복체크
					if(num == randNum[j]) {
						check = true;
						break;
					}
				}
			}
			randNum[i] = num;
		}
		
	}
	
	public GridPuzzle() {
		super();
		
		ranNum(); //위에 ranNum생성자 호출
		
		JPanel panel = new JPanel();
	
		add(panel,"Center");
		
		panel.setLayout(new GridLayout(4,4));
		
		for(int i=0; i<16; ++i) {
			if(randNum[i] == 0) {
				btn[i] = new JButton("");
			}else {
				btn[i] = new JButton("" + (randNum[i]));
			}
		}
		
		for(int i=0; i<16; ++i) {
			panel.add(btn[i]);
		}

		for(int i=0; i<16; ++i) {
			btn[i].addActionListener(this);
		}		
	}
	
	public static void main(String[] args) {
		GridPuzzle frame = new GridPuzzle();
		frame.setDefaultOptions();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton) e.getSource(); //클릭한 버튼
		for(int i=0; i<btn.length; ++i) {
			if(btn[i].getText().equals("")) {
				btn[i].setText(jb.getText());
				jb.setText("");
			}
		}

	}
}
