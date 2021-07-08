package myinterface.jisu;

public class BookMain {
	
	public static void main(String[] args) {
		Cartoons cartoons = new Cartoons();
		
		test(cartoons);
	}



public static void test(Book book) {
	for(int i = 0; i <= 10; ++i) {
		System.out.println("책을 대출하였습니다.");
		System.out.println("현재 대출 권 수는 " + book.borrow() + "권 입니다.");
	}
	
	for(int i = 0; i <= 10
			; ++i) {
		System.out.println("현재 반납해야하는 권 수는 " + book.returnBook() + "권 입니다.");
	}
	
	for(int i = 0; i < 15; ++i) {
		if(!book.read()) {
			System.out.println("대출 권 수를 초과하여 읽을 수 없습니다.");
		}else {
			System.out.println("책을 한권 더 대출하였습니다.");
		}
	}
}

}
