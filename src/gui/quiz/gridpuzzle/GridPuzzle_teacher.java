package gui.quiz;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridPuzzle_�����Ǯ�� extends JFrame {
	
	private ArrayList<JButton> numPads;
	
	public GridPuzzle_�����Ǯ��() throws IOException {
		this(3); //size=3
	}
	
	public GridPuzzle_�����Ǯ��(int gameSize) throws IOException {
		super(String.format("�����������:%dx%d",gameSize, gameSize));	
		
		numPads = new ArrayList<>();
		
		for (int i=0, len=gameSize*gameSize; i<len; ++i){
			numPads.add(new NumPad(i));
		}
		
		setIconImage(ImageIO.read(new File("./image/GridNumberPuzzle.jpeg")));	//â ������ �̹��� ���
		setBounds(600,100,400,400);	//setLocation, setSize ���ĳ��� ��
		setVisible(true);
		setSize(400,400);
	}
	
	
	
	public static void main(String[] args) {
		try {
			new GridPuzzle_�����Ǯ��();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�������� ã�� �� �����ϴ�.");
		}
	}
}
