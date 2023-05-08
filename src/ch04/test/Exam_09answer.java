package ch04.test;

import java.util.Scanner;

public class Exam_09answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력: ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수 입력: ");
		int num3 = sc. nextInt();
		
		int max = num1;
		if(max < num2) max = num2;
		if(max < num3) max = num3;
		
		System.out.printf("%d, %d, %d 중에 가장 큰 수는 %d 입니다.",num1,num2,num3,max);

	}

}
