package quiz;

import java.util.Scanner;

public class A06_CelToFhar {
	
	public static void main(String[] args) {
		
	
	/*
	 	사용자로부터 섭씨 온도를 입력 받으면 화씨 온도로 변환하여 출력해주는 프로그램을 만들어보세요
	 	(변환 공식은 검색 허용, 출력은 소수 첫째 자리까지)
	 */
	
	Scanner sc = new Scanner(System.in);
	System.out.print("섭씨 온도 입력 : ");
	double tem = sc.nextDouble();
	System.out.printf("화씨 온도는 %.1f입니다.\n", tem*1.8+32);
	
	
	
//	double cel, fahr;
//	System.out.print("섭씨 온도 입력 : ");
//	cel = new Scanner(System.in).nextDouble();
//	
//	fahr = cel * 9 / 5 + 32;
//	System.out.printf("%.1f℃는 ",cel);
	}
	

}