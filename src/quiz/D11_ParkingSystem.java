package quiz;

import java.time.LocalDate;

public class D11_ParkingSystem {
	 public static void main(String[] args) {
	      Car c1 = new Car();
	      System.out.println(c1.car_type);
	      System.out.println(c1.carLastNum);
	      
	      LocalDate searchDay = LocalDate.of(2018, 9, 1);
	      
	      LocalDate enforceDay = LocalDate.of(2018, 8, 31);
	      
	      String day = "" + searchDay;
	      
	      if (searchDay.isAfter(enforceDay)) {
	         if (Holiday(day)) {
	            System.out.println("공휴일 : 모든차량 출입 가능합니다");
	         } else if (c1.car_type == "장애인" || c1.car_type == "유아동승" || c1.car_type == "경차") {
	            System.out.println("차량종류로 인해 출입이 가능합니다");
	         } 
	      } else {
	         System.out.println("차량5부제가 시행되지 않아서 모든차량이 출입가능합니다");
	      }
	   }
	   
	   public static void Day(int lastNum){
	      String day = null;
	      
//	      switch(lastNum) {
//	      case 1:
//	      case 6: day="월요일"; break;
//	      case 2:
//	      case 7: day="화요일"; break;
//	      case 3:
//	      case 8: day="수요일"; break;
//	      case 4:
//	      case 9: day="목요일"; break;
//	      case 5:
//	      case 0: day="금요일"; break;
//	      }
//	      System.out.printf("차량번호의 끝자리가 %d인 차량은 %s 운행을 제한합니다.",lastNum,day);
	   }
	   
	   public static boolean Holiday(String day) {
	      boolean holiday = false;
	      String[] hol = {"01-01","03-01","05-05","06-06","08-15","10-03","10-09","12-25"};
	      for(int i=0; i<hol.length; ++i) {
	         if(day.contains(hol[i])) {
	            holiday = true;
	         }
	      }
	      return holiday;
	   }
	   
	}
	class Car {
	   int lastNum = (int)(Math.random() * 10);
	   int ran = (int)(Math.random() * 4);
	   int carLastNum;
	   String car_type;
	   String[] carType = {"장애인","유아동승","경차","중형","대형"};

	   Car() {
	      this.carLastNum = lastNum;
	      this.car_type = carType[ran];
	   }



}
