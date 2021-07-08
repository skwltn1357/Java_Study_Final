
public class B06_breakContinue {
	
	public static void main(String[] args) {
		/*
		 	# break;
		 	- 반복문 내부에서 사용하면 속해있는 반복문을 하나만 탈출한다
		 	- switch문 내부에서 사용하면 switch문을 탈출한다
		 	
		 	# continue;
		 	- 반복문 내부에서 사용하면 반복문 블록을 다음 번 반복으로 바로 넘어간다
		 	- continue를 만난 시점에서 밑에 있는 반복문 블록은 모두 무시한다
		 	
		 */
		
		for(int i = 0; i < 10; ++i) {
			if(i == 3 || i == 4) {	
				continue;		// 0~9 중에서 3,4가 안나옴 
			}
			System.out.println(i);
		}
		
		for(int i = 0; i < 10; ++i) {
			if(i == 3 || i == 4) {	
				break;			// 0~2까지만 나옴
				
			}
			System.out.println(i);
		}
		
		
		// # for문의 무한 반복
		for(int i = 0; true; ++i) {
			if(i == 1000) {
				break;
			}
			System.out.println(i);
		}
	}

}
