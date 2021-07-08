package quiz;

import java.util.Scanner;

public class B05_Palindrome {
	public static void main(String[] args) {
		
		/*
		 	����ڷκ��� �ܾ �ϳ� �Է� �ް� �ش� �ܾ ȸ���̶��
		 	"PALINDROME"�� ��� , ȸ���� �ƴ϶�� "NOT PALINDROME"�� ���
		 	
		 	# ȸ���̶� - MOM, BOB, ABBA, MADAM
		 */
	
	
	Scanner sc = new Scanner(System.in);
	System.out.print("�ܾ� �Է� : ");
	String str = sc.nextLine();
	
	int half = str.length() / 2;
	int correct = 0;
	
	for(int i = 0; i< half; ++i) {
		char front = str.charAt(i);
		char back = str.charAt(str.length() -1 -i);
		
		System.out.printf("'%c'�� '%c'�� ���մϴ�.\n",front,back);
		
		if(front == back) {
			correct++;
			
		}
	}
	
	if (correct == half) {
		System.out.println("PALINDROME");
	}else {
		System.out.println("NOT PALINDROME");
	}
	
	
	
	
	//�Ųٷ� ������ ���
//	String reverse = "";
//	for(int i = str.length() -1; i > -1; --i ) {
//		reverse += str.charAt(i);
//	}
//	if(str.equals(reverse)) {
//		System.out.println("PALINDROME");
//	}else {
//		System.out.println("NOT PALINDROME");
//	}

	}
}
