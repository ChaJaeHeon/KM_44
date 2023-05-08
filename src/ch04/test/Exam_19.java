package ch04.test;

import java.util.Scanner;

public class Exam_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			System.out.print("정수 입력: ");
			int num= sc.nextInt();
			sum+= num;
			
			if(num==0) {
				System.out.printf("합계:%d", sum);
				break;
			}
			
		}	
	}
}
