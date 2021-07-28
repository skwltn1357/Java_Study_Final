package gui.quiz.maple;

import java.util.Random;

import javax.swing.JButton;

public class RandomButton extends JButton {

	static String[] stat_labels = {"��","��ø","����","���","���ݷ�"};
	static int[] max_stats = {7, 7, 7, 7, 3};
	
	Random ran;
	
	public RandomButton() {
		super("None");
		ran = new Random();
	}
	
	void roll() {
		int value = ran.nextInt(stat_labels.length);		
		setText(stat_labels[value] + " " + (ran.nextInt(max_stats[value]) + 1));
	}

}
