package quiz;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.graalvm.compiler.word.Word;

public class E05_HackTool {
	/*
	 	우리가 사용한 암호 방식은 키 값이 25개밖에 없는 허접한 암호화 방식입니다.
	 	
	 	목표 파일의 맨 앞부분 10줄을 1 ~ 25의 키로 모두 복호화해서 콘솔에 출력해보세요.
	 */
	
	// E05_HackTool 불러오기 -> 1
	// 10줄 해석 결과랑 영어사전 비교 -> 
	// 단어를 어떻게 나눌까?? 2
	// 단어인지 검사하는 클래스를 만든다 
	// 단어인지 검사하는 클래스안에서 영어사전을 불러온다
	// 영어사전을 배열안에 넣는다 
	// bruteforce 함수에서 영단어검사 함수를 불러와 영어사전단어에 포함되어있는지 체크해준다
	// 체크한 단어를 출력하거나 갯수를 세서 콘솔에 출력한다 
	
//	public static void checkWords(String word, String[] words){
//		
//		for(int i=0; i<word.length(); ++i) {
//			
//			char ch = word.charAt(i);
//			
//			if(!words.equals(ch)){
//				boolean contain = false;
//				break;
//			}else {
//				boolean contain = true;
//				break;
//			}
//		}
//	}
	
	public static void main(String[] args) {
		bruteforce("files/frankenstein_encrypted.txt");
	}
	
	public static void bruteforce(String path) {
		ArrayList<String> lines = new ArrayList<>();
		File target = new File(path);
		
		try(
			FileReader fin = new FileReader(target);
			BufferedReader in = new BufferedReader(fin);
		) {
			// 10번 또는 파일이 끝날때까지 반복
			String line;
			for(int i=0; i<10 && (line = in.readLine()) != null; ++i) {
				// 줄이 비어있거나 문자가 5개도 안되는 줄은 안본걸로 치겠다
				if(line.trim().equals("") || line.length() < 5) {
					--i;
				}else {
					lines.add(line);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		String word = "";
		
		for(int key = 1; key < 26; ++key) {
			System.out.printf("----- Key: %d -----------------------------\n", key);
			for (String line : lines) {
				for(char ch : line.toCharArray()) {	//한글자씩 떼어옴
					if(Character.isUpperCase(ch)) {
						ch = (char)(ch - key < 'A' ? ch - key + 26 : ch - key); 
					}else if(Character.isLowerCase(ch)) {
						ch = (char)(ch - key < 'a' ? ch - key + 26 : ch - key); 
					}
					System.out.print(ch);
					word += ch;
					String[] words = word.split(" ");
					
					for(int i=0; i<word.length(); ++i) {
						
						if(!words.equals(word)){
							boolean contain = false;
							System.out.println("단어 x");
							break;
						}else {
							boolean contain = true;
							System.out.println("단어 o");
						}
					}
					
				}
				System.out.println();
				
				
	

			}
			System.out.println();
			
			System.out.println("Press 'Enter' to continue...");
			String cmd = sc.nextLine();
			
			if(cmd.toLowerCase().equals("d")) {
				System.out.println("전체 파일 복호화를 진행합니다..");
				break;
			}
		}
		
		System.out.println("프로그램 끝");
		
	}
	
	
}
