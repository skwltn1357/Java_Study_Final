
public class B08_While {
	/*
	 	# while
	 	- for���� ������ �ణ �ٸ� �ݺ���
	 	- �ʱⰪ�� �������� ��ġ�� ������ ���� �ʴ�
	 	- ()���� ������ ���� ���� {}���� ������ �ݺ��Ѵ�
	 	- �������� ��ġ�� ���� ���α׷� ������ �޶��� �� �����Ƿ� �����ؾ� �Ѵ�
	 */
	public static void main(String[] args) {
		
		// while���� ������ ��ġ�� ���� ����� �޶��� �� �ִ�
		int i = 0;
		
		while(i < 10) {
			System.out.println(++i);
			
		}
		// while�������� break�� continue�� ����� �� �ִ�
		i = 0;
		
		while(true) {
			System.out.println(++i);
			
			if(i == 140) {
				break;
			}
		}
	}

}
