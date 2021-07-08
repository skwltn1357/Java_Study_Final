package quiz;

import java.util.Scanner;

public class B09_Count369 {
	/*
	 	사용자로부터 정수를 하나 입력받은 후 
	 	해당 숫자까지 369 게임이 진행된다면 박수를 총 몇 번 쳐야하는지 세어보세요
	 	
	 	(33, 36, 39...등의 숫자는 여러번 칩니다.)
	 */
	public static void main(String[] args) {
		/*
		 	문제해결력 - 문제를 푸는 길을 찾는 것
		 	구현력 - 생각해낸 길을 코드로 구현하는 것
		 	프로그래밍 언어 이해력 - 사용하는 언어에 대한 깊은 이해도
		 */
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("박스 체크해볼 숫자 > ");
	int num = sc.nextInt();

	// ex) 353
	// 353 % 10 		: 1의 자리
	// 353 / 10 % 10	: 10의 자리
	// 353 / 100 % 10	: 100의 자리
	
	int count = 0;
	
	for(int i = 1; i <= num; ++i) {
		int checkNum = i;
		System.out.printf("[%d]\t: ", checkNum);
		
		while(checkNum != 0) {
			int digit = checkNum % 10;
			
			if(digit != 0 && digit % 3 == 0) {
				System.out.print("짝");
				count++;
			}
			checkNum /= 10;			
			}
			System.out.println();
		
		}
	System.out.printf("박수는 총 %d회 쳤습니다.\n",count);
	}
}
