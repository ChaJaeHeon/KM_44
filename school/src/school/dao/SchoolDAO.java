package school.dao;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import school.vo.Student;

public class SchoolDAO {

	ArrayList<Student> list = new ArrayList<>();
	
	//학생성적추가하면 추가해주는 메서드
	public SchoolDAO() {
		//school.sch 파일을 연다
		in = new ObjectInputStream(new FileInputStream("school.sch")
		//파일이 없으면 ArrayList 생성
		
		//파일이 있으면 저장된 ArrayList객체를 읽어서 list에 대입
	}
	
	public void save() {
		//school.sch파일을 생성
		//파일에 list 저장
	}
	

	public void insert(Student s) {
		list.add(s);
	}

	public ArrayList<Student> getList() {
		
		return list;
	}
	
	public ArrayList<Student> search(String name){
		ArrayList<Student> list2 = new ArrayList<>();
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getName().contains(name)) {
				list2.addAll(i);;
				return list2;
			}
		} 
		
	}
	
	public boolean delete(String id) {
			if(list.get(i).getId().equals(id)) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}
}
