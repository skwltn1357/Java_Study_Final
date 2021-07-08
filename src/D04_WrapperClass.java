
public final class D04_WrapperClass {
	/*
	 	# Wrapper Class
	 	
	 	  - �⺻ Ÿ�Ե��� ������ Ÿ������ ���γ��� Ŭ������
	 	  -	�� �⺻ Ÿ�Ե鿡 ���� ������ ��ɵ��� ���ִ�
	 	 
	 	 # �⺻�� Ÿ�Ե��� �̸�
	 	 
	 	  - byte, short, char, int, long, float, double, boolean
	 	  
	 	 # �⺻���� ���� ������ Ÿ���� �̸�
	 	  
	 	  - Byte, Short, Character, Integer, Long, Float, Double, Boolean
	 */
	
	public static void main(String[] args) {
		/*
		 	# parsing		 	
		 	 - ���ڿ��� ���ϴ� Ÿ������ ��ȯ��Ű�� ��
		 	 - �� Ÿ���� Wrapper Ŭ������ static �޼���μ� �����Ѵ�
		 */
		
		// ���ڿ��� ���ڷ� �ٲ� �� �ִ�
		int num = Integer.parseInt("123");
		System.out.println(num);
		
		double d = Double.parseDouble("123.1234");
		System.out.println(d);
		
		
		/*
		 	# toString
		 	 - �� Ÿ���� ���� ���ڿ��� ��ȯ��Ű�� ���
		 	 - �������̵� ������ toString���� �ٸ���
		 	 - ���ϴ� ����(radix)�� ���ڿ��� ��ȯ�� �� �ִ� ��ɵ� �ִ�
		 */
		String result = Integer.toString(89999999);
		System.out.println(result);
		
		// * ���α׷��ӵ鿡�Դ� 2����, 8����, 16������ �߿��ϴ�
		for (int radix = 2; radix <= 16; ++radix) {
			result = Integer.toString(8999999,radix);
			System.out.println(radix + "���� : " + result);
		}
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		// Character���� ���ڸ� ���ϰ� �ٷ� �� �ִ� static �޼������ ����.
		Character.isLowerCase('a');
		Character.isDigit('9');
		
		
	}
}

















