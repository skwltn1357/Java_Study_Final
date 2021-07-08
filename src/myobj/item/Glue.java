package myobj.item;


public class Glue extends Item{

	public Glue() {
		super("풀", 2000);
		
	}

	@Override
	public void use() {
		System.out.println("풀로 붙일 수 있습니다");

	}
	
	
}
