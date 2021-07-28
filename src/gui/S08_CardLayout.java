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
		
		// CardLayout: ������Ʈ�� ī��ó�� �ѱ�鼭 ����ϴ� ���̾ƿ�
		// Layout�� Layout�� ���̴� ���� JPanel�̴�. (������Ʈ �ƴ�)
		
	
		// �г� ���� �г��� ����
		JPanel card_panel = new JPanel(new CardLayout(10,10)); //����
		
		ArrayList<ImageIcon> icons = new ArrayList<>();
		ArrayList<ImageIcon> icons3 = new ArrayList<>();
		// �̹��� ������ �����ϱ�
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
		
		// ī�� ���̾ƿ��� ����� ���� name�� �����ϰ� ���ȴ�.
		// �г� ���� �г� 3���� ���� ��.
		card_panel.add("card1",panel1);
		card_panel.add("card2",panel2);
		card_panel.add("card3",panel3);
		
		add(card_panel, "Center");
		add(south_btn, "South");
		
		/*
		 	CardLayout.next(parent) 	  : ���� ī�� ����
		 	CardLayout.previous(parent)   : ���� ī�� ����
		 	CardLayout.first(parent) 	  : �� ó�� ī�� ���� 
		 	CardLayout.last(parent)		  : ������ ī�� ����
		 */
		south_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �ش� �г� �Ǵ� �����ӿ� ���ǵ� ���̾ƿ��� ������ ����� ���� �ִ�.
				CardLayout card_layout = ((CardLayout)card_panel.getLayout()); //ī���гο��� ��ĳ���õ� ���̾ƿ��� �ٿ�ĳ���� �ؼ� ����
				card_layout.next(card_panel);
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		S08_CardLayout frame = new S08_CardLayout();
		frame.setDefaultOptions();
	}

}
