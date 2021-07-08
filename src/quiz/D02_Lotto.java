package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_Lotto {
	/*
	 	1. 1 ~ 45의 중복없는 랜덤 숫자 6개 또는 7개를 생성하는 메서드를 작성해보세요
	 		(당첨번호는 7개, 손님이 고르는 번호는 6개)
	 	
	 	2. 프로그램이 시작되면 당첨번호를 하나 지정하고 (숫자 7개)
	 		당첨번호와 일치하는 6개의 숫자가 나올 때 까지 번호를 계속 뽑아보세요
	 		
	 	3. 1등 또는 2등에 당첨될때까지 돈을 얼마나 썼는지 계산해보세요 (숫자 6개 뽑을때마다 천원)
	 */
	
	final private static int LOTTO_SIZE = 45;
	final private static int BONUS_INDEX = 4;
	
	private int bonus = 0;
	
	public Set<Integer> generate(int len) {
		HashSet<Integer> lotto = new HashSet<>();
		
		while(lotto.size() != len) {
			int ranNum = (int)(Math.random() * LOTTO_SIZE + 1);
			//System.out.println("Set에 " + ranNum + "이 더해집니다.");
			lotto.add(ranNum);
			
			if(len == 7 && lotto.size() == BONUS_INDEX) {
				bonus = ranNum;
			}
		}
		
		return lotto;
		
	}
	
	public static void main(String[] args) {
		D02_Lotto quiz = new D02_Lotto();
		
		Set<Integer> win = quiz.generate(7);
		System.out.println("당첨 번호는 " + win + "입니다. 그 중 보너스 번호는 " + quiz.bonus + "입니다.");
		
		
		List<Integer> checkList = new ArrayList<>(7);
		
		long spent = 0;
		int count = 0;
		
		while (true) {
			Set<Integer> blackcow = quiz.generate(6);
			count++;
			
			checkList.addAll(win);
			checkList.removeAll(blackcow);
			
			if (checkList.size() == 1) {
				spent = count * 1000;
				
				if(checkList.get(0) == quiz.bonus) {
					System.out.println("1등 당첨입니다." + count + "번 도전하셨으며 ,"
							+ "여태까지 쓰신 돈은 " + spent + "원 입니다.");
				}else {
					System.out.println("2등 당첨입니다." + count + "번 도전하셨으며 ,"
							+ "여태까지 쓰신 돈은 " + spent + "원 입니다.");
				}
				
				break;
			}
			checkList.clear();
			
		}
	}
}







	
