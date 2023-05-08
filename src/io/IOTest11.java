package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class IOTest11 {

	public static void main (String[] args) throws Exception {
		ArrayList<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int i = 1;
		String x = null;
		File file;
		String inputfilename, outputfilename;
		ObjectOutputStream out = null;
		
		
		System.out.println("내용을 입력하세요. (종료는 새행에서 Enter입력)");
		while (true) {
			System.out.print(i+++":");
			x=sc.nextLine();
			list.add(x);
			if(x.isEmpty()) break;
		}
		System.out.println("저장하시겠습니까 (y/n)");
		String save = sc.nextLine();
		while(true) {
			if(save.equals("y")) {
				System.out.println("파일명: ");
				String name = sc.nextLine();
				file = new File(name);
				if(file.isFile()) {
					System.out.println("중복된 이름입니다. 덮어쓰시겠습니까? (y/n)");
					String yn= sc.nextLine();
					if(yn.equals("y")) {
						break;
					}
					else 
						System.out.println("파일명을 다시 입력하세요.");
						continue;
				}
				
						out = new ObjectOutputStream(new FileOutputStream(file));
						out.writeObject(list);
						out.close();
						break;
				
				
			}
			else
				System.out.println("종료합니다.");
				break;
		}
		System.out.println("저장완료");
	}
		
		
}


//내용을 입력하사세요 (종료는 새행에서 enter)
		//1:abcd
		//2:1234
		//3:가나다라
		//arraylist에 저장
		//새행에서 아무것도 입력했을때 enter 입력시 종료
		//저장하기겠습니다? (y/n) y
		//파일명: a.txt
		//이미 사용중인 이름입니다. 덮어쓰시겠습니까? (y/n) n
		//파일명:b.txt
		//b.txt파일이 저장되었습니다.

		//String 붙여서 모아놨다가 한번에 저장
        //StringBuffer에 저장
        //ArrayList로 모아서 저장
        //임시파일