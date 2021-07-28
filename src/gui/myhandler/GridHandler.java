package gui.myhandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class GridHandler implements ActionListener{
	
	ArrayList<JButton> btns;
	
	public GridHandler(ArrayList<? extends JButton> btns) {
		this.btns = (ArrayList<JButton>) btns;
	}
	
	private void grid() {
		for(JButton btn : btns) {
			
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
