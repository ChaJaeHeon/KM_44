package ch08;

public class Main_A {

	public static void main(String[] args) {
		int i = 10;
		A a1 = new A();
		A a2 = new A(100);
		
		
		a1.num=1;
		a1.test();
		
		B b1 = new B();
		B b2 = new B(10, 2.34);
		
		b2.test();
		b2.toString();
		
		C c = new C();
		c.setBounds(100,100,300,300);
		c.setTitle("내가 만든 쿠키");
		c.setVisible(true);
	}

}
