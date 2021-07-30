package gui.project;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPage extends CgvFrame{
	
	public MainPage() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,1));
		
		ArrayList<JButton> btns = new ArrayList<>();
		
		JPanel clockPanel = new JPanel();
		JLabel label = new JLabel();
		label.setText(time());
		clockPanel.add(label);
		
		JPanel btnPanel = new JPanel(new GridLayout(3,1));
		JButton btn1 = new JButton("현장예매");
		JButton btn2 = new JButton("예매티켓출력");
		JButton btn3 = new JButton("상품");

		btn1.setBounds(30, 170, 122, 30);
		btn2.setBounds(30, 170, 122, 30);
		btn3.setBounds(30, 170, 122, 30);
		 
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		btnPanel.add(btn3);
		
		btns.add(btn1);
		btns.add(btn2);
		btns.add(btn3);
		
		panel.add(btnPanel);
		panel.add(clockPanel);

		super.setContentPane(panel);
		
	}
	
	public String time() {
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat myDateFormat = 
					new SimpleDateFormat("yyyy년 MM월 dd일 EEEEEE\nHH:mm");
			String text = myDateFormat.format(cal.getTime());
			System.out.println(text);
			
			return text;
		}

	public static void main(String[] args) {
		MainPage frame = new MainPage();
		frame.setDefaultOptions();

	}

}
