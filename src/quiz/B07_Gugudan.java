package quiz;

public class B07_Gugudan {
	
	public static void main(String[] args) {
		/*
		 	1. 구구단을 가로로 출력해보세요
		 	2단 : 
		 	3단 :
		 	4단 :
		 	...
		 	
		 	2. 구구단을 세로로 출력해보세요
		 	2단	3단	4단	....
		 */
		
		// 1번
		
		for(int dan = 2; dan <= 9; ++dan) {
			System.out.print(dan + "단 :\t");
		
			for(int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%dx%d=%02d ",dan,gop,dan*gop);
			}
			
			System.out.println();
			
		}
		
		
		// 2번
		
		for(int line = 0; line < 10; ++line) {
			for(int dan = 2; dan <= 9; ++dan) {
				if(line == 0) {
					System.out.printf("%d단\t",dan);
				}else {
					System.out.printf("%dx%d=%d\t",dan,line,dan*line);
				}
			}
			System.out.println();
		}
	}
}

