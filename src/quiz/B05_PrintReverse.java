package quiz;

import java.util.Scanner;

public class B05_PrintReverse {
	
	public static void main(String[] args) {
		
		// ����ڰ� � ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String st = sc.nextLine();
		
		int i;
				
		for(i = st.length()-1; i > -1; --i ) {
			System.out.print(st.charAt(i));
		}
		
		
		
	}

}
