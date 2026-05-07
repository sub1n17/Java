package sub8;

interface Person {
	public abstract void hello();
	public void info();
}


public class InterfaceTest {
	
	public static void main(String[] args) {
		
		// 인터페이스 활용 1: 표준화된 클래스 설계
		RemoteControl lg = new RemoteLG(); // 다형성, 업캐스팅
		lg.powerOn();
		lg.chDown();
		lg.chUp();
		lg.chDown();
		lg.soundUp();
		lg.soundDown();

		RemoteControl samsung = new RemoteSamsung(); // 다형성, 업캐스팅
		samsung.powerOn();
		samsung.chDown();
		samsung.chUp();
		samsung.chDown();
		samsung.soundUp();
		samsung.soundDown();
		
		
		// 인터페이스 활용 2 : 모듈 간 결합도 완화(객체 유연성)
		Bulb bulb = new Bulb();
		Socket socket = new PowerCable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		// 인터페이스 활용 3 : 다중 상속 효과
		SmartTV stv = new SmartTV();

		stv.powerOn();
		stv.connection();
		stv.surf();
		stv.chUp();
		stv.process();
		stv.save();
		
		
		// 인터페이스 활용 4 : 익명 객체 사용
		Person kim = new Person() {
			
			@Override
			public void info() {
				System.out.println("김유신");
			}
			
			@Override
			public void hello() {
				System.out.println("안녕하세요");
			}
		};
		
		kim.hello();
		kim.info();
	}
}
