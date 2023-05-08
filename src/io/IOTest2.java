package io;

import java.io.FileWriter;
import java.io.IOException;

//텍스트 파일 출력
public class IOTest2 {

	public static void main(String[] args) {
		FileWriter out = null;  //출력용 문자단위 출력
		
		//스트림 생성
		try {
			out = new FileWriter("b.txt");
		} catch (IOException e) {
			System.out.println("파일 생성 실패");
			return;
		}
		
		//입출력 작업
		try {
			out.write("A");
			out.write("가");
			out.write("\n");
		} 
		catch (IOException e) {
			System.out.println("쓰기 작업 중 오류임");
		}
		
		//스트림 닫기
		try {
			out.close();
		} catch (IOException e) {
			System.out.println("파일 닫기 오류");
		}
	}

}
