package myobj.parking;

import java.time.LocalDate;
import java.util.ArrayList;
/*
1. 차량 5부제 끝자리 번호 체크 (4자리중 마지막 숫자)
   - 월요일 : 1, 6
   - 화요일 : 2, 7
   - 수요일 : 3, 8
   - 목요일 : 4, 9
   - 금요일 : 5, 0
   - 공휴일 : 제외
   
2. 시행 일자 : 2018년 9월 1일

3. 공휴일(음력 제외)
   - (1월 1일) 신정
   - (3월 1일) 삼일절
   - (5월 5일) 어린이날
   - (6월 6일) 현충일
   - (8월 15일) 광복절
   - (10월 3일) 개천절
   - (10월 9일) 한글날
   - (12월 25일) 크리스마스
   
4. 제외 차량 : 장애인, 유아동승, 경차	
*/

public class D11_ParkingSystem2 {
	
	 private static ArrayList<LocalDate> holidays = new ArrayList<LocalDate>() {
		 private static final long serialVersionUID = 1L;	//ArrayList에 노란줄 떠서 추가한 것
		 {
			 this.add(LocalDate.of(2000, 1, 1));
			 this.add(LocalDate.of(2000, 3, 1));
			 this.add(LocalDate.of(2000, 5, 5));
			 this.add(LocalDate.of(2000, 6, 6));
			 this.add(LocalDate.of(2000, 8, 15));
			 this.add(LocalDate.of(2000, 10, 3));
			 this.add(LocalDate.of(2000, 10, 9));
			 this.add(LocalDate.of(2000, 12, 25));
		 }
	 };
	 
	 private boolean checkHoliday(Car car) {
		 
		 for (LocalDate holiday : holidays) {
			if (holiday.getDayOfMonth() == car.getPark_date().getDayOfMonth()
					&& holiday.getMonthValue() == car.getPark_date().getMonthValue()) {
				return true;
			}
		 }
		 return false;
	 }
	 
	 public static void main(String[] args) {
		D11_ParkingSystem2 parking = new D11_ParkingSystem2();
		
		for(int i=0; i<100; ++i) {
			Car car = new Car();
			
			if(parking.checkHoliday(car)) {
				System.out.println(car.getPark_date() + "는 공휴일 입니다.");
			}else {
				System.out.println(car.getPark_date() + "는 공휴일이 아닙니다.");
			}
		}
	}
}