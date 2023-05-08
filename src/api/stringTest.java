package api;

//java.lang.String 테스트
public class stringTest {

	public static void main(String[] args) {
		String a;
		String b = null;
		String c = "";
		String d = "abcg";
		String e = "abc";
		String f = new String("abc");
		String g = new String("abc");
		
//		System.out.println(a); 초기화 되지 않은 상태
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		System.out.println(d==e); //같은 참조데이터를 담고 있어서 true로 반환
		System.out.println(f==g); //같은 글자이나 다른 참조데이터를 가지고 있어서 false
		System.out.println(f.equals(g)); //완전히 일치하는 조회
		System.out.println(f.equalsIgnoreCase("ABC")); //대문자, 소문자 상관없이 같은 글자인지 boolean값으로 반환
		
		String s = "abcdefg";
		System.out.println(s.length()); //문자열의 길이 , int형으로 반환 
		System.out.println(s.charAt(5));  //문자열 중 입력한 순번의 글자를 불러오는 것(0부터 시작),읽기전용,char형 문자반환
		System.out.println(s.substring(1,3));  //부분문자열 읽기 ex- (1,2)=1번글자부터 2번글자까지, string형 문자반환
		System.out.println(s.substring(4));  //부분문자열 읽기 ex- (4)=4번부터 끝까지 메서드가 원래 두개이기 때문에 가능 (오버로딩)
		System.out.println(s.substring(2,5).length());  //부분문자열 읽기 ex- (4)=4번부터 끝까지 메서드가 원래 두개이기 때문에 가능 (오버로딩)
		System.out.println(s.substring(s.length()-1)); 
		System.out.println(s.indexOf('c'));  //문자열에서 입력한 글자를 찾아 자리수를 숫자로 반환
		System.out.println(s.indexOf("de"));  //시작글자의 자리수를 숫자로 반환
		System.out.println(s.contains("def"));  //문자열에 문자를 포함하고 있는지를 반환
		System.out.println(s.compareTo("aba")); //문자열과 틀린 첫번째 문자열의 자릿수를 반환, 완전히 똑같을때는 값이 0
		System.out.println(s.compareTo("abd")); //문자열과 틀린 첫번째 문자열의 자릿수를 반환, 완전히 똑같을때는 값이 0
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		//특정문자를 뒤에서부터 찾기
		System.out.println(s.lastIndexOf("a"));
		//abc로 시작하는가?
		System.out.println(s.startsWith("abc"));
		//fg로 끝나는가?
		System.out.println(s.endsWith("fg"));
		
		s="a";
		s= s+"b";
		s= s+ "c";
		System.out.println(s);
		s="010-1111-2222";
		String s2 = s.replaceAll("-", "/"); //입력문자를 특정문자로 바꿔주는 것
		System.out.println(s2);
		String s3[] = s.split("-");  //특정문자 기준으로 입력한 문자앞으로 자르는 것
		System.out.println(s3[0]);
		
	}

}
