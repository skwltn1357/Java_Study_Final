import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import quiz.D01_Student;

public class D07_HashMap {
	
	/*
	 	# Map
	 	
	 	 - �����͸� Kew��  Value�� �� ������ �����ϴ� ����� �ڷᱸ�� 
	 	 - Key ���� ���� Value�� ������ �� �ִ�
	 	 - Key�� �ߺ��� ������� �ʴ´�
	 */
	
	public static void main(String[] args) {
		// ù ��° ���ʸ��� key�� Ÿ���̰�, �� ��° ���׸��� Value�� Ÿ���̴�
		HashMap<String, String> addr = new HashMap<>();
		
		// Map.put(kew, value)
		// - �ʿ� �����͸� �߰��Ѵ� 
		// Map.putAll(Map)
		// - �ٸ� ���� �����͸� ��� �߰��Ѵ�
		// Map.putIfAbsent(key, value)
		// - �ش� Ű���� ��������� �ְ�, ���� ������ �����ش�. ���� ��� null�� �����Ѵ�
		addr.put("�츮��","����Ư���� ���۱� �뷮��1�� ...");
		addr.put("����","����Ư���� ������ ������� 84�� 16");
		addr.put("����2","����Ư���� ���α� ����3��");
		
		System.out.println(addr.putIfAbsent("�츮��", "���� �� �ִ�"));
		System.out.println(addr.putIfAbsent("�츮��2", "���� �� �ִ�"));
		
		// �̹� �����ϴ� Ű�� ���� �߰��ϸ� value�� �����Ѵ�
		addr.put("����", "������");
		
		System.out.println(addr.get("�츮��"));
		System.out.println(addr.get("����"));
		System.out.println(addr.get("����2"));
		System.out.println(addr.get("�츮��2"));
		
		// ���� ������ Ÿ�Ե� ����� �� �ִ�
		HashMap<Integer, D01_Student> students = new HashMap<>();
		
		students.put(1, new D01_Student());
		students.put(2, new D01_Student());
		
		System.out.println(students.get(1));
		System.out.println(students.get(2));
		
		// �������� Ÿ���� ����� �� �ִ�
		HashMap<String, Object> info = new HashMap<>();
		
		info.put("�̸�","ȫ�浿");
		info.put("����", 23);
		info.put("��ȭ��ȣ", "010-1234-1234");
		info.put("�����ϴ� ��", new String[] {"��ȭ","�","�ܹ���"});
		info.put("ģ�� ���", new ArrayList<>());
		
		// �������� : ģ�� ��Ͽ� �����͸� 3���� �߰��غ�����
		ArrayList<String> friends = (ArrayList<String>) info.get("ģ�� ���");		
		((ArrayList<String>) info.get("ģ�� ���")).add("ö��");
		friends.add("����");
		friends.add("�μ�");
		
		System.out.println(info.get("ģ�� ���"));
		
		
		/*
		 	# �ݺ������� MapŸ�� Ȱ���ϱ�
		 	
		 	 - Map.keySet() : key��� �̷���� Set�� ��ȯ�Ѵ�
		 	 - Map.values() : ����� �̷���� Collection�� ��ȯ�Ѵ�
		 	 - Map.entrySet() : Extry<key, value>�� �̷���� Set�� ��ȯ�Ѵ�
		 */
		
		System.out.println(info.keySet());	
		for(String key : info.keySet()) {
			System.out.println("�ݺ������� ���� ���� : " + info.get(key));
		}
		System.out.println("---------------------------------------------");
		
		System.out.println(info.values());
		List value_list = new ArrayList<>(info.values());
		System.out.println(value_list);
		
		for(Object value : info.values()) {
			System.out.println(value);
		}
		
		for (Entry<String, Object > entry : info.entrySet()) {
			System.out.println(entry.getKey() + "\t: ");
			System.out.println(entry.getValue());
		}
	}
	
}






























