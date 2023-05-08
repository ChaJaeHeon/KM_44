package test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		String in = sc.nextLine();
		StringBuffer out = new StringBuffer(in);
		String reverse=out.reverse().toString();
		
		System.out.println("출력: "+in.equals(reverse));
		
		
	}

}
