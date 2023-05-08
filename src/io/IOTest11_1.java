package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOTest11_1 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter out = null;
		File file, tempFile;
		String text, filename;
		int line = 0;
		
		tempFile = new File("temp!@#$.tmp");
		out = new BufferedWriter(new FileWriter(tempFile));
		
		System.out.println("내용을 입력하세요 (종료는 새행에서 Enter)");
		while (true ) {
			System.out.println(++line+":");
			text = sc.nextLine();
			if (text.isEmpty()) break;
			
			out.write(text);
			out.newLine();
		}
		out.close();
		
		System.out.println("저장하시겟습니까? (y/n)");
		text = sc.nextLine();
		if (text.equalsIgnoreCase("n")) {
			tempFile.delete();
			return;
		}
		
		while(true) {
			System.out.println("파일명");
			filename = sc.nextLine();
			file = new File(filename);
			if (!file.exists()) break;
			
			System.out.println("이미 사용중인 이름입니다. 덮어쓰시겠습니까? (y/n)");
			text = sc.nextLine();
			if(text.equalsIgnoreCase("y")) {
				file.delete();
				break;
			}
		}
		
		tempFile.renameTo(file);
		System.out.println(filename+"파일이 저장되었습니다.");
	}

}
