package myobj.School;

public class ProgrammingStudent extends Student {
	// ����, ���α׷��� ���, �˰���, �ڷᱸ�� ����
	int math;
	int pl;
	int al;
	int ds;
	
	public ProgrammingStudent() {	//�θ�Ŭ�������� ���
		super();
		math = generateRandomScore();
		pl = generateRandomScore();
		al = generateRandomScore();
		ds = generateRandomScore();
	}
	
	int getSum() {		//����
		return (kor + eng + math + pl + al + ds);
	}
	double getAverage(){	//���
		return (kor + eng + math + pl + al + ds) / 6.0;
	}
	
	@Override
	public void printGradeCard() {	//����ǥ
		System.out.println();
		System.out.println(" �̸� : " + name + "���� : " + getSum() + "��� : " + getAverage());
		System.out.println(" ����\t����\t����\tPL\tAL\tDS");
		System.out.println("----------------------------------------------");
		System.out.printf(" %d\t%d\t%d\t%d\t%d\t%d\n", kor,eng,math,pl,al,ds);
		
	}

}
