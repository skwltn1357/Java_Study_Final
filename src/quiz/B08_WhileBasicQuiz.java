package quiz;

public class B08_WhileBasicQuiz {
	/*
	 	while���� �̿��Ͽ� ������ ���Ͻÿ�.
	 	
	 	1. 1 ���� 100 ���̿� �ִ� 3�� ����� ����
	 	
	 	2. 355���� 237���� ���
	 	
	 	3. continue�� �ݵ�� ����Ͽ� 3000 ���� 5000 ������ 7�� ����� ���
	 	
	 	4. 1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
	 */
	
	public static void main(String[] args) {
		
	
		// 1��		
		int i = 0;
		int sum = 0;
		
		while(i < 100) {
			if(++i % 3 == 0) {
				System.out.println(i);
				sum += i;
		}
		
	}
		System.out.println("���� : " + sum);
		
				
		
		
		// 2��		
		i = 355;
		while(i >= 237) {	
			System.out.println(i--);		
		}
		System.out.println();
		
		
		
		
		// 3��		
		i = 3000;

		while(i <= 5000) {
			if(i % 7 != 0) {
				++i;
				continue;
			}
			System.out.println(i);
			++i;
		
	}
		System.out.println();
	
		
		
		
		
		// 4��
		i = 1;
		sum = 0;
		
		
		while(i <= 200) {
			if(i % 2 != 0 && i % 3 != 0) {
				sum += i;		
		}	
			++i;
	}
		System.out.println("4�� �� : " + sum);
		
		
		}		
	}












