package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E01_SaveGame {
	/*
	 	간단한 컴퓨터와의 가위바위보 게임을 하나 만들고, 전적을 파일에 저장해보세요
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

		String[] ran = {"가위","바위","보"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위 or 바위 or 보 선택 : ");
		String user = sc.nextLine();
		
		int com = (int)(Math.random() * 3);
		System.out.println("컴퓨터 : " + ran[com]);
		
		while(user.equals("가위")) {
			if(com == 0) {
				System.out.println("비겼습니다.");
				return "무승부";
			}else if(com == 1) {
				System.out.println("당신이 졌습니다. 컴퓨터 승!");
				return "실패";
			}else if(com == 2) {
				System.out.println("당신이 이겼습니다!");
				return "승리";
			}else {
				System.out.println("가위 or 바위 or 보 중에서 고르세요.");
			}
		}
		while(user.equals("바위")) {
			if(com == 0) {
				System.out.println("당신이 이겼습니다!");
				return "승리";
			}else if(com == 1) {
				System.out.println("비겼습니다");
				return "무승부";
			}else if(com == 2) {
				System.out.println("당신이 졌습니다. 컴퓨터 승!");
				return "실패";
			}else {
				System.out.println("가위 or 바위 or 보 중에서 고르세요.");
			}
		}
		while(user.equals("보")) {
			if(com == 0) {
				System.out.println("당신이 졌습니다. 컴퓨터 승!");
				return "실패";
			}else if(com == 1) {
				System.out.println("당신이 이겼습니다!");
				return "승리";
			}else if(com == 2) {
				System.out.println("비겼습니다");
				return "무승부";
			}else {
				System.out.println("가위 or 바위 or 보 중에서 고르세요.");
			}
		}
		return user;
		
	}

	
	
	}

	
