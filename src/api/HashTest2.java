package api;

import java.util.HashMap;
import java.util.Scanner;

import jdk.nashorn.internal.ir.ContinueNode;

public class HashTest2 {

	
	
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		map.put(1, "입력");
		map.put(2, "삭제");
		map.put(3, "확인");
		map.put(4, "수정");
		map.put(5, "종료");
		
		System.out.println(map);
		System.out.print("원하는 기능의 숫자를 선택하세요: ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1: 
				System.out.println("입력을 시작합니다.");
				break;
			case 2:
				System.out.println("삭제를 시작합니다.");
				break;
			case 3:
				System.out.println("정보확인을 시작합니다.");
				break;
			case 4:
				System.out.println("정보수정을 시작합니다.");
				break;
			case 5:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("입력문자를 확인하세요.");
		}
		
		
	}
}
