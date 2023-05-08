package ch04;

public class practice_04 {

	public static void main(String[] args) {
		//패턴의 규칙찾는것이 중요
		int n = 3;
		for(int i=1; i<=7;i+=2) {
			//공백을 출력하는 반복문
			for(int k=n--; k>0; k--) {
				System.out.print(" ");
			}
			// "*"표를 출력하는 반복문
			for(int j=0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
