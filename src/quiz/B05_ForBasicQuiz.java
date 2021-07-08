package quiz;

import java.util.Scanner;

public class B05_ForBasicQuiz {
	public static void main(String[] args) {
		
		/*
		 	사용자가 숫자를 입력 했을 떄
		 	1. 10부터 입력한 숫자까지의 총합을 구해보세요
		 	2. 1000부터 입력한 숫자까지 순서대로 나오게 만들어보세요
		 	3. 1부터 입력한 숫자 사이의 5의 배수만 출력해보세요
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int i;
		
		//1번
		int sum = 0;
		int start , end;
		
		if(num > 10) {
			start = 10;
			end = num;
		} else {
			start = num;
			end = 10;
		}
		for(i = start ; i <= end ; ++i) {
			sum += i;
		}
		
		System.out.printf("10부터 %d까지의 총합은 %d입니다. : " ,num,sum);
		
		
		
		
		
		//2번
		if(num > 1000) {
			for(i = 1000 ; i <= num ; ++i) {
				System.out.printf("1000부터 %d까지 출력 : %d\n",num,i);
			}
		}else {
			for(i = 1000 ; i >= num ; --i) {
				System.out.printf("1000부터 %d까지 출력 : %d\n",num,i);
			}
		}
		
		
			
		
		//3번
		for(i = 1 ; i <= num ; ++i) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
	
				
		}


		
	}

}
