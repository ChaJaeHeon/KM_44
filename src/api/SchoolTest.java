package api;

import java.util.ArrayList;
import java.util.Scanner;
import school.Student;

public class SchoolTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		String name=null;
		String id=null;
		String phone=null;
		int kor=0;
		int eng=0;
		int math=0;
		
		//학생정보를 반복적으로 입력받아 저장
		label :
		while (true) {
			//학생의 이름,학번,전화번호,국영수점수를 입력받아 student객체 타입으로 ArrayList에 저장
			System.out.print("학생이름 입력: ");
			name=sc.next();
			System.out.print("학생학번 입력: ");
			id=sc.next();
			System.out.print("학생전화번호 입력: ");
			phone=sc.next();
			System.out.print("학생국어점수 입력: ");
			kor=sc.nextInt();
			System.out.print("학생영어점수 입력: ");
			eng=sc.nextInt();
			System.out.print("학생수학점수 입력: ");
			math=sc.nextInt();
			Student s = new Student(name, id, phone, kor, eng, math); 
			list.add(s);
			
			//"y"를 입력하면 계속 "n"을 입력하면 종료
			while (true) {
			System.out.print("계속 입력하시겠습니다? (y/n)");
			String a = sc.next();
			if(a.equals("y")) break;
			else if (a.equals("n")) {
				System.out.println("입력을 종료합니다.");
				break label;
			}
			else {
				System.out.println("y나 n만 입력해주세요.");
				continue;
			}
			}

		}
			//모든학생정보 출력
			//System.out.println(list);
		//출력형태변경, 학번 이름 총점 평균 한줄씩 나오도록
		for(int i=0; i<list.size(); i++) {
			System.out.print("학번: "+list.get(i).getId());
			System.out.print(" 이름: "+list.get(i).getName());
			System.out.print(" 총점: "+list.get(i).getTotal());
			System.out.print(" 평균: "+list.get(i).getAvg());
			System.out.println();	
		}
		
		//전체 학생의 평균
		double avg=0.0;
		for(Student s : list) {
			avg += s.getAvg();
		}
		avg/=list.size();
		System.out.println("전체 평균: "+avg);
	}
}
