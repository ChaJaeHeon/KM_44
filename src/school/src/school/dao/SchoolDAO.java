package school.dao;

import java.util.ArrayList;

import school.vo.Student;

public class SchoolDAO {

	ArrayList<Student> list = new ArrayList<>();

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
		for(int i =0; i<list.size();i++) { //앞에서부터 한명씩 비교
			if(list.get(i).getId().equals(id)) {
				list.remove(i);
				return true;
				//같은 학번을 찾으면 삭제후 true 리턴
			}
		}
		return false;
		//못찾으면 false 리턴
	}
}
