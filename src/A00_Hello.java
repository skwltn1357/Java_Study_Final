/* <����Ű>
 * - Alt + ����Ű : �� �̵�
 * - Home : ���� �� ������ �̵�
 * - End : ���� �� �ڷ� �̵�
 * - Shift + Home : ���� Ŀ�� ��ġ���� ���� �� �ձ��� �������
 * - Shift + End : ���� Ŀ�� ��ġ���� ���� �� �ڱ��� �������
 * - Ctrl + M : ���� ȭ�� �ִ�/�ּ�ȭ
 * 
 * <Windows ����Ű>
 * - win + Shift + s : ĸ��
 * - win + . : �̸�Ƽ��
 * - win + D : ����ȭ��
 * - win + E : Ž����
 * - win + ����Ű : ȭ�� ���� ����
 * 
 */

// �� public class�� �̸��� �ݵ�� ���ϸ�� ���ƾ� �Ѵ�
public class A00_Hello {
	//������ ������ ���� ���콺 Ŀ���� �ΰ� F2�� ������ �ذ�å�� �� �� �ִ�.
	
	/*
	 * # main() �Լ�
	 * - ���α׷��� ���� ����
	 * - ����ڰ� ���α׷��� �����ϸ� ���� ���� main() �Լ��� ã�Ƽ� �����Ѵ�.
	 * - main() �Լ��� ������ �߰�ȣ{}�� �����ȴ�
	 * - �߰�ȣ�� ������ �˱� ���� �ϱ� ���� (Tab)�� ����Ѵ�
	 * - main() �Լ��� ������ ���α׷��� ����ȴ�
	 * 
	 * 
	 * # �Լ���?
	 * - � �ܾ� �ڿ� ()�� �ִ� ���� ��� �Լ���� �θ���.
	 */
	
	
	public static void main(String[] args) {
		//���α׷��� ����
		
		System.out.println("Hello, world!");
		
		
		//''�� ����ϴ� ���� Ÿ�� �����ʹ� �����δ� ���ڰ��� ������ �ִ�.
		System.out.println('A');
		System.out.println((int)'A');	// 'A'�� ���ڷ� ǥ���϶�� ��
		System.out.println(66);			// 66�� ���ڷ� ǥ���϶�� ��
		System.out.println((char)66);
		
		//'D'�� 'A'���� �󸶳� �ڿ� �ִ� �������� �� �� ����
		System.out.println('D' - 'A');
		
		// ������ ���ڸ� ����ϸ� �⺻�����δ� ������ �ȴ�.
		System.out.println('A' + 3);
		
		System.out.println((char)('A' + 0));	//A
		System.out.println((char)('A' + 1));	//B
		System.out.println((char)('A' + 2));	//C
		System.out.println((char)('A' + 3));	//D
		System.out.println((char)('A' + 4));	//E
		
		System.out.println((int)'��');	//���ڿ��� ���° ��
		System.out.println((int)'��');
		
		// ""�� ����ϴ� ���ڿ� Ÿ�԰� �ٸ� Ÿ���� ���ϸ� ����� �ϴ� ���� �ƴ϶� �̾���δ�
		System.out.println("10" + 10);
		
		// ���� + �Ǽ��� ����� �Ǽ���
		System.out.println(3.14 + 10);
		
		// �Ǽ��� ������ ��ȯ�ϸ� �Ҽ��� �Ʒ��� �����Ѵ�
		System.out.println((int)33.999999);
		System.out.println((int)3.5 + 3.5);
	}

}
