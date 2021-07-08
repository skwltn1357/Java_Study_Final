package quiz;

import java.util.ArrayList;
import java.util.Random;

public class D01_StudentList_지수풀이 {
	/*
	 	학생 클래스를 요소로 갖는 ArrayList를 생성하고 학생을 30명 추가해보세요
	 	
	 	1. 각 학생의 점수는 랜덤으로 설정
	 	2. 과목은 국/영/수
	 	3. 30명의 평균 점수를 출력
	 	4. 30명 중 가장 점수가 높은 학생의 	성적을 출력
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> students =  new ArrayList<>(); 

		double average = 0;
		int sum;
		int max_grade = 0;
		
		for(int i = 1; i < 31; ++i) {
			students.add(i);
			int kor = (int)(Math.random() * 101);
			int eng = (int)(Math.random() * 101);
			int math =(int)(Math.random() * 101);
			System.out.println(i + "번 학생의  국어 : " + kor + "  영어 : " + eng + "  수학 : " + math);
			sum = kor + eng + math;
			average = sum / 3;
			System.out.println("평균 점수 : " + average);
		
		}

	}
}
