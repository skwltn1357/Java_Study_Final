import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D05_Comparator {
	/*
	 	# Comparable
	 	
	 	 - 이 인터페이스를 구현한 클래스는 서로 크기가 비교 가능한 클래스가 된다
	 	 - 이 인터페이스를 구현한 클래스는 Collections의 정렬 기능을 이용할 수 있다
	 	 
	 	# Comperator
	 	 
	 	 - 이 인터페이스를 구현한 클래스는 비교의 기준으로 사용된다 
	 */
	
	public static void main(String[] args) {
		
		Snack s1 = new Snack("허니버터칩","롯데","허니버터맛",600,2000);
		Snack s2 = new Snack("프링글스","한화","양파맛",800,2000);
		Snack s3 = new Snack("칸쵸","롯데","초코",250,1000);
		Snack s4 = new Snack("홈런볼","LG생활건강","초코",359,1750);
		Snack s5 = new Snack("포스틱","KG","감자맛",700,1200);
		
		Snack s6 = new Snack("맛동산","해태","땅콩맛",500,1500);
		Snack s7 = new Snack("꼬북칩","오리온","인절미맛",500,1500);
		Snack s8 = new Snack("꼬깔콘","롯데제과","옥수수맛",500,1500);
		
		ArrayList<Snack> snacks = new ArrayList<>();
		Collections.addAll(snacks, s1, s2, s3, s4, s5, s6, s7, s8);
		System.out.println(snacks);
		
//		Collections.sort(snacks, new 과자진열대());
//		System.out.println(snacks);
//		
//		Collections.sort(snacks, new 과자분류기());
//		System.out.println(snacks);
//		
//		Collections.sort(snacks, new 과자분류기_내림차순());
//		System.out.println(snacks);
		
	}
}

class Snack implements Comparable<Snack> {
	String name;
	String company;
	String taste;
	int calorie;
	int price;
	
	public Snack(String name, String company, String taste, int calorie, int price) {
		this.name = name;
		this.company = company;
		this.taste = taste;
		this.calorie = calorie;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%s/%s/%s/%dkcal/%d원", name, company, taste, calorie, price);
	}

	@Override
	public int compareTo(Snack o) {
		if(this.price > o.price) {
			return 1;
		}else if(this.price < o.price) {
			return -1;
		}else {
			return this.name.compareTo(o.name);
		}
		
	}
}



class 과자분류기 implements Comparator<Snack> {

	@Override
	public int compare(Snack o1, Snack o2) {
		if(o1.calorie > o2.calorie) {
			return 1;
		}else if(o1.calorie < o2.calorie) {
			return -1;
		}else {
			return 0;
		}
	}
}

class 과자분류기_내림차순 implements Comparator<Snack> {

	@Override
	public int compare(Snack o1, Snack o2) {
		if(o1.calorie > o2.calorie) {
			return -1;
		}else if(o1.calorie < o2.calorie) {
			return 1;
		}else {
			return 0;
		}
	}
}

class 과자진열대 implements Comparator<Snack> {
	/*
	 	# compare 규칙
	 	-두 값의 자리를 바꾸고 싶으면 1을 리턴
	 	-두 값의 자리를 바꾸지 않고 싶으면 -1을 리턴
	 	-두 값이 서로 같은 값이라면 0을 리턴
	 */
	@Override
	public int compare(Snack o1, Snack o2) {
		if(o1.price > o2.price) {
			return 1;
		}else if(o1.price < o2.price) {
			return -1;
		}else {
			return 0;
		}
	}
	
}























