package myobj.School;

public class ProgrammingStudent extends Student {
	// 수학, 프로그래밍 언어, 알고리즘, 자료구조 점수
	int math;
	int pl;
	int al;
	int ds;
	
	public ProgrammingStudent() {	//부모클래스에서 상속
		super();
		math = generateRandomScore();
		pl = generateRandomScore();
		al = generateRandomScore();
		ds = generateRandomScore();
	}
	
	int getSum() {		//총합
		return (kor + eng + math + pl + al + ds);
	}
	double getAverage(){	//평균
		return (kor + eng + math + pl + al + ds) / 6.0;
	}
	
	@Override
	public void printGradeCard() {	//성적표
		System.out.println();
		System.out.println(" 이름 : " + name + "총점 : " + getSum() + "평균 : " + getAverage());
		System.out.println(" 국어\t영어\t수학\tPL\tAL\tDS");
		System.out.println("----------------------------------------------");
		System.out.printf(" %d\t%d\t%d\t%d\t%d\t%d\n", kor,eng,math,pl,al,ds);
		
	}

}
