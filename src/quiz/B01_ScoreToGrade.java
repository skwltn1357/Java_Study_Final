package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {
	/*
	 	������ �Է¹����� ������ �ش��ϴ� �˸��� ����� ������ִ� ���α׷��� ��������
	 		90�� �̻� : A
	 		80�� �̻� : B
	 		70�� �̻� : C
	 		60�� �̻� : D
	 		�� �� : F
	 		
	 	* ��ȿ�� ������ 0 ~ 100�� �Դϴ�
	 */
	public static void main(String[] args) {
		
		// ���ǹ��� ���� �� �߸��� ���� ���� �Ÿ��� ���� ����
		
	Scanner sc = new Scanner(System.in);
//	System.out.print("������ �Է��ϼ��� : ");
//	int grade = sc.nextInt();
//	
//	if(grade < 0 || grade > 100) {
//		System.out.println("�߸��� ���� �Դϴ�.");		
//	}else if(grade >= 90) {
//		System.out.println("A���");	
//	}else if(grade >= 80) {
//		System.out.println("B���");
//	}else if(grade >= 70) {
//		System.out.println("C���");
//	}else if(grade >=60) {
//		System.out.println("D���");
//	}else {
//		System.out.println("F���");
//	}
//		
	
		char grade = 'Z';
		int score;
		
		System.out.print("������ �Է����ּ��� > ");
		score = sc.nextInt();
		
		if(score < 0 || score > 100) {
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
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
		
		System.out.printf("����� ����� %c�Դϴ�.\n.",grade);
	}
}

