package gui.quiz;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridPuzzle_강사님풀이 extends JFrame {
	
	private ArrayList<JButton> numPads;
	
	public GridPuzzle_강사님풀이() throws IOException {
		this(3); //size=3
	}
	
	public GridPuzzle_강사님풀이(int gameSize) throws IOException {
		super(String.format("숫자퍼즐게임:%dx%d",gameSize, gameSize));	
		
		numPads = new ArrayList<>();
		
		for (int i=0, len=gameSize*gameSize; i<len; ++i){
			numPads.add(new NumPad(i));
		}
		
		setIconImage(ImageIO.read(new File("./image/GridNumberPuzzle.jpeg")));	//창 아이콘 이미지 등록
		setBounds(600,100,400,400);	//setLocation, setSize 합쳐놓은 것
		setVisible(true);
		setSize(400,400);
	}
	
	
	
	public static void main(String[] args) {
		try {
			new GridPuzzle_강사님풀이();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("아이콘을 찾을 수 없습니다.");
		}
	}
}
