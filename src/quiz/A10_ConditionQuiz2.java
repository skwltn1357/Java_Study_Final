package quiz;

import java.util.Scanner;

public class A10_ConditionQuiz2 {
	public static void main(String[] args) {
		char a = 'q';
		char b = '\t';
		char c = '3';
		char d = 'A';
		char e = 'ÀÌ';
		
		
		System.out.println(a == 'q' || a =='Q');
		System.out.println((char)b != ' ' && b != '\t');
		System.out.println(c >= '0' && c <= '9');
		System.out.println(d >= 'a' && d <= 'z' || (d >= 'A' && d <= 'Z'));
		System.out.println(e >= '°¡' && e <= 'ÆR');
		System.out.println((char)0x3041);	//ÀÏº»¾î À¯´ÏÄÚµå 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("exit¸¦ ÀÔ·ÂÇÏ¸é true°¡ ³ª¿É´Ï´Ù >  ");
		String text = sc.nextLine();
		System.out.println(text.equals("exit"));
		

		
	}
}
