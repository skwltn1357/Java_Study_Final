
public class C14_AnonymousInnerClass {
	/*
 		# �͸� ���� Ŭ����
 		
 		- Ŭ������ �������ڸ��� �̸��� ���� �ʰ� �ٷ� ����Ѵ��� ������ ���
 		- ��ȸ���̴�
	 */
	public static void main(String[] args) {
		fight(new Dragon());
		fight(new SkeletonWarrior());
		
		// �͸� ���� Ŭ������ �Ｎ���� �ش� Ŭ������ ����� �����Ѵ�
		// ������ �ڿ� {}�� ���� �ش� Ŭ������ �Ｎ���� �����ؼ� ����ϴ� ����� �͸� ���� Ŭ������� �Ѵ�.
		// �Ʒ��� �Ȱ��� Ŭ������ �ٽô� ���� �� �� ����. (�ѹ� ���� ������ ��)
		Dragon dragon01 = new Dragon() {
			@Override
			void attac() {
				System.out.println("���� �巡���� ������ �վ �����մϴ�");
			}
		};
		
		fight(dragon01);
		
		fight(new SkeletonWarrior() {
			@Override
			void attac() {
				System.out.println("���̷��� ���к��� ���и� �о �����մϴ�. ");			
			}
		});
		
		// �ν��Ͻ�ȭ �� �� ���� Ŭ������ �Ｎ���� ��ӹ޾� �����ع��� �� �ִ�
		Monster monster01 = new Monster() {
			@Override
			void attac() {
				System.out.println("�����ġ��!");				
			}		
		};
		fight(monster01);
	}
	
	private static void fight(Monster monster) {
		monster.attac();
	}
}

abstract class Monster {
	abstract void attac();
}

class Dragon extends Monster{
	@Override
	void attac() {
		System.out.println("�巡���� ���� �վ �����մϴ�.");
	}
}

class SkeletonWarrior extends Monster{
	@Override
	void attac() {
		System.out.println("�ذ����簡 Į�� �ֵѷ��� �����մϴ�.");		
	}	
}

