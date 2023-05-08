package api;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "aaaa");
		map.put(3, "bbbb");
		map.put(5, "cccc");
		map.put(2, "dddd");
		
		System.out.println(map);
		System.out.println(map.get(1));   //vo클래스 대신에 사용가능
		System.out.println(map.get(5));   
		
		
		map.put(1, "1234");//VALUE는 중복가능하나 key는 같은 값이 들어갈수 없음, key값이 있는데 들어간다면 뒤에값으로 중복되게 된다.
		System.out.println(map);
		System.out.println(map.get(10));
		
		
	}

}
