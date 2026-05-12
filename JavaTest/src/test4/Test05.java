package test4;

// 추상메서드를 갖는 건 인터페이스도 있지만 class로 쓸 땐 abstract class 
abstract class Shape {
	public abstract void draw();
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("삼각형 그리기!");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("원 그리기!");
	}
}

public class Test05 {
	public static void main(String[] args) {
		Test05 here = new Test05();
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}
	
	public void draw(Shape object) {
		object.draw();
	}
}
