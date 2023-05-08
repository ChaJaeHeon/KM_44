package api;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {

	public static void main(String[] args) {

		//ArrayTest를 ArrayTest로 바꾸기
		ArrayList<Integer> num = new ArrayList<>();
		int i;
		
		while(true)	 {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력: ");
			i= sc.nextInt();
			if(i==-1) break;
			num.add(i);
		}
		System.out.println(num);
	}
}


	
