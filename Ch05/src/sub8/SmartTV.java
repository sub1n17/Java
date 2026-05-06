package sub8;

// 상속은 1개만 가능, 인터페이스는 여러개 가능
public class SmartTV extends Tv implements Internet, Computer {

	@Override
	public void connection() {
		System.out.println("인터넷 접속");
	}

	@Override
	public void surf() {
		System.out.println("인터넷 탐색");
	}

	@Override
	public void process() {
		System.out.println("SmartTv processing");
	}

	@Override
	public void save() {
		System.out.println("SmartTv saving");
	}



	
}
