package test4;

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	protected void hello() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Student extends Person {
	private int studentId;
	
	public Student(int studentId, String name, int age) {
		super(name, age); // 부모 생성자 호출
		this.studentId = studentId;
	}
		
	public void hello() {
		System.out.println("학번 : " + studentId);
		super.hello(); // 부모의 메서드 호출
	}
}

public class Test01 {
	public static void main(String[] args) {
		Student kim = new Student(20201234, "김유신", 21);
		kim.hello();
	}
}