package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E01_SaveGame {
	/*
	 	������ ��ǻ�Ϳ��� ���������� ������ �ϳ� �����, ������ ���Ͽ� �����غ�����
	 */
	
	public static void main(String[] args) {
		
			try {
				FileOutputStream game = new FileOutputStream("game.txt",true);
				
				game.write(Game().getBytes());
				
				game.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
		public static String Game(){

		String[] ran = {"����","����","��"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� or ���� or �� ���� : ");
		String user = sc.nextLine();
		
		int com = (int)(Math.random() * 3);
		System.out.println("��ǻ�� : " + ran[com]);
		
		while(user.equals("����")) {
			if(com == 0) {
				System.out.println("�����ϴ�.");
				return "���º�";
			}else if(com == 1) {
				System.out.println("����� �����ϴ�. ��ǻ�� ��!");
				return "����";
			}else if(com == 2) {
				System.out.println("����� �̰���ϴ�!");
				return "�¸�";
			}else {
				System.out.println("���� or ���� or �� �߿��� ������.");
			}
		}
		while(user.equals("����")) {
			if(com == 0) {
				System.out.println("����� �̰���ϴ�!");
				return "�¸�";
			}else if(com == 1) {
				System.out.println("�����ϴ�");
				return "���º�";
			}else if(com == 2) {
				System.out.println("����� �����ϴ�. ��ǻ�� ��!");
				return "����";
			}else {
				System.out.println("���� or ���� or �� �߿��� ������.");
			}
		}
		while(user.equals("��")) {
			if(com == 0) {
				System.out.println("����� �����ϴ�. ��ǻ�� ��!");
				return "����";
			}else if(com == 1) {
				System.out.println("����� �̰���ϴ�!");
				return "�¸�";
			}else if(com == 2) {
				System.out.println("�����ϴ�");
				return "���º�";
			}else {
				System.out.println("���� or ���� or �� �߿��� ������.");
			}
		}
		return user;
		
	}

	
	
	}

	
