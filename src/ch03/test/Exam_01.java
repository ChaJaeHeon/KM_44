package ch03.test;

import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		boolean result = (num>0) ? true : false;
		System.out.println("num의 값: " +num);
		System.out.println("result의 값: " +result);
	}

}
