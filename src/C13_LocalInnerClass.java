
public class C13_LocalInnerClass {
/*
 	# ���� ���� Ŭ����
 	 
 	 - Ŭ������ ��� �޼��� ���ο����� ������ �� �ִ�
 	 - �޼��尡 ������ �ش� Ŭ������ ������ ���Ѵ�
 */
	public static void main(String[] args) {
		
		// �޼��� ���ο��� Ŭ������ ����� �� ����
		 class Apple {
			int price;
			int color;
			
			public Apple(int price, int color) {
				this.price = price;
				this.color = color;
			}
			@Override
			public String toString() {
				return "price : " + price + "��\ncolor��: " + color;
			}
		}
		
		Apple a = new Apple(1000, 1);
		System.out.println(a);
		
		// ������ ���� ��Ȳ�� o.check()�� ������ �� ���� ������?
		//Object o = execBanana();
		//o.check();
		// => ��ĳ���� �� ���¿��� �ٳ������� �����ϴ� ����� ����� �� ���⶧���̴�. 
		
		Fruitt fruit = execBanana();
		System.out.println("�ٳ����� ���� " + fruit.check() + "�� �Դϴ�.");
	}
	
	public static Fruitt execBanana() {
		class Banana extends Fruitt {
			int bana_count;
			int price;
			
			public Banana(int bana_count, int price) {
				this.bana_count = bana_count;
				this.price = price;
			}
			
			double check() {
				return price / (double)bana_count;
			}
		}
		
		return new Banana(11, 3000);		
	}
}

abstract class Fruitt {	
	abstract double check();
	
}








