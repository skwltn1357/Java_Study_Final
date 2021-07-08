package quiz;

import java.util.Scanner;

public class B02_CheckWord {
	
	public static void main(String[] args) {
		
		/*
		 	사용자로부터 단어를 하나 입력받고 
		 	첫번째 글자가 영어이면서 마지막 번째 글자가 일치하면 "OK"를 출력하고,
		 	일치하지 않으면 "NOT OK"를 출력해보세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		//지수 풀이
		System.out.print("단어를 입력하세요 : ");
		String word = sc.nextLine();
//		
//		if(word.charAt(0) >= 'a' || word.charAt(0) <= 'z'|| word.charAt(0) >= 'A' || word.charAt(0) <= 'Z' &&
//				word.charAt(0) == word.charAt(word.length()-1)) {
//			System.out.println("OK");	
//		}else {
//			System.out.println("NOT OK");
//			
//		}
		
		
		//선생님 풀이
		
		
		char first_letter = word.charAt(0);
		char last_letter = word.charAt(word.length()-1);
		
		boolean match = first_letter == last_letter;
		boolean alphabet = (first_letter >= 'A' && first_letter <= 'Z') ||
				(first_letter >= 'a' && first_letter <= 'z');
		
			
		if (match && alphabet) {
			System.out.println("OK");
		}else {
			System.out.println("NOT OK");
		}
	}

}













