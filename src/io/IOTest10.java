package io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class IOTest10 {

	public static void main(String[] args) throws Exception {
		
		Data dat;
		ObjectInputStream in;
		
		in= new ObjectInputStream(new FileInputStream("data.data"));
		try {
		while(true){
			dat = (Data) in.readObject();
			System.out.println(dat);
		}
		}
		catch (EOFException e) {}
		
		
		in.close();

	}

}
