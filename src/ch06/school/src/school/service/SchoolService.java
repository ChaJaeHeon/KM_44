package school.service;

import java.util.ArrayList;

import school.dao.SchoolDAO;
import school.vo.Student;

public class SchoolService {
	SchoolDAO dao = new SchoolDAO();

	public void inputStudent(Student s) {
		dao.insert(s);
	}

	public ArrayList<Student> getList() {
		ArrayList<Student> studentList = dao.getList();
		return studentList;
	}
	
	public ArrayList<Student> searchStudent(){
		ArrayList<Student> newStudentList = dao.search(null);
		return newStudentList;
	}
	public boolean deleteStudent(String id) {
		boolean result = dao.delete(id);
		return result;
	}
}
