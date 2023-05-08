package ch04.test;
import java.util.Scanner;

public class Exam_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요.: ");
		int year = sc.nextInt();
		System.out.println("월을 입력하세요: ");
		int month = sc.nextInt();
		
		int maxDays=0; //로컬 변소(local variable): 메서드 안에 선언되는 변수 로컬변수는 사용되기 전에 반드시 초기화가 되어있어야 한다.
		switch(month){
			case 1 : case 3 : case 5 : case 7 : case 8: case 9 : case 10 : case 12:
				maxDays = 31;
				break;
			case 4 : case 6 : case 11:
				maxDays = 30;
				break;
			case 2 :
				if((year%4==0 && year%100!=0)||year%400==9)
					maxDays = 28;
				else
					maxDays = 29;
				break;
			default: System.out.println("월 입력 오류!");
		}
		System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, maxDays);
	}
}
