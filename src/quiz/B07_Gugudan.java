package quiz;

public class B07_Gugudan {
	
	public static void main(String[] args) {
		/*
		 	1. �������� ���η� ����غ�����
		 	2�� : 
		 	3�� :
		 	4�� :
		 	...
		 	
		 	2. �������� ���η� ����غ�����
		 	2��	3��	4��	....
		 */
		
		// 1��
		
		for(int dan = 2; dan <= 9; ++dan) {
			System.out.print(dan + "�� :\t");
		
			for(int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%dx%d=%02d ",dan,gop,dan*gop);
			}
			
			System.out.println();
			
		}
		
		
		// 2��
		
		for(int line = 0; line < 10; ++line) {
			for(int dan = 2; dan <= 9; ++dan) {
				if(line == 0) {
					System.out.printf("%d��\t",dan);
				}else {
					System.out.printf("%dx%d=%d\t",dan,line,dan*line);
				}
			}
			System.out.println();
		}
	}
}

