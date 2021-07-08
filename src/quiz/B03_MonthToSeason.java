package quiz;

import java.util.Scanner;

public class B03_MonthToSeason {
	/*
	 	사용자로부터 달을 입력받으면 해당하는 계절을 출력해보세요
	 	(switch-case문을 사용할 것)
	 */
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.print("달 입력 : ");
	int month = sc.nextInt();
	
//	String spring = "봄";
//	String summer = "여름";
//	String fall = "가을";
//	String winter = "겨울";
//	
//	switch(month) {
//	case 3 :
//		System.out.println(spring);
//		break;
//	case 4 : 
//		System.out.println(spring);
//		break;
//	case 5 : 
//		System.out.println(spring);
//		break;	
//	case 6 : 
//		System.out.println(summer);
//		break;
//	case 7 : 
//		System.out.println(summer);
//		break;
//	case 8 : 
//		System.out.println(summer);
//		break;
//	case 9 : 
//		System.out.println(fall);
//		break;
//	case 10 : 
//		System.out.println(fall);
//		break;
//	case 11 : 
//		System.out.println(fall);
//		break;
//	case 12 : 
//		System.out.println(winter);
//		break;
//	case 1 : 
//		System.out.println(winter);
//		break;
//	case 2 : 
//		System.out.println(winter);
//		break;
//	default :
//		System.out.println("1~12월 중에서 입력하세요.");
//	}
	
	String season;
	
	switch(month) {
	case 12: case 1: case 2:
		season = "겨울";
		break;
	case 3: case 4: case 5:
		season = "봄";
		break;
	case 6: case 7: case 8:
		season = "여름";
		break;
	case 9: case 10: case 11:
		season = "가을";
		break;
	default:
		season = "없음";
		break;
	}
	
	if(month < 1 || month > 12) {
		System.out.println("잘못된 계정입니다");
	}else {
	System.out.printf("%d월은 %s입니다.\n",month,season);
	}
	}

}
