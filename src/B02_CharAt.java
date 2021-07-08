
public class B02_CharAt {
	/*
	 	# "문자열".CharAt(index);
	 	- 해당 문자열에서 원하는 번째의 문자를 char타입으로 꺼내는 함수
	 	- 첫 번째 문자는 0번 인덱스에 있다
	 	# "문자열".length();
	 	- 해당 문자열이 총 몇글자인지를 int타입으로 알려준다
	 */
	
	public static void main(String[] args) {
		
		String text = "Hello, everyone!!";
		
		
		System.out.println(text.charAt(4)); // 4번째 문자
		System.out.println(text.length()); // 문자열 갯수
		// 0번 인덱스부터 17개의 문자가 있기 때문에 16번 인덱스가 마지막이다
		System.out.println(text.charAt(text.length() - 1)); // 마지막글자
	}

}
