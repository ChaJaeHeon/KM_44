package ch07;

public class ArrayTest {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < num.length; i++) {
			
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for( int i : num ) {
			System.out.println(i);
		}
	}
}
