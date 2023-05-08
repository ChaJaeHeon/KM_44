package ch08;

public class B extends A { //A의 모든것을 물려받아서 B에 상속
	double dnum;
	
	public B() {
		System.out.println("B의 B()");
	}
	
	public B(int n, double d) {
		super(n);
		//num=n;
		dnum=d;
		System.out.println("B의 B(int, double)");
	}
	
}
