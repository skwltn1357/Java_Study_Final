package gui.quiz;

import javax.swing.JButton;

public class NumPad extends JButton {
	
	int index;
	
	int left;
	int right;
	int top;
	int bottom;
	
	public NumPad(int index, int gameSize) {
		this.index = index;
		
		this.top = index - gameSize >= 0 ? index - gameSize : -1 ;	//-1은 유효하지 않은 값이라는 것을 표시해놓은 것.(=null)
		this.bottom = index + gameSize < gameSize * gameSize ? index + gameSize : -1;
		this.left = index % gameSize != 0 ?  index - 1 : -1;
		this.right = index % gameSize != gameSize - 1 ? index + 1 : -1;
		
	}
}
