package quiz;

import java.util.Scanner;

public class B05_PrintReverse {
	
	public static void main(String[] args) {
		
		// 사용자가 어떤 문장을 입력하면 그 문장을 거꾸로 출력해보세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장 입력 : ");
		String st = sc.nextLine();
		
		int i;
				
		for(i = st.length()-1; i > -1; --i ) {
			System.out.print(st.charAt(i));
		}
		
		
		
	}

}
