package ch04.test;

import java.util.Scanner;

public class Exam_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력: ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수 입력: ");
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.printf("%d, %d, %d 중 가장 큰 수는 "+num1+"입니다.",num1,num2,num3);
		}
		else if(num2>num1 && num2>num3) {
			System.out.printf("%d, %d, %d 중 가장 큰 수는 "+num2+"입니다.",num1,num2,num3);
		}
		else {
			System.out.printf("%d, %d, %d 중 가장 큰 수는"+num3+"입니다.",num1,num2,num3);
		}
	}

}
