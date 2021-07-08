package myobj.blackjack;

import java.util.Arrays;

public class Cards {

        final public static int NUM_OF_SUITS = 4;
        final public static int NUM_OF_RANKS = 13;  
        final public static int CARD_SIZE = NUM_OF_SUITS * NUM_OF_RANKS; 
                
        Card[] cards;
        
        private int cursor;
        
        public Cards() {
                cards = new Card[CARD_SIZE];
                
                for (int i = 0; i < NUM_OF_SUITS; ++i) {
                        for (int j = 0; j < NUM_OF_RANKS; ++j) {
                                cards[i * NUM_OF_RANKS + j] = new Card(i, j);
                        }
                }                
                
                shuffle(1000);
        }        
        
        public void shuffle(int times) {
                for (int i = 0; i < times; ++i) {
                        int x = (int)(Math.random() * CARD_SIZE);
                        int y = (int)(Math.random() * CARD_SIZE);
                        
                        Card temp = cards[x];
                        cards[x] = cards[y];
                        cards[y] = temp;
                }
        }
        
        public Card next() {
                // 이 부분에 알맞은 소스를 제출해보세요
        		if (cursor > CARD_SIZE - 1) {
        			shuffle(500);
        			cursor = 0;
        		}
        		
                return cards[cursor++];
        }
        
        @Override
        public String toString() {        
                return Arrays.toString(cards);
        }
        
        public static void main(String[] args) {
                Cards cards = new Cards();
                System.out.println(cards);                
                
                for (int i = 0; i < 53; ++i) {
                        System.out.println(i + "번째로 뽑은 카드: " + cards.next());
                }
        }
}

class Card {        
        final private static char[] SUITS = {'♠', '♣', '◇', '♡'};
        final private static String[] RANKS = 
                {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        final private static int[] VALUES = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        
        int suit;
        int rank;
        boolean hidden;		//카드가 뒤집혀있다
        
        public Card(int suit, int rank) {
                this.suit = suit;
                this.rank = rank;
        }
        
        int getValue() {
        	return VALUES[rank];
        }
        
        // # 클래스의 toString() 메서드를 오버라이드 
        //        - 이 클래스가 문자열로 표현되어야 할 때 어떻게 보여야 하는지를 정의 해놓는다
        @Override
        public String toString() {
        	if(hidden) {
        		return "H";
        	}else {
        		return SUITS[suit] + RANKS[rank];
        	}
        }
        
        
}











