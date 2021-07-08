
public class C14_AnonymousInnerClass {
	/*
 		# 익명 내부 클래스
 		
 		- 클래스를 정의하자마자 이름도 짓지 않고 바로 사용한다음 버리는 방식
 		- 일회용이다
	 */
	public static void main(String[] args) {
		fight(new Dragon());
		fight(new SkeletonWarrior());
		
		// 익명 내부 클래스는 즉석으로 해당 클래스의 상속을 구현한다
		// 생성자 뒤에 {}를 열어 해당 클래스를 즉석으로 개조해서 사용하는 방법을 익명 내부 클래스라고 한다.
		// 아래와 똑같은 클래스는 다시는 재사용 할 수 없다. (한번 쓰고 버리는 것)
		Dragon dragon01 = new Dragon() {
			@Override
			void attac() {
				System.out.println("얼음 드래곤은 얼음을 뿜어서 공격합니다");
			}
		};
		
		fight(dragon01);
		
		fight(new SkeletonWarrior() {
			@Override
			void attac() {
				System.out.println("스켈레톤 방패병은 방패를 밀어서 공격합니다. ");			
			}
		});
		
		// 인스턴스화 할 수 없는 클래스를 즉석에서 상속받아 구현해버릴 수 있다
		Monster monster01 = new Monster() {
			@Override
			void attac() {
				System.out.println("몸통박치기!");				
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
		System.out.println("드래곤은 불을 뿜어서 공격합니다.");
	}
}

class SkeletonWarrior extends Monster{
	@Override
	void attac() {
		System.out.println("해골전사가 칼을 휘둘러서 공격합니다.");		
	}	
}

