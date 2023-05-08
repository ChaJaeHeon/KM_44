package api;

class A {
	public static final double x = 0.5;
	
	class D {
		//클래스 안에서만 내부적으로 사용할 때는 내부클래스를 사용  
	}

}

class B {
	
}

abstract class C extends A {
	private B ob;
	
	void test() {
		
		double y = 1111*x;
	}
	abstract void test2();
	
}

class E extends C{
	
}