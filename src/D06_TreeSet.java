import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

import quiz.D01_Student;



public class D06_TreeSet {
	
	/*
 		# TreeSet
 		
 		 - 순서가 있는 Set (순서가 없는 것은 Hash의 특징)
 		 - 중복은 허용하지 않는다 (Set의 특징)
 		 - 데이터를 추가할 때 값을 정렬해서 넣기 때문에 HashSet에 비해 저장 속도가 느리다
 		 - 미리 정렬이 되어있기 떄문에 정렬된 순서로 값을 꺼내기 편리한 Set이다
 		 - 해당 TreeSet 인스턴스에서 사용할 Comparator를 지정할 수 있다 
	 */
	
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);
		numbers.add(99);
		numbers.add(86);
		numbers.add(41);
		numbers.add(50);
		numbers.add(13);
		
		System.out.println(numbers);
		
		// TreeSet에 원하는 Comparator를 사용하기 (정수 내림차순)
		// (거꾸로 출력)
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				/*
				 	자리를 바꾸고 싶다면 양수 리턴
				 	자리를 바꾸기 싫으면 음수 리턴
				 	두 값이 같은 값이면 0 리턴
				 */
				
				return o2 - o1;
			}
		});
		
		numbers2.addAll(numbers);
		System.out.println(numbers2);
		
		// * TreeSet은 Set의 일부분을 리턴하는데에 특화된 기능이 많다
		SortedSet<Integer> head = numbers.headSet(44);	//44아래의 숫자들(머리)
		System.out.println(head);
		
		SortedSet<Integer> tail = numbers.tailSet(44); //44위의 숫자들(꼬리)
		System.out.println(tail);
		
		// 미리 정렬해놓은 방향과 반대 방향인 Set 인스턴스를 반환한다
		NavigableSet<Integer> desc = numbers.descendingSet();
		System.out.println(desc);
		
		
		
		System.out.println("first?" + numbers.first());	//첫번째 값
		System.out.println("last?" + numbers.last());	//마지막 값
		System.out.println("pollFirst? " + numbers.pollFirst()); //첫번째 값을 끄집어내고 리스트에서 삭제한다
		System.out.println(numbers);
		System.out.println("pollLast? " + numbers.pollLast()); //마지막 값을 끄집어내고 리스트에서 삭제한다
		System.out.println(numbers);	
		System.out.println("subSet(30,70)? " + numbers.subSet(30, 70));	// 부분집합 (30~70 사이의 수 를 보고싶다)
		
		
		// TreeSet은 익명이여서 다시는 볼 수 없을 줄 알았던 것을 다시 볼 수 있게 된다(재활용 가능)
		System.out.println(numbers.comparator());
		System.out.println(numbers2.comparator());
		
		TreeSet<Integer> nunber3 = new TreeSet<>(numbers2.comparator());
		
		List<Integer> list = new ArrayList<>(numbers);
		Collections.sort(list,numbers2.comparator());
		
		System.out.println("list : " + list);
		
		
		System.out.println("contains 41? " + numbers.contains(41));
		System.out.println("contains 42? " + list.contains(42));
		
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(41);

		// 아래의 코드가 true가 나오도록 null을 바꿔보세요 (3가지 이상)
		System.out.println(list.containsAll(numbers2.subSet(43, 41)));
		System.out.println(list.containsAll(list2));
		System.out.println(list.containsAll(list));
		
		// <Quiz>
		// 학생 인스턴스를 100개 만들고, TreeSet에 평균 점수 순으로 저장한 후 
		// 평균 점수가 50점 ~ 70점 사이인 학생이 모두 몇명인지 세어보세요
		
		TreeSet<D01_Student> stu_set = new TreeSet<>();
		
		for(int i = 0; i < 100; ++i) {
			stu_set.add(new D01_Student());
		}

		System.out.println(stu_set);
		System.out.println("학생은 총 " + stu_set.size() + "명 입니다.");
		
		D01_Student from = new D01_Student();
		D01_Student to = new D01_Student();
		
		from.avg = 50.0;
		to.avg = 70.0;
		
		System.out.println(stu_set.subSet(from, to));
	}
	
}




























