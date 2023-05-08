package ch04.test;

import java.util.Scanner;

public class Exam_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			printmainmenu();
			int num = sc.nextInt();
			switch(num) {
			case 0:
				System.out.println("->프로그램을 종료합니다.");
				return;
			
			case 1:
				System.out.println("->\"1. 전체일정보기\"를 선택하였습니다.");
				break;
			case 2:
				System.out.println("->\"2. 일정 등록\"을 선택하였습니다.");
				break;
				
			case 3:
				System.out.println("->\"3. 일정 검색\"을 선택하였습니다.");
				break;
			case 4:
				System.out.println("->\"3. 일정 검색\"을 선택하였습니다.");
				break;
			default:
				System.out.println("없는 번호 입니다. 다시 선택하세요.");
				break;
			}
		}
	}
	private static void printmainmenu() {
		System.out.println("[일정 관리]");
		System.out.println("1. 전체 일정 보기");
		System.out.println("2. 일정 등록");
		System.out.println("3. 일정 검색");
		System.out.println("4. 일정 삭제");
		System.out.println("0. 종료");
		System.out.println("* 번호 선택: ");
	}
}
