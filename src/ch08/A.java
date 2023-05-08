package ch08;

public class A {
	//멤버 변수
	int num;
	
	//생성자에는 void 등 사용 불가 만약 void가 붙게되면 메서드 취급
	public A() {
		System.out.println("A의 A()");
	}
	
	public A(int num) {
		this.num = num;
		System.out.println("A의 A(int)");
	}
	
	
	
	//메서드
	public void test() {
		System.out.println("A클래스의 test() 메서드");
	}
}
