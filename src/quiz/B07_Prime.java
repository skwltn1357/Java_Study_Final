package quiz;

import java.util.Scanner;

public class B07_Prime {
	
	public static void main(String[] args) {
		
		/*
		 	����ڷκ��� ����(���)�� �Է¹�����
		 	1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����
		 	(������ �Է��ϸ� �ٽ� ����� �Է��ϰ� �ϱ�)
		 	
		 	# �Ҽ� : ������ �������� ���� 1�� �ڱ� �ڽŹۿ� ���� ����
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : " );
		int num = sc.nextInt();
		
		for(;num < 0 ;) {
			System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���.");
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
