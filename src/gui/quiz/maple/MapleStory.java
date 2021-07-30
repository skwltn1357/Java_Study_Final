package gui.quiz.maple;

import javax.swing.JFrame;
/*
	굴리기! 버튼을 누르면 옵션이 랜덤으로 3개 결정되는 프로그램을 만들어보세요.
	
	힘 증가     +1 ~ +7
	지능 증가  +1 ~ +7
	민첩 증가  +1 ~ +7
	행운 증가  +1 ~ +7
	공격력 증가 +1 ~ +3
*/

public class MapleStory extends JFrame {
	
	public MapleStory() {
		super("단풍이야기");
		setLayout(null);
		
		RollButton rollBtn = new RollButton();
		add("rollBtn", rollBtn);
		
		add("stat1",rollBtn.getRanBtns().get(0));
		add("stat1",rollBtn.getRanBtns().get(1));
		add("stat1",rollBtn.getRanBtns().get(2));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(400,30);
		setSize(500,500);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new MapleStory();
		
		
	}
}
