package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {
	/*
	 	점수를 입력받으면 점수에 해당하는 알맞은 등급을 출력해주는 프로그램을 만들어보세요
	 		90점 이상 : A
	 		80점 이상 : B
	 		70점 이상 : C
	 		60점 이상 : D
	 		그 외 : F
	 		
	 	* 유효한 점수는 0 ~ 100점 입니다
	 */
	public static void main(String[] args) {
		
		// 조건문을 만들 때 잘못된 값을 먼저 거르는 것이 좋다
		
	Scanner sc = new Scanner(System.in);
//	System.out.print("점수를 입력하세요 : ");
//	int grade = sc.nextInt();
//	
//	if(grade < 0 || grade > 100) {
//		System.out.println("잘못된 점수 입니다.");		
//	}else if(grade >= 90) {
//		System.out.println("A등급");	
//	}else if(grade >= 80) {
//		System.out.println("B등급");
//	}else if(grade >= 70) {
//		System.out.println("C등급");
//	}else if(grade >=60) {
//		System.out.println("D등급");
//	}else {
//		System.out.println("F등급");
//	}
//		
	
		char grade = 'Z';
		int score;
		
		System.out.print("점수를 입력해주세요 > ");
		score = sc.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("잘못된 값을 입력하셨습니다.");
			grade = 'F';
		}else if (score >= 90) {
			grade = 'A';
		}else if (score >= 80) {
			grade = 'B';
		}else if (score >= 70) {
			grade = 'C';
		}else if (score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.printf("당신의 등급은 %c입니다.\n.",grade);
	}
}

