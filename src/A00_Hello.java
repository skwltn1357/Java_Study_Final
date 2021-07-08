/* <단축키>
 * - Alt + 방향키 : 줄 이동
 * - Home : 줄의 맨 앞으로 이동
 * - End : 줄의 맨 뒤로 이동
 * - Shift + Home : 현재 커서 위치부터 줄의 맨 앞까지 블록지정
 * - Shift + End : 현재 커서 위치부터 줄의 맨 뒤까지 블록지정
 * - Ctrl + M : 현재 화면 최대/최소화
 * 
 * <Windows 단축키>
 * - win + Shift + s : 캡쳐
 * - win + . : 이모티콘
 * - win + D : 바탕화면
 * - win + E : 탐색기
 * - win + 방향키 : 화면 절반 쓰기
 * 
 */

// ※ public class의 이름은 반드시 파일명과 같아야 한다
public class A00_Hello {
	//에러가 생겼을 때난 마우스 커서를 두고나 F2를 누르면 해결책을 볼 수 있다.
	
	/*
	 * # main() 함수
	 * - 프로그램의 시작 지점
	 * - 사용자가 프로그램을 시작하면 가장 먼저 main() 함수를 찾아서 실행한다.
	 * - main() 함수의 범위는 중괄호{}로 결정된다
	 * - 중괄호의 범위를 알기 쉽게 하기 위해 (Tab)을 사용한다
	 * - main() 함수가 끝나면 프로그램도 종료된다
	 * 
	 * 
	 * # 함수란?
	 * - 어떤 단어 뒤에 ()가 있는 것을 모두 함수라고 부른다.
	 */
	
	
	public static void main(String[] args) {
		//프로그램의 시작
		
		System.out.println("Hello, world!");
		
		
		//''를 사용하는 문자 타입 데이터는 실제로는 숫자값을 가지고 있다.
		System.out.println('A');
		System.out.println((int)'A');	// 'A'를 숫자로 표현하라는 뜻
		System.out.println(66);			// 66을 문자로 표현하라는 뜻
		System.out.println((char)66);
		
		//'D'가 'A'보다 얼마나 뒤에 있는 문자인지 알 수 있음
		System.out.println('D' - 'A');
		
		// 정수와 문자를 계산하면 기본적으로는 정수가 된다.
		System.out.println('A' + 3);
		
		System.out.println((char)('A' + 0));	//A
		System.out.println((char)('A' + 1));	//B
		System.out.println((char)('A' + 2));	//C
		System.out.println((char)('A' + 3));	//D
		System.out.println((char)('A' + 4));	//E
		
		System.out.println((int)'가');	//문자열의 몇번째 수
		System.out.println((int)'한');
		
		// ""을 사용하는 문자열 타입과 다른 타입을 더하면 계산을 하는 것이 아니라 이어붙인다
		System.out.println("10" + 10);
		
		// 정수 + 실수의 결과는 실수다
		System.out.println(3.14 + 10);
		
		// 실수를 정수로 변환하면 소수점 아래를 삭제한다
		System.out.println((int)33.999999);
		System.out.println((int)3.5 + 3.5);
	}

}
