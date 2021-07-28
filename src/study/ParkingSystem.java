package study;

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
public class ParkingSystem {	
	String holiday;
	String carType;
	String carNum;
	
	
	
	ParkingSystem(String holiday, String carType, String carNum){
		this.holiday = holiday;
		this.carType = carType;
		this.carNum = carNum;
		
		
	}
	
	public boolean endNumCheck() {
		if(carNum.charAt(carNum.length() -1) == '1' || carNum.charAt(carNum.length() -1) == '6') {
			System.out.println("월요일 운행 제한 차량 번호 입니다.");
			return true;
		}else if(carNum.charAt(carNum.length() -1) == '2' || carNum.charAt(carNum.length() -1) == '7') {
			System.out.println("화요일 운행 제한 차량 번호 입니다.");
			return true;
		}else if(carNum.charAt(carNum.length() -1) == '3' || carNum.charAt(carNum.length() -1) == '8') {
			System.out.println("수요일 운행 제한 차량 번호 입니다.");
			return true;
		}else if(carNum.charAt(carNum.length() -1) == '4' || carNum.charAt(carNum.length() -1) == '9') {
			System.out.println("목요일 운행 제한 차량 번호 입니다.");
			return true;
		}else if(carNum.charAt(carNum.length() -1) == '5' || carNum.charAt(carNum.length() -1) == '0') {
			System.out.println("금요일 운행 제한 차량 번호 입니다.");
			return true;
		}

		return false;
	}
	
	public boolean carCheck() {
		String[] car = {"장애인","유아동승","경차"};
		boolean boo = false;
		String message = "차량 5부제 제외 차량이 아니므로 출입 불가합니다.";
		
		for(int i=0; i<car.length; ++i) {
			if(carType.equals(car[i])) {
				boo = true;
				message = "차량5부제 제외 차량이므로 출입 가능합니다.";
			}
		}
		System.out.println(message);
		return boo;
	}
	
	public boolean holidayCheck() {
		String[] hol = {"1/1","3/1","5/5","6/6","8/15","10/3","10/9","12/25"};
		boolean boo = false;
		String message = "공휴일이 아닙니다.";
		
		for(int i=0; i<hol.length; ++i) {
			if(holiday.equals(hol[i])) {
				boo = true;
				message = "공휴일은 모든 차량이 출입 가능합니다";
			}
		}
		System.out.println(message);
		return boo;
	}
	
	public static void main(String[] args) {
		 ParkingSystem ps = new ParkingSystem("3/1","경차","4298");
		 System.out.println(ps.endNumCheck());
		 System.out.println(ps.holidayCheck());
		 System.out.println(ps.carCheck());
		 
		 
		 
	}
	
}









