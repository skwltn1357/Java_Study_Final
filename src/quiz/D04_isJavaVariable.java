package quiz;

import java.util.Scanner;

public class D04_isJavaVariable {
	/*
	 	사용자로부터 문자열을 입력받으면 해당 문자열이 자바의 변수로써 사용될 수 있는지
	 	검사하는 메서드를 만들고 테스트해보세요
	 	
	 	첫번째 글자는 문자 or 특수문자만 가능 (숫자x), 공백x, 숫자는 첫번째만 아니면 다 들어가도 된다
	 */
	
	public static void main(String[] args) {
		String str = "JAva123";

	}
	
	public static boolean check(char[] str) {
		// Character.isJavaIdentifierStart : 자바 변수명의 첫번째 글자로 적합한지 체크
		boolean check = Character.isJavaIdentifierStart(str[0]);
		
		// Character.isJavaIdentifierPart : 자바 변수명의 나머지 부분으로 적합한지 체크
		for(int i = 1; i < str.length; ++i) {
			check = check && Character.isJavaIdentifierPart(str[i]);
		}
		
		return check;
	}

}