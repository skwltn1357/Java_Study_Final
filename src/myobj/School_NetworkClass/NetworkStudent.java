package myobj.School_NetworkClass;

public class NetworkStudent extends Student {
//��Ʈ��ũ�� �л����� ������  ����, ����, ������, ��Ʈ��ũ, CCNA ������ �ִ�.
	int ln;
	int nw;
	int ca;
	
	public NetworkStudent() {
		super();
		ln = generateRandomScore();
		nw = generateRandomScore();
		ca = generateRandomScore();
	}
	
	int getSum() {		//����
		return (kor + eng + ln + nw + ca);
	}
	double getAverage(){	//���
		return (kor + eng + ln + nw + ca) / 5.0;
	}
	
	@Override
	public void printGradeCard() {
		System.out.println();
		System.out.println(" �̸� : "+ name + " ���� : "+ getSum() + " ��� : " +getAverage());
		System.out.println(" ����\t����\t������\t��Ʈ��ũ\tCCNA");
		System.out.println("----------------------------------------------");
		System.out.printf(" %d\t%d\t%d\t%d\t%d\n", kor,eng,ln,nw,ca);
		
	
		
	}

}
