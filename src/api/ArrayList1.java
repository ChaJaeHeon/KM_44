package api;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		//String을 저장할 ArrayList 생성
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add(1, "ddd");   //원래있던것을 뒤로 밀고 삽입
		System.out.println(list);
		list.set(1, "xxx");   //원래 있던 요소를 변경
		System.out.println(list);
		
		
		System.out.println(list.get(0));  //배열의 순서를 참고해 값을 반환, 값변경 x
		System.out.println(list);
		System.out.println(list.remove(0));  //배열의 순서를 참고해 값을 반환하지만 그값을 list에서 삭제
		System.out.println(list);
		System.out.println(list.contains("ccc")); //값이 똑같은 것이 있는지 boolean값으로 반환
		System.out.println(list.indexOf("ccc"));  //포함되어있는 값의 순서를 반환
		System.out.println(list); //arrayList의 배열의 출력
		
		for(int i=0; i<list.size();i++) {
			System.out.println(i+1 +"번 "+list.get(i));
		}
		
		for(String s :list) {
			System.out.println(s);
		}
	}
}