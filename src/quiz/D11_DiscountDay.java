package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D11_DiscountDay {
	/*
	 	어떤 옷가게에서 할인 행사를 짝수번째 목요일마다 진행한다고 한다.  
	 	년도를 입력하면 해당 년도의 모든 할인 날짜를 출력해주는 프로그램을 만들어보세요
	 */
	public static void main(String[] args) {
		
		int year = 2021;		
		printEventOfYear(year);
	}
	
	public static Calendar getFirstEventDay(int year) {
		Calendar event = Calendar.getInstance();
		event.set(year, 0, 1);	//1월부터 1일씩
		event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		
//		while(event.get(Calendar.DAY_OF_WEEK) != Calendar.THURSDAY) {
//			event.add(Calendar.DATE, 1);
//		}
//		
		if(event.get(Calendar.YEAR) != year) {
			event.add(Calendar.DATE, 7);
		}
		
		return event;
	}
	
	public static void printEventOfYear(int year) {
		SimpleDateFormat eventDateFormat = new SimpleDateFormat("[y년 이벤트] M월 d일\tE요일");
		Calendar event = getFirstEventDay(year);

		int count = 0;
		
		while(event.get(Calendar.YEAR) == year) {
			event.add(Calendar.DATE, 7);
			
			if(event.get(Calendar.DAY_OF_WEEK_IN_MONTH) % 2 == 0) {
				System.out.println(eventDateFormat.format(event.getTime()));
				count++;
			}
		}
		System.out.println("올해의 이벤트는 총 " + count + "회 입니다.");
	}
}













