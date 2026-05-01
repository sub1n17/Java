package sub1;

public class Member {

	String name;
	int age;
	boolean isActive;
	
	public void activate() {
		this.isActive = true;
	}

	public void deactivate() {
		isActive = false; // this 생략 가능
	}
	
	public boolean isAdult() {
		if(age >= 20) {
			return true;
		} else {
			return false;
		}
	}
	
	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("활성여부 : " + isActive);
	}
}
