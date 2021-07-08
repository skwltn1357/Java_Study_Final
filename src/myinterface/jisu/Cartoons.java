package myinterface.jisu;

public class Cartoons implements Book {

	int book_num = 0; 
	int max_read = 10;
	int curr_person = 0;
	
	@Override
	public int borrow() {
		return book_num += 5;
	}
	@Override
	public int returnBook() {
		return book_num -= 5;
	}
	@Override
	public boolean read() {
		if(curr_person == max_read) {
			return false;
		}else {
			curr_person++;
			return true;
		}
	
	}
}
