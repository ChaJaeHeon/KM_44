package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class IOTest6 {

	public static void main(String[] args) throws Exception {
		FileInputStream in = null;
		FileOutputStream out = null;
		int i;
		String inFilename, outFilename;
		File infile, outFile;
		Scanner input = new Scanner(System.in);
		
		//원본 파일
		System.out.println("원본 파일명: ");
		inFilename = input.nextLine();
		infile = new File(inFilename);
		if(!infile.isFile()){
			System.out.println(inFilename+"파일이 없습니다.");
			return;
		}
		in = new FileInputStream(inFilename);
		
		
		//대상 파일
		System.out.println("사본 파일명: ");
		outFilename = input.nextLine();
		outFile = new File(inFilename);
		if (outFile.isFile()) {
			System.out.println("이미 존재하는 파일명입니다. 덮어쓰시겠습니까? (y/n)");
			if (input.nextLine().equalsIgnoreCase("n"))
				return;
		}
		out = new FileOutputStream(outFilename);
		
		//파일 복사하기
		while (in.read()!=-1) {
		i = in.read();
		out.write(i);
		}
		out.close();
		}


}


