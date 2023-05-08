package test;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		FileWriter out = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1번째 숫자 입력: ");
		int i = sc.nextInt();
		System.out.println("2번째 숫자 입력: ");
		int j = sc.nextInt();
		String result = Integer.toString(i+j);
		
		try {
			out = new FileWriter("2번답안.txt");
		} catch (Exception e) {
			System.out.println("파일 생성 오류");
		}
		
		try {
			out.write(result);
		} catch (Exception e) {
			System.out.println("파일입력오류");
		}
		
		try {
			out.close();
		} catch (Exception e) {
			System.out.println("파일 닫기 오류");
		}
		
	}

}
