package quiz;

import java.util.Scanner;

public class B01_AppleQuiz {
	
	public static void main(String[] args) {
		
		/*
		 	사과를 10개씩 담을 수 있는 바구니가 있다.
		 	
		 	사용자가 구매하고 싶은 사과의 개수를 입력하면
		 	사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어보세요.
		 */
		
		int apple;
		int basket;
		int basket_size = 10;
		//double basket_size = 10;
		//double basket; 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사과 개수 입력 > ");
		apple = sc.nextInt();	
		
		if(apple % basket_size == 0) {
			basket = apple / basket_size;
			
		}else {
			basket = apple / basket_size + 1;
		}
		
		if (apple < 0) {
			System.out.println("올바른 사과 개수가 아닙니다");
		}else {
			System.out.printf("필요한 바구니의 개수는 %d개 입니다",basket);
		}
		
		//basket = apple / basket_size;
		
		// Math.ceil(a) : a를 소수 첫째 자리에서올린다
		// Math.floor(a) : a를 소수 첫째 자리에서 내린다
//		System.out.printf("필요한 바구니의 개수는 %d개 입니다",
//				(int)Math.ceil(basket));
//		

					
		
		
		
	}

}
