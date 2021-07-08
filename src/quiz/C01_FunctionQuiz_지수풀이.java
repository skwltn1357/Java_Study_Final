package quiz;

public class C01_FunctionQuiz_����Ǯ�� {
	/*
	 	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	 	
	 	1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	
	 	2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	
	 	3. ���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	 	
	 	4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ�
	 	
	 	5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	
	 	6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	 		factorial: (n)*(n-1)*(n-2)...3*2*1
	 */
	public static void main(String[] args) {
		
	System.out.println(Alphabet("abc")); //1��
	
	System.out.println(Number(14));		//2��
	
	System.out.println(Return(6));		//3��
	
		
	}
	//1��
	public static boolean Alphabet(String str) {
		
		boolean alpha = true;
		
		for(int i = 0; i < str.length(); ++i) {
			
			char ch = str.charAt(i);
			
			if(!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
				alpha = false;
				break;
			}
		}
		return alpha;		
		
	}
	
	//2��		
	public static boolean Number(int num) {
		
		boolean multiple = false;
		
		for(int i = 0; i < num; ++i) {
			if(num % 3 == 0) {
				multiple = true;
				break;
			}
		}
		return multiple;
		
	}
	
	//3��
	public static String Return(int num) {
		for(int i = 0; i < num; ++i) {
			if(num % 2 == 0) {
				return "¦���Դϴ�";
			}else if(num % 2 == 1) {
				return "Ȧ���Դϴ�";
			}
		}
		return null;
		
		
		
		
	}
		
	}


