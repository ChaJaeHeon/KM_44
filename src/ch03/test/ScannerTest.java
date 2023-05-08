package ch03.test;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //키보드로 부터의 입력을 처리하기 위한 코드
		System.out.print("나이 입력: " );  //println:개행 print:개행x
		int age = sc.nextInt();
		System.out.println("입력한 나이는 "+age+" 살 입니다.");
		System.out.print("이름 입력:");
		String name = sc.next();
		System.out.println("이름은 "+name+"입니다.");
		System.out.print("주소 입력:");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("주소는 "+address+"입니다.");
		
	}

}
