package api;

public interface Test {
	
		public static final int a = 1;   //값 수정 불가 메모리에 a라는 변수 생성
		
		public abstract void method();  //추상 메서드 , 인터페이스
}
class A extends B implements X, Y , Z {
	//이 경우 A는 B와 X,Y,Z의 변수를 참조 가능
}