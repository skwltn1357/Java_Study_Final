package myobj.pirate;

public class MrTong {
	
	// true : �ش� ������ ���� ����
	// flase : �ش� ������ ���� ���� ����
	boolean[] stabbed;
	boolean[] launch;
	
	// launched�� true�� ��������� �߻�� ����
	public boolean launched;
	
	public MrTong(int size) {
		stabbed = new boolean[size];
		launch = new boolean[size];
		

		// ������ �켱 1~4�� ����
		for (int i = 0, len = (int)(Math.random() * 4 + 1); i < len; ++i) {
			launch[i] = true;
		}
	
	}
	
	// �̹� �� ���̶��  return flase, �ƴ϶�� ��� �� �񷶴ٸ� return true
	public boolean stab(int index) {
		if(stabbed[index]) {
			return false;
		}else {
			stabbed[index] = true;
			launched = launch[index];
			return true;
		}
	}
	
	public boolean[] getStabbed() {
		return stabbed;
	}
}
