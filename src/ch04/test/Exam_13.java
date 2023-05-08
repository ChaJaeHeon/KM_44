package ch04.test;

import java.util.Scanner;

public class Exam_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 해를 입력하세요: ");
		int year = sc.nextInt();
		
		String str = "";
		switch((year-3)%12){
			case 1: str = "쥐"; break;
			case 2: str = "소"; break;
			case 3: str = "호랑이"; break;
			case 4: str = "토끼"; break;
			case 5: str = "용"; break;
			case 6: str = "뱀"; break;
			case 7: str = "말"; break;
			case 8: str = "양"; break;
			case 9: str = "원숭이"; break;
			case 10: str = "닭"; break;
			case 11: str = "개"; break;
			case 0: str = "돼지"; break;
		}
		System.out.printf("%d년생은 %s띠 입니다.",year, str);
	}

}
