package quiz;

public class A09_ConditionQuiz {
	
	public static void main(String[] args) {
		
		int a=0 , b = 0 , c = 0, d = 0, e = 0;
		int hour = 0;
		int year = 0;
		int minsuAge = 0;
		int cheolsuAge = 0;
		int minsuBirth= 0;
		int cheolsuBirth= 0;
		boolean powerOn = true;
		String str = "yes";
		
		System.out.println(a > 10 && a < 20);
		System.out.println(b % 2 == 0);
		System.out.println(c % 7 == 0);
		System.out.println(hour < 24 && hour >= 12);
		System.out.println(Math.abs(d-e) == 30);
		System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		System.out.println(cheolsuAge + 2 == minsuAge);
	//	System.out.println(cheolsuBirth == minsuBirth); 
		System.out.println(!powerOn);
		
		
		String str2 = "yes";
		String str3 = new String("yes");
		
		// 참조형 변수의 == 비교는 두 변수가 서로 같은 주소를 지니고 있는지를 비교한다.
		System.out.println("str == \"yes\" : " + (str == "yes"));
		System.out.println("str == str2 : " + (str == str2));
		System.out.println("str == str3 : " + (str == str3));
		
		// 타입명이 대문자로 시작하는 참조형 변수들은 반드시 equals()를 이용해 비교해야 합니다.
		System.out.println(str.equals("yes"));
		System.out.println(str.equals(str3));
		
		// 소문자로 시작하는 타입 변수들은 stack에 차곡차곡 쌓인다
		// 대문자로 시작하는 타입 변수들은 stack에는 주소값만 보관하고 실체는  heap에 존재한다
		// 대문자로 시작하는 타입 변수에는 주소값이 저장되어 있고, 거기에 .을 찍고 실체 데이터를 참조할 수 있다.
		
		
		
	}

}
