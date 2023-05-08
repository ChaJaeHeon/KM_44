package ch03.test;

import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("x= ");
		int x = sc.nextInt();
		System.out.print("y= ");
		int y = sc.nextInt();
		
		
		int beforex = x;
		int beforey = y;
		System.out.printf("교환전 : x=%d, y=%d \n" , beforex, beforey);
		
		int afterx = beforey;
		int aftery = beforex;
		System.out.printf("교환후 : x=%d, y=%d", afterx, aftery);
		
		
		
	}

}

/* int x = 100;
 * int y = 200;
 * system.out.printf("교환 전: x=%d, y=%d\n", x, y)*/
