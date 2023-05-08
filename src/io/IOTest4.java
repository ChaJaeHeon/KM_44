package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileReader load = null;
		int ch;
		String name;
		File file;
		
		while(true) {
			//파일 경로를 입력받기
			System.out.println("읽을 파일을 입력하세요.");
			//입력받은 문자열로 File 객체 생성
			name = sc.nextLine();
			file = new File(name);
			if(file.exists()) {
				break;
			}
			else {
				System.out.print("파일이 없습니다. 다시 입력하세요.");
				continue;
			}
		}
		//파일 입력 스트림 생성
		try {
			load=new FileReader(name);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//반복문으로 내용 읽어서 출력
		try {
			while ((ch = load.read()) != -1) {
			System.out.println((char) ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("총 파일 크기: "+file.length()+"byte");
		//파일 닫기
		try {
			load.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}

}
//읽을 파일 : 문자열로 입력  c:\aaa.txt
		//없으면 파일이 없습니다. 다시 입력하세요.
		//읽을 파일 : c:\test\aaa.txt
		//---읽은 내용 출력
		//총 xxx bytes