package myobj.coffee;

/**
	# ������ ��ȣ
		1. �ѱ�
		2. �ݷҺ��
		3. �����
		4. ��Ƽ���Ǿ�
*/
public class Coffee {

	String name;
	Origin origin;
	
	public Coffee(String name, Origin origin) {
		this.name = name;
		this.origin = origin;
	}
	
	
	
	// �� Coffee Ŭ���� ����� �ڵ�
	public static void main(String[] args) {
		new Coffee("�Ƹ޸�ī��", Origin.BRAZILE);
		new Coffee("�Ƹ޸�ī��", Origin.SOUTH_KOREA);
	}
}
