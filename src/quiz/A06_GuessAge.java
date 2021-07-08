package quiz;

import java.util.Scanner;

public class A06_GuessAge {
	
	public static void main(String[] args) {
		
	
	/*
	 	사용자로부터 태어난 해와 올해의 년도를 입력받으면
	 	그 사람의 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을 만들어보세요
	 */
	
	Scanner sc = new Scanner(System.in);
	int born, year, age;
	System.out.print("태어난 해 : ");
	born = sc.nextInt();
	System.out.print("올해의 년도 : ");
	year = sc.nextInt();
	
	age = year - born + 1;
	System.out.println("당신의 나이 : " + age + "살");
	}
}
