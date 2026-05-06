package sub8;

// 인터페이스를 구현하는 구현 클래스
public class  RemoteLG implements RemoteControl {

	// 인터페이스의 추상메서드 반드시 구현(오버라이딩)
	@Override
	public void powerOn() {
		System.out.println("LG - powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("LG - powerOff");
	}

	@Override
	public void chUp() {
		System.out.println("LG - chUp");
	}

	@Override
	public void chDown() {
		System.out.println("LG - chDown");
	}

	@Override
	public void soundUp() {
		System.out.println("LG - soundUp");
	}

	@Override
	public void soundDown() {
		System.out.println("LG - soundDown");
	}
}
