package myobj.pirate;

public class MrTong {
	
	// true : 해당 구멍은 찔린적 있음
	// flase : 해당 구멍은 아직 찔린적 없음
	boolean[] stabbed;
	boolean[] launch;
	
	// launched가 true면 통아저씨가 발사된 상태
	public boolean launched;
	
	public MrTong(int size) {
		stabbed = new boolean[size];
		launch = new boolean[size];
		

		// 정답을 우선 1~4개 생성
		for (int i = 0, len = (int)(Math.random() * 4 + 1); i < len; ++i) {
			launch[i] = true;
		}
	
	}
	
	// 이미 찔린 곳이라면  return flase, 아니라면 찌르고 잘 찔렀다며 return true
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
