package quiz;

import java.util.Scanner;

public class A06_GuessAge {
	
	public static void main(String[] args) {
		
	
	/*
	 	����ڷκ��� �¾ �ؿ� ������ �⵵�� �Է¹�����
	 	�� ����� �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ��������
	 */
	
	Scanner sc = new Scanner(System.in);
	int born, year, age;
	System.out.print("�¾ �� : ");
	born = sc.nextInt();
	System.out.print("������ �⵵ : ");
	year = sc.nextInt();
	
	age = year - born + 1;
	System.out.println("����� ���� : " + age + "��");
	}
}
