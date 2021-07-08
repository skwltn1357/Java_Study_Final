package quiz;

import java.util.ArrayList;

public class D01_StudentList_선생님풀이 {
	/*
	 	학생 클래스를 요소로 갖는 ArrayList를 생성하고 학생을 30명 추가해보세요
	 	
	 	1. 각 학생의 점수는 랜덤으로 설정
	 	2. 과목은 국/영/수
	 	3. 30명의 평균 점수를 출력
	 	4. 30명 중 가장 점수가 높은 학생의 	성적을 출력
	 */
	
	public static void main(String[] args) {
		
		ArrayList<D01_Student> student_list = new ArrayList<>();
		
		for(int i = 0; i < 30; ++i) {
			student_list.add(new D01_Student());
		}
		
		for(D01_Student student : student_list) {
			System.out.println(student);
		}

		System.out.println("가장 높은 점수 : " + D01_Student.best_avg);
		System.out.println("가장 높은 점수인 학생의 학번 : " + D01_Student.best_avg_snum);
	}
}
