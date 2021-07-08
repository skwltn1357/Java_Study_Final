package myobj.School;

public class MuchineStudent extends Student {
//수학, 통계학, 프로그래밍언어
	
	int math;
	int st;
	int pl;
	
	public MuchineStudent() {
		super();
		math = generateRandomScore();
		st = generateRandomScore();
		pl = generateRandomScore();
	}
	
	int getSum() {
		return(kor + eng + math + st + pl);
	}
	
	double getAverage() {
		return(kor + eng + math + st + pl) / 5.0;
	}
	@Override
	public void printGradeCard() {
		// TODO Auto-generated method stub
		
	}
	
}
