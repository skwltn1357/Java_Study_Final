package quiz;

import java.util.Random;

public class D01_Student implements Comparable<D01_Student> {
	public int snum;	//학생 번호
	public int kor;
	public int eng;
	public int math;
	public double avg;
	
	public static double best_avg = 0;
	public static int best_avg_snum = 0;
	
	final private int MAX_SCORE = 100;
	final private int NUM_OF_SUBJECT = 3;
	
	private static int curr_snum = 1000;
	private static Random ran = new Random();
	
	
	
	public D01_Student() {
		snum = curr_snum++;
		kor = ran.nextInt(MAX_SCORE + 1);
		eng = ran.nextInt(MAX_SCORE + 1);
		math = ran.nextInt(MAX_SCORE + 1);
		avg = (kor + eng + math) / (double) NUM_OF_SUBJECT;
		
		if(avg > best_avg) {
			best_avg = avg;
			best_avg_snum = snum;
		}
	}
	
	@Override
	public String toString() {
		return String.format("[%d]번 학생의 평균 점수는 %.2f 입니다.\n", snum, avg);
	}
	
	public int compareTo(D01_Student o) {
		return Double.compare(this.avg, o.avg) != 0 ?
				Double.compare(this.avg, o.avg) : Integer.compare(snum, o.snum);
	};
}

