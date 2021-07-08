package quiz;

public class C01_FunctionQuiz_지수풀이 {
	/*
	 	# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 	
	 	1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 	
	 	2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 	
	 	3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	 	
	 	4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
	 	
	 	5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 	
	 	6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	 		factorial: (n)*(n-1)*(n-2)...3*2*1
	 */
	public static void main(String[] args) {
		
	System.out.println(Alphabet("abc")); //1번
	
	System.out.println(Number(14));		//2번
	
	System.out.println(Return(6));		//3번
	
		
	}
	//1번
	public static boolean Alphabet(String str) {
		
		boolean alpha = true;
		
		for(int i = 0; i < str.length(); ++i) {
			
			char ch = str.charAt(i);
			
			if(!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
				alpha = false;
				break;
			}
		}
		return alpha;		
		
	}
	
	//2번		
	public static boolean Number(int num) {
		
		boolean multiple = false;
		
		for(int i = 0; i < num; ++i) {
			if(num % 3 == 0) {
				multiple = true;
				break;
			}
		}
		return multiple;
		
	}
	
	//3번
	public static String Return(int num) {
		for(int i = 0; i < num; ++i) {
			if(num % 2 == 0) {
				return "짝수입니다";
			}else if(num % 2 == 1) {
				return "홀수입니다";
			}
		}
		return null;
		
		
		
		
	}
		
	}


