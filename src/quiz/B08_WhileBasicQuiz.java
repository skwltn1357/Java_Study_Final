package quiz;

public class B08_WhileBasicQuiz {
	/*
	 	while문을 이용하여 다음을 구하시오.
	 	
	 	1. 1 부터 100 사이에 있는 3의 배수의 총합
	 	
	 	2. 355부터 237까지 출력
	 	
	 	3. continue를 반드시 사용하여 3000 부터 5000 사이의 7의 배수만 출력
	 	
	 	4. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합
	 */
	
	public static void main(String[] args) {
		
	
		// 1번		
		int i = 0;
		int sum = 0;
		
		while(i < 100) {
			if(++i % 3 == 0) {
				System.out.println(i);
				sum += i;
		}
		
	}
		System.out.println("총합 : " + sum);
		
				
		
		
		// 2번		
		i = 355;
		while(i >= 237) {	
			System.out.println(i--);		
		}
		System.out.println();
		
		
		
		
		// 3번		
		i = 3000;

		while(i <= 5000) {
			if(i % 7 != 0) {
				++i;
				continue;
			}
			System.out.println(i);
			++i;
		
	}
		System.out.println();
	
		
		
		
		
		// 4번
		i = 1;
		sum = 0;
		
		
		while(i <= 200) {
			if(i % 2 != 0 && i % 3 != 0) {
				sum += i;		
		}	
			++i;
	}
		System.out.println("4번 답 : " + sum);
		
		
		}		
	}












