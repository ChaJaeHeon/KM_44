package test;

public class Test1 {

	public static void main(String[] args) {
		int num[] = { 5, 10 ,23 ,50, 34, 100, 23 ,2 ,3, 20};
		int max = num[0];
		int min = num[0];
		System.out.print("배열: ");
		
		for(int i = 0; i<num.length ; i++) {
			System.out.print(num[i]+",");
			if(max<num[i]) {
				max=num[i];
			}
			else if(min>num[i]) {
				min=num[i];
			}
			
		}
		System.out.println("");
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
	}

}
