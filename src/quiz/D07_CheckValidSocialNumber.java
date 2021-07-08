package quiz;

import java.util.Collections;
import java.util.HashSet;

public class D07_CheckValidSocialNumber {
	/*
	 	����ڰ� �ֹε�Ϲ�ȣ�� �Է��ϸ�
	 	�� �ֹε�Ϲ�ȣ�� ��ȿ���� �˻��ϴ� ���α׷��� ��������
	 	
	 	�Ǿ� 2�ڸ� ����
	 	�� �ڸ��� 01 ~ 12 �̳��� ����
	 	�� �ڸ��� 01 ~ 31 �̳��� ����
	 	(1,3,5,7,8,10,12���̸� 31 / 4,6,9,11���̸� 30/ 2���� �����϶� 29 �ƴϸ� 28)
	 	7��° �ڸ� '-'
	 	���ڸ� ���� ����
	 */
	
	private static HashSet<Integer> month30;
	private static HashSet<Integer> month31;
	private static HashSet<Integer> gender;
	
	static {
		month30 = new HashSet<>();
		month31 = new HashSet<>();
		
		Collections.addAll(month30, 4,6,9,11);
		Collections.addAll(month31, 1,3,5,7,8,10,12);
	}
	
	private static boolean valideGender(char gender) {
		return gender >= '1' && gender <= '4'; 	//�ֹι�ȣ 7��° �ڸ�
	}
	
	private static int calcYear(int year, char gender) {
		return gender < '3' ? year + 1900 : year + 2000;
	}
	
	public static boolean check(String sn) {
		char[] sn_arr = sn.toCharArray();
		
		if(!valideGender(sn_arr[7])) {
			System.out.println("[WARNING] ������ ������ �ֽ��ϴ�");
			return false;
		}
		
		int year = calcYear(
				Integer.parseInt("" + sn_arr[0] + sn_arr[1]),
				sn_arr[7]);
		int month = Integer.parseInt("" + sn_arr[2] + sn_arr[3]); //parseInt : ���ڿ��� ���ڷ� ��ȯ
		int date = Integer.parseInt("" + sn_arr[4] + sn_arr[5]);
		
		if(month30.contains(month) && (date < 1 || date > 30)) {
			System.out.println("[WARNING] ��¥�� ������ �ֽ��ϴ�");
			return false;
		}else if(month31.contains(month) && (date < 1 || date > 31)) {
			System.out.println("[WARNING] ��¥�� ������ �ֽ��ϴ�");
			return false;
		}else if(month == 2) {	//����
			boolean leapYear = (year % 400 == 0) || 
					(year % 4 == 0 && year % 100 != 0);
			
			System.out.println("year : " + year);
			
			if(leapYear && (date < 1 || date > 29)) {
				System.out.println("[WARNING] ������ 29�ϱ��� �Դϴ�");
				return false;
			}else if(!leapYear && (date < 1 || date > 28)){
				System.out.println("[WARNING] 2���� 28�ϱ��� �Դϴ�.");
				return false;
			}
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		if(check("000229-3234567")) {
			System.out.println("�ùٸ� �ֹι�ȣ�Դϴ�.");
		}else {
			System.out.println("�߸��� �ֹι�ȣ�Դϴ�.");
		}
	}


}

