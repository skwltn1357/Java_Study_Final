package quiz;

import java.util.Scanner;

public class B01_AppleQuiz {
	
	public static void main(String[] args) {
		
		/*
		 	����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
		 	
		 	����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ�
		 	����� ��� ��� ���� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������.
		 */
		
		int apple;
		int basket;
		int basket_size = 10;
		//double basket_size = 10;
		//double basket; 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ���� �Է� > ");
		apple = sc.nextInt();	
		
		if(apple % basket_size == 0) {
			basket = apple / basket_size;
			
		}else {
			basket = apple / basket_size + 1;
		}
		
		if (apple < 0) {
			System.out.println("�ùٸ� ��� ������ �ƴմϴ�");
		}else {
			System.out.printf("�ʿ��� �ٱ����� ������ %d�� �Դϴ�",basket);
		}
		
		//basket = apple / basket_size;
		
		// Math.ceil(a) : a�� �Ҽ� ù° �ڸ������ø���
		// Math.floor(a) : a�� �Ҽ� ù° �ڸ����� ������
//		System.out.printf("�ʿ��� �ٱ����� ������ %d�� �Դϴ�",
//				(int)Math.ceil(basket));
//		

					
		
		
		
	}

}
