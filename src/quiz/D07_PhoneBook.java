package quiz;
import java.util.Comparator;
/*
 	# HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����

 	1. phonebook���� �׷�/��ȭ��ȣ/������ ������ �� �ִ�
 	2. �׷���� Ű������ ������ �ش� �׷쿡 �ش��ϴ� HashMap�� ���� �� �ִ�
 	3. ���� HashMap�� ��ȭ��ȣ�� ������ �� ����� ������ ���� �� �ִ�
 	
 	# �����ؾ� �� �޼���
 	1. ���ο� �׷��� �߰��ϴ� �޼���
 	2. �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
 	3. �̸� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
 	4. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �޼���
 	5. ��ϵ� ��� ��ȣ�� ������ �׸� �������� ����/������������ �����ִ� �޼���
 	   (�ƹ��͵� �������� ���� �� �⺻���� ���)
 	
 */
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class D07_PhoneBook{
	
	private static Class[] comparators = { AgeComparator.class, PhoneComparator.class };
	
	// 5�� ���� : ���� �������� �ϰڴ�
	private class AgeComparator implements Comparator<Info> {	
		int ordering;
		
		public AgeComparator(int ordering) {
			this.ordering = ordering;
		}
		
		@Override
		public int compare(Info o1, Info o2) {
			return ordering *  Integer.compare(o1.age, o2.age) == 0?
					o1.phoneNumber.compareTo(o2.phoneNumber) : Integer.compare(o1.age, o2.age);
		}
	}
	
	// 5�� ��ȭ��ȣ ����
	private class PhoneComparator implements Comparator<Info>{	
		int ordering;
		
		public PhoneComparator(int ordering) {
			this.ordering = ordering;
		}
		@Override
		public int compare(Info o1, Info o2) {
			return ordering * o1.phoneNumber.compareTo(o2.phoneNumber);
		}
		
	}
	
	
	public static class Info implements Comparable<Info>{
		String name;
		String phoneNumber;
		String address;
		String socialNumber;	//�ֹε�Ϲ�ȣ
		int age;
		
		public Info() {}
		
		public Info(String name, int age, String phoneNumber) {
			this.name = name;
			this.age = age;
			this.phoneNumber = phoneNumber;
		}
		
		@Override
		public String toString() {
			return String.format("%s,%d", name, age);
		}

		@Override	//5�� Comparable<Info>
		public int compareTo(Info o) {
			return name.compareTo(o.name) == 0 ? 
					phoneNumber.compareTo(o.phoneNumber) : name.compareTo(o.name);
		}
	}

	
	// 		  �׷��			��ȭ��ȣ	����
	HashMap<String, HashMap<String, Info>> phonebook;
	
	public D07_PhoneBook() {
		phonebook = new HashMap<>();
	}
	
	// 1�� ����
	public boolean addGroup(String groupName) {	
		if(phonebook.containsKey(groupName)) {
			System.out.println("�̹� ���� �̸��� �׷��� �����մϴ�.");
			return false;
		}else {
			phonebook.put(groupName, new HashMap<>());
			System.out.printf("�� �׷� \"%s\"�� �߰��Ǿ����ϴ�.\n",groupName);
			return true;
		}
	}
	
	// 2�� ����
	public void addInfo(String groupName, Info info) {	
		HashMap<String, Info> group = phonebook.putIfAbsent(groupName, new HashMap<>());	
		if(group == null) {
		   group = phonebook.get(groupName);
		}
		group.put(info.phoneNumber, info);
	}
	
	// 3�� ����
	public void searchByName(String name) {	
		System.out.println("--- �̸� �˻� : \"" + name + "\"�� ����Դϴ�. --" );
		for(String groupName : phonebook.keySet()) {
			HashMap<String, Info> group = phonebook.get(groupName);
			
			for(Entry<String, Info> entry : group.entrySet()) {
				if(entry.getValue().name.contains(name)) {
					// ex) "Hello".contains("Hell"); // Hollo �ȿ� Hell�� ���ԵǾ��ִ��� Ȯ�� �� �� ����
					System.out.println("[" + groupName + "]" + entry.getValue() + "/" + entry.getKey());
				}		
			}
		}
	}
	
	// 4�� ����
	public void searchByPhoneNumber(String numberFrag) {	
		System.out.println("--- ��ȣ �˻� : \"" + numberFrag + "\"�� ����Դϴ�. --" );
		for(String groupName : phonebook.keySet()) {
			HashMap<String, Info> group = phonebook.get(groupName);
			
			for(Entry<String, Info> entry : group.entrySet()) {
				if(entry.getValue().phoneNumber.replace("-","").contains(numberFrag)) {	//replace -> "-"�� ������ ���ְڴ�
					System.out.println("[" + groupName + "]" + entry.getValue() + "/" + entry.getKey());
				}
			}
		}
	}
	
	// 5�� ����
	public void show() {
		TreeSet<Info> info_set = new TreeSet<>();
		
		for(HashMap<String, Info> group : phonebook.values()) {
			info_set.addAll(group.values());
		}
		System.out.println(info_set);
	}
	
	// 5�� ���̼����� ����
	public void show(int column, boolean asc) {
		//String searchColumn = Info.class.getDeclaredFields()[column].getName();	// coulmn�� �ִ� �迭�� �����ٰ� ���ڴ�
		int ordering = asc ? 1 : -1;
		
		Comparator<Info> comparator = null;
		try {
			comparator = (Comparator<Info>) comparators[column]
					.getDeclaredConstructors()[0]
					.newInstance(this, ordering);
			System.out.println(comparator);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		TreeSet<Info> info_set = new TreeSet<>(comparator);
		
		for(HashMap<String, Info> group : phonebook.values()) {
			info_set.addAll(group.values());
		}
		System.out.println(info_set);
	}
	
	
	public static void main(String[] args) {
		D07_PhoneBook phone = new D07_PhoneBook();
		
		//1��
		phone.addGroup("ģ��");	
		phone.addGroup("ģ��");
		
		//2��
		phone.addInfo("ģ��", new Info("����", 15, "010-2222-2223"));	
		phone.addInfo("ģ��", new Info("�μ�", 13, "010-2222-2234"));
		phone.addInfo("�б�", new Info("����", 18, "010-1234-1234"));
		phone.addInfo("�б�", new Info("����", 21, "010-1111-1111"));
		phone.addInfo("�б�", new Info("���", 25, "010-1111-1112"));
		phone.addInfo("�б�", new Info("���", 44, "010-1233-1122"));
		
		//3��
		phone.searchByName("��");
		
		//4��
		phone.searchByPhoneNumber("1111");
		
		//5��
		phone.show();	//�̸�������
		phone.show(0,true); //���̼����� (�����)
	
		
	}
	
}


















