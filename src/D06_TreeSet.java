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
 		
 		 - ������ �ִ� Set (������ ���� ���� Hash�� Ư¡)
 		 - �ߺ��� ������� �ʴ´� (Set�� Ư¡)
 		 - �����͸� �߰��� �� ���� �����ؼ� �ֱ� ������ HashSet�� ���� ���� �ӵ��� ������
 		 - �̸� ������ �Ǿ��ֱ� ������ ���ĵ� ������ ���� ������ ���� Set�̴�
 		 - �ش� TreeSet �ν��Ͻ����� ����� Comparator�� ������ �� �ִ� 
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
		
		// TreeSet�� ���ϴ� Comparator�� ����ϱ� (���� ��������)
		// (�Ųٷ� ���)
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				/*
				 	�ڸ��� �ٲٰ� �ʹٸ� ��� ����
				 	�ڸ��� �ٲٱ� ������ ���� ����
				 	�� ���� ���� ���̸� 0 ����
				 */
				
				return o2 - o1;
			}
		});
		
		numbers2.addAll(numbers);
		System.out.println(numbers2);
		
		// * TreeSet�� Set�� �Ϻκ��� �����ϴµ��� Ưȭ�� ����� ����
		SortedSet<Integer> head = numbers.headSet(44);	//44�Ʒ��� ���ڵ�(�Ӹ�)
		System.out.println(head);
		
		SortedSet<Integer> tail = numbers.tailSet(44); //44���� ���ڵ�(����)
		System.out.println(tail);
		
		// �̸� �����س��� ����� �ݴ� ������ Set �ν��Ͻ��� ��ȯ�Ѵ�
		NavigableSet<Integer> desc = numbers.descendingSet();
		System.out.println(desc);
		
		
		
		System.out.println("first?" + numbers.first());	//ù��° ��
		System.out.println("last?" + numbers.last());	//������ ��
		System.out.println("pollFirst? " + numbers.pollFirst()); //ù��° ���� ������� ����Ʈ���� �����Ѵ�
		System.out.println(numbers);
		System.out.println("pollLast? " + numbers.pollLast()); //������ ���� ������� ����Ʈ���� �����Ѵ�
		System.out.println(numbers);	
		System.out.println("subSet(30,70)? " + numbers.subSet(30, 70));	// �κ����� (30~70 ������ �� �� ����ʹ�)
		
		
		// TreeSet�� �͸��̿��� �ٽô� �� �� ���� �� �˾Ҵ� ���� �ٽ� �� �� �ְ� �ȴ�(��Ȱ�� ����)
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

		// �Ʒ��� �ڵ尡 true�� �������� null�� �ٲ㺸���� (3���� �̻�)
		System.out.println(list.containsAll(numbers2.subSet(43, 41)));
		System.out.println(list.containsAll(list2));
		System.out.println(list.containsAll(list));
		
		// <Quiz>
		// �л� �ν��Ͻ��� 100�� �����, TreeSet�� ��� ���� ������ ������ �� 
		// ��� ������ 50�� ~ 70�� ������ �л��� ��� ������� �������
		
		TreeSet<D01_Student> stu_set = new TreeSet<>();
		
		for(int i = 0; i < 100; ++i) {
			stu_set.add(new D01_Student());
		}

		System.out.println(stu_set);
		System.out.println("�л��� �� " + stu_set.size() + "�� �Դϴ�.");
		
		D01_Student from = new D01_Student();
		D01_Student to = new D01_Student();
		
		from.avg = 50.0;
		to.avg = 70.0;
		
		System.out.println(stu_set.subSet(from, to));
	}
	
}




























