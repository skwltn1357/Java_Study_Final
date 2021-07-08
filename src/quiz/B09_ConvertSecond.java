package quiz;

import java.util.Scanner;

public class B09_ConvertSecond {
	/*
	 	초를 입력 받으면 년/일/시간/분/초로 변환하여 출력해보세요
	 	
	 	* 단, 필요없는 단위는 출력하지 말 것
	 	ex : 0년 0일 13시간 0분 5초인 경우 -> 13시간 0분 5초만 나와야 함
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int second = sc.nextInt();
		
		int [] converted = new int[4];
		int [] seconds = new int[4];
		String[] units = {"년","일","시","분"};
		
		seconds[0] = 365 * 24 * 60 * 60;
		seconds[1] = 24 * 60 * 60;
		seconds[2] = 60 * 60;
		seconds[3] = 60;
		
		for(int i = 0; i < converted.length; ++i) {
			converted[i] = second / seconds[i];
			second %= seconds[i];
		}
		
		boolean exist = false;
		
		for(int i = 0; i < converted.length; ++i) {
			if(converted[i] != 0 || exist) {
				System.out.printf("%d%s ",converted[i],units[i]);
				exist = true;
			}
		}
		System.out.printf("%d초",second);
		System.out.println();
		
		
		
		
		
		
		
		
		
//		int y = 0 , d = 0, h = 0, m = 0, s = 0;
//		
//		final int SECOND_PER_YEAR = 365 * 24 * 60 * 60;
//		final int SECOND_PER_DAY = 24 * 60 * 60;
//		final int SECOND_PER_HOUR = 60 * 60;
//		final int SECOND_PER_MINUTE = 60;
//		
//		System.out.printf("'%d'초는 변환하면 ", second);
//		
//		y = second / SECOND_PER_YEAR;
//		second %= SECOND_PER_YEAR;
//		
//		d = second / SECOND_PER_DAY;
//		second %= SECOND_PER_DAY;
//		
//		h = second / SECOND_PER_HOUR;
//		second %= SECOND_PER_HOUR;
//		
//		m = second / SECOND_PER_MINUTE;
//		second %= SECOND_PER_MINUTE;
//			
//		boolean exist = false;
//		
//		if(y != 0) {
//			System.out.print(y + "년");
//			exist = true;
//		}
//		if(d != 0 || exist) {
//			System.out.print(d + "일");
//			exist = true;
//		}
//		if(h != 0 || exist) {
//			System.out.print(h + "시간");
//			exist = true;
//		}
//		if(m != 0 || exist) {
//			System.out.print(m + "분");
//			exist = true;
//		}
//		System.out.println(second + "초");
	}

}







