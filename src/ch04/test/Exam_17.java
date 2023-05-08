package ch04.test;

public class Exam_17 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j= i; j<i+5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		for(int i=0; i<5 ; i++) {
			for(int j=0; j<=i; j++ ) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("__________");
		
		
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("----------");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j)
					System.out.print(i+" ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println("----------");
		

	}

}
