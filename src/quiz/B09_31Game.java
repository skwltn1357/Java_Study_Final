package quiz;

import java.util.Scanner;

public class B09_31Game {
	/*
	 	# 31 ������ ��������
	 	
	 	1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����ؾ� �Ѵ�.
	 	  (1, 2, 3 �ۿ� ������ �� ����)
	 		
	 	2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�
	 	
	 	3. ������ �������� �����Ѵ�
	 	
	 	4. �������� 31 �̻��� ���ڸ� �θ��� �÷��̾ �й��Ѵ�.
	 	
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 0�� ��ǻ�� , 1�� ���
		int turn = (int)(Math.random() * 2);
		int num = 0;
		
		if (turn == 0) {
			System.out.println("��ǻ�� ���� !");
		}else {
			System.out.println("����� ����!");
		}
		
		while(num < 31) {
			
			if(turn == 0) {
				int com = (int)(Math.random() * 3 + 1);			
				num += com;
				System.out.printf("��ǻ�Ͱ� %d�� ������ϴ�.[���� ����:%d]\n",com,num);
			}else {
				System.out.print("1, 2, 3? ");
				num += sc.nextInt();
				System.out.printf("[���� ����:%d]\n",num);
				
			}
			
			// ���� 0�� 1�� �ݺ��ǰ� ��
			turn = (turn + 1) % 2;
		}
		//���� ������
		System.out.printf("���� ����! %s�� �¸�!\n ",turn != 0 ? "�÷��̾�":""
				+ "��ǻ��");
		
//		if (turn == 0) {
//			System.out.println("���� ����! ��ǻ���� �¸�!");
//		}else {
//			System.out.println("���� ����! �÷��̾��� �¸�!");
//		}
		
	}
}











