package quiz;

import java.util.Scanner;

public class A06_CelToFhar {
	
	public static void main(String[] args) {
		
	
	/*
	 	����ڷκ��� ���� �µ��� �Է� ������ ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������
	 	(��ȯ ������ �˻� ���, ����� �Ҽ� ù° �ڸ�����)
	 */
	
	Scanner sc = new Scanner(System.in);
	System.out.print("���� �µ� �Է� : ");
	double tem = sc.nextDouble();
	System.out.printf("ȭ�� �µ��� %.1f�Դϴ�.\n", tem*1.8+32);
	
	
	
//	double cel, fahr;
//	System.out.print("���� �µ� �Է� : ");
//	cel = new Scanner(System.in).nextDouble();
//	
//	fahr = cel * 9 / 5 + 32;
//	System.out.printf("%.1f�ɴ� ",cel);
	}
	

}