package quiz;

import java.util.Scanner;

public class B07_Prime {
	
	public static void main(String[] args) {
		
		/*
		 	사용자로부터 숫자(양수)를 입력받으면
		 	1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
		 	(음수를 입력하면 다시 제대로 입력하게 하기)
		 	
		 	# 소수 : 나누어 떨어지는 수가 1과 자기 자신밖에 없는 숫자
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : " );
		int num = sc.nextInt();
		
		for(;num < 0 ;) {
			System.out.println("잘못된 숫자입니다. 다시 입력해주세요.");
			System.out.print("> ");
			
			num = sc.nextInt();
		}
		System.out.println(2);
		for(int chkNum = 3; chkNum <= num; chkNum += 2) {
			
			boolean prime = true;
			
			for(int divNum = 2; divNum < chkNum; ++divNum) {
				
				if(chkNum % divNum == 0) {
					prime = false;
				}
				
			}
			
			if(prime) {
				System.out.println(chkNum);
			}
		}
	}

}
