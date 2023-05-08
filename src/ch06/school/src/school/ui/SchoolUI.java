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
				System.out.println("���� ����");
				keyin.nextLine();
			}
		}
	}

	void mainMenu() {
		System.out.println();
		System.out.println("[ �л� ���� ���� ]");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. ��ü ��� ���");
		System.out.println("3. �˻�");
		System.out.println("4. ����");
		System.out.println("0. ���α׷� ����");
		System.out.print("����> ");

	}

	void input() {
		System.out.println("[1. �л� ���� �Է�]");
		String name, id, phone;
		int k, e, m;
		
		System.out.print("�̸�: ");
		name = keyin.next();
		System.out.print("�й�: ");
		id = keyin.next();
		System.out.print("��ȭ: ");
		phone = keyin.next();
		System.out.print("��������: ");
		k = keyin.nextInt();
		System.out.print("��������: ");
		e = keyin.nextInt();
		System.out.print("��������: ");
		m = keyin.nextInt();
		
		Student s = new Student(name, id, phone, k , e, m);
		service.inputStudent(s);
		System.out.println("����Ǿ����ϴ�.");
	}

	void list() {
		ArrayList<Student> studentList=service.getList();
		System.out.println(studentList);
	}

	void search() {
		System.out.println("[3. �˻�]");
	    System.out.print("�˻��� �л��� �̸��� �Է��ϼ���: ");
	    String name = keyin.next();
	    service.deleteStudent(name);
	    System.out.println("�˻��Ǿ����ϴ�.");
	}

	void delete() {
	    System.out.println("[4. ����]");
	    System.out.print("������ �л��� �й��� �Է��ϼ���: ");
	    String id = keyin.next();
	    service.deleteStudent(id);
	    System.out.println("�����Ǿ����ϴ�.");
	}

	void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		
	}
}
