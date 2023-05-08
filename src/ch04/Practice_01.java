package ch04;

import java.util.Scanner;

public class Practice_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값1 입력: ");
		double val1 = sc.nextDouble();
		System.out.println("값1 입력: ");
		double val2 = sc.nextDouble();
		System.out.println("연산자입력: ");
		String operator = sc.next();
		
		
		double result = 0.0;
		//객체의 값을 비용할 때는 equals()메서드를 사용한다.
		if(operator.equals("+")) {
			result=val1+val2;
		}
		else if(operator.equals("-")) {
			result=val1-val2;
		}
		else if(operator.equals("*")) {
			result=val1*val2;
		}
		else if(operator.equals("/")) {
			if(val2==0) {
				System.out.println("연산오류!");
				return;
			}
			else {
				result=val1/val2;
			}
		}
		System.out.printf("%.2f %s %.2f = %.2f",val1,operator,val2,result);
		}
		
}



