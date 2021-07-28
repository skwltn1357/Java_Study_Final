package gui;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import gui.mypanel.ImagePanel;

public class S08_CardLayout extends StudyFrame {
	
	
	public S08_CardLayout() {
		super();
		
		// CardLayout: 컴포넌트를 카드처럼 넘기면서 사용하는 레이아웃
		// Layout과 Layout을 붙이는 것은 JPanel이다. (컴포넌트 아님)
		
	
		// 패널 위에 패널을 붙임
		JPanel card_panel = new JPanel(new CardLayout(10,10)); //여백
		
		ArrayList<ImageIcon> icons = new ArrayList<>();
		ArrayList<ImageIcon> icons3 = new ArrayList<>();
		// 이미지 사이즈 조절하기
		BufferedImage image;
		try {
			image = ImageIO.read(new File("./image/penguin/penguin1.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
			image = null;
		}
		
		icons.add(new ImageIcon(image.getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
		icons.add(new ImageIcon(image.getScaledInstance(350, 350, Image.SCALE_SMOOTH)));
		icons.add(new ImageIcon(image.getScaledInstance(400, 400, Image.SCALE_SMOOTH)));
		
		icons3.add(new ImageIcon("./image/fruits/gyul.jpg"));
		icons3.add(new ImageIcon("./image/fruits/kiwi.jpg"));
		icons3.add(new ImageIcon("./image/fruits/strawberry.jpg"));
		icons3.add(new ImageIcon("./image/fruits/tomato.jpg"));
		icons3.add(new ImageIcon("./image/fruits/watermelon.jpg"));
		
		JPanel panel1 = new ImagePanel(icons);
		JPanel panel2 = new JPanel();
		JPanel panel3 = new ImagePanel(icons3);
		JButton south_btn = new JButton("next card!");
		
		// 카드 레이아웃을 사용할 때는 name이 유용하게 사용된다.
		// 패널 위에 패널 3개를 붙인 것.
		card_panel.add("card1",panel1);
		card_panel.add("card2",panel2);
		card_panel.add("card3",panel3);
		
		add(card_panel, "Center");
		add(south_btn, "South");
		
		/*
		 	CardLayout.next(parent) 	  : 다음 카드 보기
		 	CardLayout.previous(parent)   : 이전 카드 보기
		 	CardLayout.first(parent) 	  : 맨 처음 카드 보기 
		 	CardLayout.last(parent)		  : 마지막 카드 보기
		 */
		south_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 해당 패널 또는 프레임에 정의된 레이아웃을 꺼내서 사용할 수도 있다.
				CardLayout card_layout = ((CardLayout)card_panel.getLayout()); //카드패널에서 업캐스팅된 레이아웃을 다운캐스팅 해서 꺼냄
				card_layout.next(card_panel);
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		S08_CardLayout frame = new S08_CardLayout();
		frame.setDefaultOptions();
	}

}
