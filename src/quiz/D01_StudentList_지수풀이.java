package quiz;

import java.util.ArrayList;
import java.util.Random;

public class D01_StudentList_����Ǯ�� {
	/*
	 	�л� Ŭ������ ��ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ�����
	 	
	 	1. �� �л��� ������ �������� ����
	 	2. ������ ��/��/��
	 	3. 30���� ��� ������ ���
	 	4. 30�� �� ���� ������ ���� �л��� 	������ ���
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
			System.out.println(i + "�� �л���  ���� : " + kor + "  ���� : " + eng + "  ���� : " + math);
			sum = kor + eng + math;
			average = sum / 3;
			System.out.println("��� ���� : " + average);
		
		}

	}
}
