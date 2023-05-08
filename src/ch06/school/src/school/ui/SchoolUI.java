package school.ui;

import java.util.ArrayList;
import java.util.Scanner;

import school.service.SchoolService;
import school.vo.Student;

public class SchoolUI {
	Scanner keyin = new Scanner(System.in);
	SchoolService service = new SchoolService();
	String choice;

	public SchoolUI() {
		while (true) {
			mainMenu();
			choice = keyin.next();
			switch (choice) {
			case "1":
				input();
				break;
			case "2":
				list();
				break;
			case "3":
				search();
				break;
			case "4":
				delete();
				break;
			case "0":
				exit();
				return;
			default:
				System.out.println("선택 오류");
				keyin.nextLine();
			}
		}
	}

	void mainMenu() {
		System.out.println();
		System.out.println("[ 학생 성적 관리 ]");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 전체 목록 출력");
		System.out.println("3. 검색");
		System.out.println("4. 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택> ");

	}

	void input() {
		System.out.println("[1. 학생 성적 입력]");
		String name, id, phone;
		int k, e, m;
		
		System.out.print("이름: ");
		name = keyin.next();
		System.out.print("학번: ");
		id = keyin.next();
		System.out.print("전화: ");
		phone = keyin.next();
		System.out.print("국어점수: ");
		k = keyin.nextInt();
		System.out.print("영어점수: ");
		e = keyin.nextInt();
		System.out.print("수학점수: ");
		m = keyin.nextInt();
		
		Student s = new Student(name, id, phone, k , e, m);
		service.inputStudent(s);
		System.out.println("저장되었습니다.");
	}

	void list() {
		ArrayList<Student> studentList=service.getList();
		System.out.println(studentList);
	}

	void search() {
		System.out.println("[3. 검색]");
	    System.out.print("검색할 학생의 이름을 입력하세요: ");
	    String name = keyin.next();
	    service.deleteStudent(name);
	    System.out.println("검색되었습니다.");
	}

	void delete() {
	    System.out.println("[4. 삭제]");
	    System.out.print("삭제할 학생의 학번을 입력하세요: ");
	    String id = keyin.next();
	    service.deleteStudent(id);
	    System.out.println("삭제되었습니다.");
	}

	void exit() {
		System.out.println("프로그램을 종료합니다.");
		
	}
}
