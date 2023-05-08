package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest3 {

	public static void main(String[] args) {
		FileReader in = null;
		int ch;
		
		try {
			in = new FileReader("C:\\java\\KM_44\\src\\school\\Student.java");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			return;
		}   
		
		try {
			while ((ch = in.read()) != -1) { //파일에서 1문자 읽기
			System.out.print((char) ch);  //읽은 문자 출력
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
