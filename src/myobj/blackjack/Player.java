package myobj.blackjack;

import java.util.Arrays;

public class Player {
	
	final static int MAX_TABLE_SIZE = 11;
	
	Card[] tables;
	
	//여태까지 받은 숫자
	int count;
	int ace_count;

	 Player() {	
		tables = new Card[MAX_TABLE_SIZE]; // 1 1 1 1 2 2 2 2 3 3 3
	}
	
	 void add(Card card) {
		if(card.rank == 0) {
			ace_count++;
		}
		tables[count++] = card;
	}
	 
	 int calc() {
		 int value = 0;
		 for(int i = 0; i < count; ++i) {
			value += tables[i].getValue();
		 }
		 
		 int i = 0;		 
		 while(ace_count - i> 0 && value > 21) {
			 value -= 10;
			 i++;
		 }
		 return value;
	 }
	 
	 @Override
	public String toString() {
		 String str = "";
		 
		 for(int i = 0; i < MAX_TABLE_SIZE; ++i) {
			 if(tables[i] == null) {
				 break;
			 }else {
				 str += "[" + tables[i] + "] ";
			 }
		 }
		return str;
	}
}











