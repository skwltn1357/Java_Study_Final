package gui.quiz.maple;

import javax.swing.JFrame;
/*
	������! ��ư�� ������ �ɼ��� �������� 3�� �����Ǵ� ���α׷��� ��������.
	
	�� ����     +1 ~ +7
	���� ����  +1 ~ +7
	��ø ����  +1 ~ +7
	��� ����  +1 ~ +7
	���ݷ� ���� +1 ~ +3
*/

public class MapleStory extends JFrame {
	
	public MapleStory() {
		super("��ǳ�̾߱�");
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
