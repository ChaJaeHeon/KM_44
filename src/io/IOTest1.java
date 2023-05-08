package io;

import java.io.File;
import java.io.IOException;

public class IOTest1 {

	public static void main(String[] args) {
		File a = new File("a.txt");	 
		File b = new File("sub");	//현재 위치 아래에 sub라는 폴더가 있는것처럼 메모리에 가지고 있음
		
		System.out.println(a.exists());  		//존재하는지
		System.out.println(a.isFile());  		//파일로 존재하는지 
		System.out.println(a.isDirectory()); 	//디렉토리로 존재하는지
	
		try {
			a.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		b.mkdir();
		
		System.out.println(a.exists());
		System.out.println(a.isFile());
		System.out.println(a.isDirectory());
		
		File c = new File("C:\\java\\KM_44\\src\\school\\Student.java");  //\가 하나만 있으면 내용에 포함되어있는걸로 판단함
		System.out.println(c.isFile());     //디렉토리나 파일이 아닌경우 false 반환
		System.out.println(c.getName());    //파일의 이름
		System.out.println(c.getParent());  //파일의 경로
		System.out.println(c.length());     //파일의 크기
		
		File d = new File("C:\\java\\KM_44\\src\\school");
		String filenames[] = d.list();
		File files[] = d.listFiles();
		for(String name : filenames) {
			System.out.println(name);
		}     //school이라는 파일내의 파일이름 반환
		
		
		//현재위치 알아내기
		File e = new File(".");
		try {
			System.out.println(e.getCanonicalPath());  //상대경로로 만들었어도 절대경로로 만드는 메서드
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		//파일명 변경하기
		File f = new File("a2.txt");
		a.renameTo(f);  //a라는 파일의 이름을 f로 변경
		
		
		//파일 삭제하기
		a.delete(); //a라는 파일 삭제
	}

}
