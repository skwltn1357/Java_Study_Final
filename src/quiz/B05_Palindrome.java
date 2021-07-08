package quiz;

import java.util.Scanner;

public class B05_Palindrome {
	public static void main(String[] args) {
		
		/*
		 	사용자로부터 단어를 하나 입력 받고 해당 단어가 회문이라면
		 	"PALINDROME"을 출력 , 회문이 아니라면 "NOT PALINDROME"을 출력
		 	
		 	# 회문이란 - MOM, BOB, ABBA, MADAM
		 */
	
	
	Scanner sc = new Scanner(System.in);
	System.out.print("단어 입력 : ");
	String str = sc.nextLine();
	
	int half = str.length() / 2;
	int correct = 0;
	
	for(int i = 0; i< half; ++i) {
		char front = str.charAt(i);
		char back = str.charAt(str.length() -1 -i);
		
		System.out.printf("'%c'와 '%c'를 비교합니다.\n",front,back);
		
		if(front == back) {
			correct++;
			
		}
	}
	
	if (correct == half) {
		System.out.println("PALINDROME");
	}else {
		System.out.println("NOT PALINDROME");
	}
	
	
	
	
	//거꾸로 뒤집는 방법
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
