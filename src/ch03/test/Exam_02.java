package ch03.test;
import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.print("키: ");
		float cm = sc.nextFloat();
		
		System.out.printf("이름은 %s이고 나이는 %d, 키는 %.2fcm입니다.", name, age, cm);
		
	}

}
