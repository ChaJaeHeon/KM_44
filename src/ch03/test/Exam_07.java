package ch03.test;

import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("상품의 가격을 입력하세요: ");
		int price = sc.nextInt();
		
		int one = price/50000;
		int two = price%50000/10000;
		int three = price%50000%10000/5000;
		int four = price%50000%10000%5000/1000;
		int etc = price%50000%10000%5000%1000;
		
		System.out.printf("%d는 5만원권 %d장, 만원권 %d장, 5천원권 %d장, 천원권 %d장을 지불하고 %d원이 남습니다.",
				price,one, two, three, four, etc);
		

	}

}
