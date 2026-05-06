package sub8;

public class RemoteSamsung implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("Samsung - powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung - powerOn - powerOff");
	}

	@Override
	public void chUp() {
		System.out.println("Samsung - powerOn - chUp");
	}

	@Override
	public void chDown() {
		System.out.println("Samsung - powerOn - chDown");
	}

	@Override
	public void soundUp() {
		System.out.println("Samsung - powerOn - soundUp");
	}

	@Override
	public void soundDown() {
		System.out.println("Samsung - powerOn - soundDown");
	}

}
