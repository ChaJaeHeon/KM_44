package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest5 {

	public static void main(String[] args) {
		FileReader in = null;
		BufferedReader br = null;  //BufferedReader가 없어도 입력가능, 한줄씩 읽어오는 기능이 추가
		String s;
		
		try {
			br = new BufferedReader(new FileReader("C:\\java\\KM_44\\src\\school\\Student.java"));
			//1단계로 만든 파일리더를 2단계로 만든 버퍼드 리더안에 집어넣음
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			return;
		}
		
		try {
			while(true) {
			s=br.readLine();
			if (s == null) break;
			System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

/* System.in = 키보드로 부터 들어오는 입력
 * System.in.read() = 이것만으로 쓰기에는 부족 inputStream 타입이기 때문에 (byte 단위라 문자를 구별해서 입력 불가능)
 * 기능을 개선하기위해서 다른 스트림을 사용 가능
 * new InputStreamReader(System.in) 이런식으로 읽게 된다면 문자도 깨지지 않고 한글자씩 읽음
 * new BufferdReader(new InputStreamReader(System.in)) = 키보드로 부터 줄단위로 글자를 받아들여 읽음
 */
		