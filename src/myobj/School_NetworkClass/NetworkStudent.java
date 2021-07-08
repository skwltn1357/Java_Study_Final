package myobj.School_NetworkClass;

public class NetworkStudent extends Student {
//네트워크반 학생들은 각자의  국어, 영어, 리눅스, 네트워크, CCNA 점수가 있다.
	int ln;
	int nw;
	int ca;
	
	public NetworkStudent() {
		super();
		ln = generateRandomScore();
		nw = generateRandomScore();
		ca = generateRandomScore();
	}
	
	int getSum() {		//총합
		return (kor + eng + ln + nw + ca);
	}
	double getAverage(){	//평균
		return (kor + eng + ln + nw + ca) / 5.0;
	}
	
	@Override
	public void printGradeCard() {
		System.out.println();
		System.out.println(" 이름 : "+ name + " 총점 : "+ getSum() + " 평균 : " +getAverage());
		System.out.println(" 국어\t영어\t리눅스\t네트워크\tCCNA");
		System.out.println("----------------------------------------------");
		System.out.printf(" %d\t%d\t%d\t%d\t%d\n", kor,eng,ln,nw,ca);
		
	
		
	}

}
