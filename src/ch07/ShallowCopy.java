package ch07;

public class ShallowCopy {

	public static void main(String[] args) {
		
			int num1 []= {10,20,30,40,50};
			int num2 [] = num1;
			
			
			num2[0] = 1;
			
			System.out.println("=======num1======");
			for(int i : num1) {
				System.out.print(i+" ");
			}
			
			System.out.println();
			System.out.println();
			System.out.println("=======num2======");
			for(int i : num2) {
				System.out.print(i+" ");
			}
	}

}
