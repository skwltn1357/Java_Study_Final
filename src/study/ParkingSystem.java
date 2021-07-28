package study;

import java.util.ArrayList;

/*
1. ���� 5���� ���ڸ� ��ȣ üũ (4�ڸ��� ������ ����)
   - ������ : 1, 6
   - ȭ���� : 2, 7
   - ������ : 3, 8
   - ����� : 4, 9
   - �ݿ��� : 5, 0
   - ������ : ����
   
2. ���� ���� : 2018�� 9�� 1��

3. ������(���� ����)
   - (1�� 1��) ����
   - (3�� 1��) ������
   - (5�� 5��) ��̳�
   - (6�� 6��) ������
   - (8�� 15��) ������
   - (10�� 3��) ��õ��
   - (10�� 9��) �ѱ۳�
   - (12�� 25��) ũ��������
   
4. ���� ���� : �����, ���Ƶ���, ����	
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
			System.out.println("������ ���� ���� ���� ��ȣ �Դϴ�.");
			return true;
		}else if(carNum.charAt(carNum.length() -1) == '2' || carNum.charAt(carNum.length() -1) == '7') {
			System.out.println("ȭ���� ���� ���� ���� ��ȣ �Դϴ�.");
			return true;
		}else if(carNum.charAt(carNum.length() -1) == '3' || carNum.charAt(carNum.length() -1) == '8') {
			System.out.println("������ ���� ���� ���� ��ȣ �Դϴ�.");
			return true;
		}else if(carNum.charAt(carNum.length() -1) == '4' || carNum.charAt(carNum.length() -1) == '9') {
			System.out.println("����� ���� ���� ���� ��ȣ �Դϴ�.");
			return true;
		}else if(carNum.charAt(carNum.length() -1) == '5' || carNum.charAt(carNum.length() -1) == '0') {
			System.out.println("�ݿ��� ���� ���� ���� ��ȣ �Դϴ�.");
			return true;
		}

		return false;
	}
	
	public boolean carCheck() {
		String[] car = {"�����","���Ƶ���","����"};
		boolean boo = false;
		String message = "���� 5���� ���� ������ �ƴϹǷ� ���� �Ұ��մϴ�.";
		
		for(int i=0; i<car.length; ++i) {
			if(carType.equals(car[i])) {
				boo = true;
				message = "����5���� ���� �����̹Ƿ� ���� �����մϴ�.";
			}
		}
		System.out.println(message);
		return boo;
	}
	
	public boolean holidayCheck() {
		String[] hol = {"1/1","3/1","5/5","6/6","8/15","10/3","10/9","12/25"};
		boolean boo = false;
		String message = "�������� �ƴմϴ�.";
		
		for(int i=0; i<hol.length; ++i) {
			if(holiday.equals(hol[i])) {
				boo = true;
				message = "�������� ��� ������ ���� �����մϴ�";
			}
		}
		System.out.println(message);
		return boo;
	}
	
	public static void main(String[] args) {
		 ParkingSystem ps = new ParkingSystem("3/1","����","4298");
		 System.out.println(ps.endNumCheck());
		 System.out.println(ps.holidayCheck());
		 System.out.println(ps.carCheck());
		 
		 
		 
	}
	
}









