package api;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 {

	public static void main(String[] args) {
		
		ArrayList<Data> list = new ArrayList<Data>();
		
		Data d = null;
		
		d = new Data();
		d.setNum(1);
		d.setName("모니터");
		list.add(d);
		
		d = new Data();
		d.setNum(2);
		d.setName("키보드");
		list.add(d);
		
		System.out.println(list);
		
		Scanner sc = new Scanner(System.in);
		Data input = new Data();
		System.out.print("번호와 이름을 입력해주세요.: ");
		input.setNum(sc.nextInt());
		input.setName(sc.next());
		
		// 입력한 값이 리스트에 있는지 위치 출력
		
		int i = list.indexOf(input);
		if(i == -1) {
			System.out.println("Data가 없습니다.");
		}
		else {
			System.out.println(i+"번째");
		}
		
	}

}
