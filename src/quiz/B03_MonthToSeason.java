package quiz;

import java.util.Scanner;

public class B03_MonthToSeason {
	/*
	 	����ڷκ��� ���� �Է¹����� �ش��ϴ� ������ ����غ�����
	 	(switch-case���� ����� ��)
	 */
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.print("�� �Է� : ");
	int month = sc.nextInt();
	
//	String spring = "��";
//	String summer = "����";
//	String fall = "����";
//	String winter = "�ܿ�";
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
//		System.out.println("1~12�� �߿��� �Է��ϼ���.");
//	}
	
	String season;
	
	switch(month) {
	case 12: case 1: case 2:
		season = "�ܿ�";
		break;
	case 3: case 4: case 5:
		season = "��";
		break;
	case 6: case 7: case 8:
		season = "����";
		break;
	case 9: case 10: case 11:
		season = "����";
		break;
	default:
		season = "����";
		break;
	}
	
	if(month < 1 || month > 12) {
		System.out.println("�߸��� �����Դϴ�");
	}else {
	System.out.printf("%d���� %s�Դϴ�.\n",month,season);
	}
	}

}
