package quiz;

public class D09_BruteForce_선생님풀이 {
	/*
	 	# 비밀번호의 길이를 입력받으면 다음 문자로 만들 수 있는 모든 해당 길이의 비밀번호를 출력해보세요
	 	
	 		- 영어 대/소문자
	 		- 숫자
	 		- 특수문자(shift누르고 가능한것들)
	 		
	 		ex : 4 입력 -> 0000 ~ zzzz
	 */
	static String charset = "abcdefghijklmnopqustuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
	
	
	public static void main(String[] args) {
		bruteforce(2);
	}
	
	/*
	 	# 10진수의 경우
	 	
	 	ex) 1234567
	 	  
	 	  1234567 % 10 => 7(일의 자리 분리)
	 	  1234567 / 10 => 123456(일의 자리 삭제)
	 	  123456 % 10 => 6 (일의자리 분리)
	 	  123456 / 10 => 12345(일의 자리 삭제)
	 	  
	 	  # 74진수의 경우
	 	  
	 	   ex) 789!@#$%^
	 	   789!@#$%^ % 74 => ^
	 	   789!@#$%^ / 74 => 789!@#$%
	 	  
	 */
	
	public static void bruteforce(int password_size) {
		char[] arr = charset.toCharArray();
		int len = charset.length();
		long all_password = (long)Math.pow(charset.length(), password_size);
		
		for (long i = 0; i < all_password; i++) {
			long value = i;
			
			String password="";
			while(value > 0) {
				password += arr[(int)(value % len)];
				value /= len;
			}
			
			if(password.length() < password_size) {
				int gap = password_size - password.length();
				for(int j = 0; j < gap; ++j) {
					password = "a" + password;
				}
			}
			System.out.println(password);
}
		System.out.println("len : " + len);
	}

}








