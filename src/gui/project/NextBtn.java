package gui.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NextBtn implements ActionListener{
	
	String text;
	
	public NextBtn(String text) {
		this.text = text;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(text.equals("NEXT")) {
			BookedTicket.setvisible(false);
			��ȭ����(1��).setvisible(true);          
	}

	
	
}
