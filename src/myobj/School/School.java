package myobj.School;
/*
1. 각 반의 정원은 30명이다.

2-1. 프로그래밍 반 학생들은 각자의 국어, 영어, 수학, 프로그래밍언어 , 알고리즘, 자료구조 점수가 있다.

2-2. 네트워크반 학생들은 각자의  국어, 영어, 리눅스, 네트워크, CCNA 점수가 있다.

2-3. 머신러닝 반 학생들은 각자의 국어, 영어, 수학, 통계학, 프로그래밍언어 점수가 있다.

3. 모든 학생의 과목별 점수와 이름을 랜덤으로 생성한다.
	학번은 중복없이 순차적으로 생성되어야 한다. (또는 중복없이 랜덤도 가능)
	
4. 성적표 메서드를 통해 각 학생의 이름/총점/평균점수를 볼 수 있어야 한다.
*/
public class School {
	public static void main(String[] args) {
		
		ProgrammingStudent pro = new ProgrammingStudent();
		
		System.out.println(pro.getName());
		
		pro.printGradeCard();
	}
}
