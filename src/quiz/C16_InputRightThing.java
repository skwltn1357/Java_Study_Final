package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C16_InputRightThing {
	/*
	 	����ڷκ��� ���ڸ� �Է¹޵� ���ڸ� ����� �Է¹��������� ��� �Է¹޴� ���α׷��� ��������
	 	(�߸��� �ٸ� Ÿ���� ���� �ԷµǾ ���α׷��� ����������� �ʾƾ� �մϴ�)
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// ��ĳ�ʿ� �߸��� �Է��� �ϸ� ��Ⱑ �����ְ� �ȴ�
		
		while(true) {
			try {
				System.out.print("���� �Է� : ");
				int a = sc.nextInt();
				System.out.println(a);
				System.out.println("����!");
				break;
			}catch(InputMismatchException e) {
				System.out.println("���ڷ� �ٽ� �Է����ּ���!");
				System.out.println("�߸��Էµƴ� �� : " + sc.nextLine());
			}
		}
	
		System.out.println("���α׷� ����!");
	}
	
}
