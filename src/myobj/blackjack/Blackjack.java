package myobj.blackjack;
/*
	# 카드
		4가지의 문양 : 하트, 클로버, 다이어몬드, 스페이드
		
		숫자 : A 2 3 4 5 6 7 8 9 10 J Q K
		
		*블랙잭에서 A는 1로 쓸 수도 있고 11로도 쓸 수 있음 
		J, Q, K는 10
		조커는 사용하지 않음
			 		
	# 블랙잭을 만들어 보세요
	
	1. 컴퓨터(딜러)와 사람(플레이어)이 카드를 뽑는다
	
	2. 처음에는 둘 모두 2장씩 받는다. 이때 딜러의 카드는 한장 가려놓는다.
	
	3. 플레이어는 상황을 보고 더 뽑을지(hit) 여기서 멈출지를(stand) 결정한다
	
	4. 플레이어가 멈추면 딜러가 가려져 있던 카드를 오픈하고 규칙에 따라 카드를 뽑는다
		(딜러는 반드시 카드 합이 16 이하일때 무조건 뽑고, 17 이상이면 무조건 멈춰야한다)
	
	5. 플레이어의 카드 숫자들의 합이 딜러보다 높거나 정확하게 21이라면 승리한다.
		플레이어의 카드 숫자들의 합이 21보다 크면 패배한다. (A ~ K)
*/

import java.util.Scanner;

public class Blackjack {
	
	Scanner sc;
	Cards cards;
	Player player;
	Dealer dealer;
	
	public Blackjack() {
		cards = new Cards();
		player = new Player();
		dealer = new Dealer();
		sc = new Scanner(System.in);
	}
	
	public void new_game() {
		// 딜러,플레이어한테 카드 2장씩
		
		dealer.add(cards.next());
		dealer.add(cards.next());
		
		player.add(cards.next());
		player.add(cards.next());
		
		int pv = -1;
		while(choice()) {
			player.add(cards.next());
			
			pv = player.calc();
			if(pv > 21) {
				break;
			}
		}
		
		if(pv <= 21) {
			//딜러가 마저 카드를 여는 로직
			open();
		}else {
			System.out.println("플레이어 버스트!!!");
		}
		
		last_info();
		whowin();
	}
	
	private void whowin() {
		int dv = dealer.calc();
		int pv = player.calc();
		
		if(dv == pv) {
			System.out.println("무승부!");
		}else if(dv > 21 && pv <= 21) {
			System.out.println("플레이어 승리!");
		}else if(pv > 21 && dv <= 21) {
			System.out.println("딜러의 승리!");
		}else if(pv > dv) {
			System.out.println("플레이어의 승리!");
		}else {
			System.out.println("딜러의 승리!");
		}
		}
	private void open() {
		
		while(dealer.calc() < 17) {
			dealer.add(cards.next());
		}
		dealer.tables[0].hidden = false;
	}
	
	private void info() {
		System.out.println("딜러의 카드 : " + dealer);
		System.out.println("플레이어 : " + player + ", value: " + player.calc());
	}
	
	private void last_info() {
		System.out.println("딜러의 카드 : " + dealer + ", value : " + dealer.calc());
		System.out.println("플레이어 : " + player + ", value: " + player.calc());
	}
	
	private int input(String notice) {
		System.out.print(notice);
		return sc.nextInt();
	}
	private boolean choice() {
		while(true) {
			info();
			int choice = input("1. hit\t2. stand > ");
			
			if(choice == 1) {
				return true;
			}else {
				return false;
			}
		}

	}
	
	public static void main(String[] args) {
		new Blackjack().new_game();
	}
	
	

}











