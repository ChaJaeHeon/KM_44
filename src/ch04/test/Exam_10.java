package ch04.test;

import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		if(num%2 == 0)
			System.out.print(num+" : 짝수입니다.");
		else 
			System.out.print(num+" : 홀수입니다.");
	}

}
