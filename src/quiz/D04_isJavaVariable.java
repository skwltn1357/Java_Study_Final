package quiz;

import java.util.Scanner;

public class D04_isJavaVariable {
	/*
	 	����ڷκ��� ���ڿ��� �Է¹����� �ش� ���ڿ��� �ڹ��� �����ν� ���� �� �ִ���
	 	�˻��ϴ� �޼��带 ����� �׽�Ʈ�غ�����
	 	
	 	ù��° ���ڴ� ���� or Ư�����ڸ� ���� (����x), ����x, ���ڴ� ù��°�� �ƴϸ� �� ���� �ȴ�
	 */
	
	public static void main(String[] args) {
		String str = "JAva123";

	}
	
	public static boolean check(char[] str) {
		// Character.isJavaIdentifierStart : �ڹ� �������� ù��° ���ڷ� �������� üũ
		boolean check = Character.isJavaIdentifierStart(str[0]);
		
		// Character.isJavaIdentifierPart : �ڹ� �������� ������ �κ����� �������� üũ
		for(int i = 1; i < str.length; ++i) {
			check = check && Character.isJavaIdentifierPart(str[i]);
		}
		
		return check;
	}

}