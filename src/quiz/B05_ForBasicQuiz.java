package quiz;

import java.util.Scanner;

public class B05_ForBasicQuiz {
	public static void main(String[] args) {
		
		/*
		 	����ڰ� ���ڸ� �Է� ���� ��
		 	1. 10���� �Է��� ���ڱ����� ������ ���غ�����
		 	2. 1000���� �Է��� ���ڱ��� ������� ������ ��������
		 	3. 1���� �Է��� ���� ������ 5�� ����� ����غ�����
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int i;
		
		//1��
		int sum = 0;
		int start , end;
		
		if(num > 10) {
			start = 10;
			end = num;
		} else {
			start = num;
			end = 10;
		}
		for(i = start ; i <= end ; ++i) {
			sum += i;
		}
		
		System.out.printf("10���� %d������ ������ %d�Դϴ�. : " ,num,sum);
		
		
		
		
		
		//2��
		if(num > 1000) {
			for(i = 1000 ; i <= num ; ++i) {
				System.out.printf("1000���� %d���� ��� : %d\n",num,i);
			}
		}else {
			for(i = 1000 ; i >= num ; --i) {
				System.out.printf("1000���� %d���� ��� : %d\n",num,i);
			}
		}
		
		
			
		
		//3��
		for(i = 1 ; i <= num ; ++i) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
	
				
		}


		
	}

}
