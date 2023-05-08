package ch03.test;
import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("과목1: ");
		int test1 = sc.nextInt();
		System.out.print("과목2: ");
		int test2 = sc.nextInt();
		System.out.print("과목3: ");
		int test3 = sc.nextInt();
		float avg = (test1+test2+test3)/3;
		System.out.println("평균: "+avg);
		String pass = (test1>=40 && test2>=40 && test3>=40) && (avg >= 60) ? "합격" : "불합격";
		System.out.println(pass);

	}
}
