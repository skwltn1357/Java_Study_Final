package myinterface.jisu;

public class BookMain {
	
	public static void main(String[] args) {
		Cartoons cartoons = new Cartoons();
		
		test(cartoons);
	}



public static void test(Book book) {
	for(int i = 0; i <= 10; ++i) {
		System.out.println("å�� �����Ͽ����ϴ�.");
		System.out.println("���� ���� �� ���� " + book.borrow() + "�� �Դϴ�.");
	}
	
	for(int i = 0; i <= 10
			; ++i) {
		System.out.println("���� �ݳ��ؾ��ϴ� �� ���� " + book.returnBook() + "�� �Դϴ�.");
	}
	
	for(int i = 0; i < 15; ++i) {
		if(!book.read()) {
			System.out.println("���� �� ���� �ʰ��Ͽ� ���� �� �����ϴ�.");
		}else {
			System.out.println("å�� �ѱ� �� �����Ͽ����ϴ�.");
		}
	}
}

}
