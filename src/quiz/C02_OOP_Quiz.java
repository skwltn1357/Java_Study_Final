package quiz;

public class C02_OOP_Quiz {
	
	/*
	 	연습문제 : 현실의 객체를 참고하여 클래스를 하나 생성한 후 인스턴스를 생성하고 값을 채운다움 출력해보세요
	 	※ 인스턴스 변수는 3개 이상, 인스턴스 메서드 2개 이상, 과일 금지
	 */

	class Window {
		boolean open;
		boolean lock;
		double width;
		double height;
		
		void open() {
			open = true;
		}
		void close() {
			open = false;
		}
		void lock() {
			lock = true;
		}
		void unlock() {
			lock = false;
		}
		void status() {
			System.out.printf("이 창문은 %s. %s.",
					open ? "열려있습니다" : "닫혀있습니다.",
					lock ? "잠겨있습니다" : "잠금해제상태입니다.");
		}
		String getStatus() {
			return String.format("이 창문은 %s. %s.",
					open ? "열려있습니다" : "닫혀있습니다.",
					lock ? "잠겨있습니다" : "잠금해제상태입니다.");
		}
		
		public void main(String[] args) {
			Window window1 = new Window();
			
			window1.open();
			window1.close();
			window1.lock();
			
			window1.getStatus();
			
			String status = window1.getStatus();
			System.out.println("가져온 상태 문자열로 출력 : " + status);
		}
		
	}

	}

	
	
	
	
	
	