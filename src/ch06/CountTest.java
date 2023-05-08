package ch06;

class Count{
	public int serialNumber;
	public static int counter = 0;
	public int nonStaticNumber;
	
	public Count() {
		// 클래스 변수는 모든 객체에 의해서 공유된다.
		counter++;
		serialNumber = counter;
		// 멤버 변수는 객체 생성시 마다 초기화된다.
		nonStaticNumber++;
	}
}


public class CountTest {

	public static void main(String[] args) {
		//ctrl + d 한줄 지우기
		Count c1 = new Count();
		Count c2 = new Count();
		Count.counter++;    //static으로 생성된 변수나 메서드는 객체없이 사용가능해서 클래스의 이름으로 곧바로 호출가능
		Count c3 = new Count();
		System.out.println("c1 serial number="+c1.serialNumber);
		System.out.println("c2 serial number="+c2.serialNumber);
		System.out.println("c3 serial number="+c3.serialNumber);
		System.out.println("c3 nonStaticNumber="+c3.nonStaticNumber);
	}

}
