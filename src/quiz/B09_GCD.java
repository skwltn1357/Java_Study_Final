package quiz;

import java.util.Scanner;

public class B09_GCD {
	
	/*
	 	�� ���ڸ� �Է¹ް� �� ������ �ִ������� ���غ�����
	 
	 	# �ִ�����
	 	- �� ������ ����� �� ���� ū �����
	 	
	 	// �ִ����� : 10
	 	20 [1,2,5,10,20]
	 	50 [1,2,5,10,25,50]
	 */
	
	public static void main(String[] args) {
		
		int num1 = 20, num2 =50;
		
//		int max = num1 > num2 ? num1 : num2;
//		int min = num1 < num2 ? num1 : num2;
		
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		int gcd = 1;
		
		for(int i = 1; i <= min ; ++i) {
			
			if(min % i == 0 && max % i == 0) {
				gcd = i;
			}
		}
		System.out.printf("%d�� %d�� �ִ� ������� %d �Դϴ�.",num1,num2,gcd);
	
	}
	

}
