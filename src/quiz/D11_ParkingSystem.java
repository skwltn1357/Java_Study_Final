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
	            System.out.println("������ : ������� ���� �����մϴ�");
	         } else if (c1.car_type == "�����" || c1.car_type == "���Ƶ���" || c1.car_type == "����") {
	            System.out.println("���������� ���� ������ �����մϴ�");
	         } 
	      } else {
	         System.out.println("����5������ ������� �ʾƼ� ��������� ���԰����մϴ�");
	      }
	   }
	   
	   public static void Day(int lastNum){
	      String day = null;
	      
//	      switch(lastNum) {
//	      case 1:
//	      case 6: day="������"; break;
//	      case 2:
//	      case 7: day="ȭ����"; break;
//	      case 3:
//	      case 8: day="������"; break;
//	      case 4:
//	      case 9: day="�����"; break;
//	      case 5:
//	      case 0: day="�ݿ���"; break;
//	      }
//	      System.out.printf("������ȣ�� ���ڸ��� %d�� ������ %s ������ �����մϴ�.",lastNum,day);
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
	   String[] carType = {"�����","���Ƶ���","����","����","����"};

	   Car() {
	      this.carLastNum = lastNum;
	      this.car_type = carType[ran];
	   }



}
