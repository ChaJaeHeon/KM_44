package api;

public class TypeTest {

	public static void main(String[] args) {
		
		Integer a = new Integer(1);
		Double b = new Double(1.1);
		Number c = new Integer(2);
		Object e = new Integer(3);
		String f = new String("aaa");
		Object g = new String("ccc");
		
		System.out.println(a instanceof Integer);  //정확한 타입 일치
		System.out.println(a instanceof Number);   //상속관계에서의 상위타입
		System.out.println(a instanceof Object);   //상속관계에서의 상위 타입
//		System.out.println(a instanceof Double); 상속관계가 아닌 비교
		System.out.println(c instanceof Double); //상속관계이면서 타입이 일치하지 않음
		System.out.println(c instanceof Double); //상속관계이면서 타입이 일치하지 않음
		System.out.println(e instanceof String); //상속관계이지만 타입이 일치하지 않음
		System.out.println(c instanceof Double);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Math.PI);
	}

}
