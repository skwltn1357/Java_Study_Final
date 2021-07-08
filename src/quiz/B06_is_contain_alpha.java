package quiz;

import java.util.Scanner;

public class B06_is_contain_alpha {
	
	public static void main(String[] args) {
		
		/*
		 	1. 사용자가 입력한 문자열에
		 	알파벳이 포함되어 있으면 true를 출력, 없으면 false를 출력
		 	
		 	2. 사용자가 입력한 문자열이 알파벳으로만 이루어져 있으면 true 아니면 false
		 	
		 	3. 사용자가 허락한 문자만으로 이루어진 문자열이라면 true 아니면 false
		 		(허락한 문자열 : 알파벳 소문자, 숫자, _, $, 첫번째 문자에 숫자 불가)
		 			 	
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String str = sc.nextLine();
		
		//1번
		
		boolean contain = false;
		
		for(int i = 0; i<str.length(); ++i) {
			
			char ch = str.charAt(i);	//한글자씩 검사
			
			if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				contain = true;
				break;
			}
		}
		System.out.println("영어가 한번이라도 나온적 있나요? " + contain);
		
		
		
		
		//2번
		
		boolean only_alpha = true;
		
		for(int i = 0; i < str.length(); ++i) {
			
			char ch = str.charAt(i);
			
			if(!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
				only_alpha = false;
				break;
			}
		}
		System.out.println("영어만 나오나요? " + only_alpha);
		
		
		
		// 3번

		boolean first_letter_check = true, letter_check = true;
		
//		if(str.charAt(0) >= '0' && str.charAt(0) <= '9') {
//			first_letter_check = false;
//		}
		for(int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			
			if(!(ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z'||
					ch == '_' || ch == '$')) {
				letter_check = false;
			}
		}
		
		if(first_letter_check && letter_check) {
			System.out.println("올바른  문자열 입니다 " + true);
		}else {
			System.out.println("허용되지 않은 문자열 입니다  " + false);
		}
		
	}

}











