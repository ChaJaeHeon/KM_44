package api;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		int num[] = new int[3];
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int n;
		int newnum[]=null;
		
		//정수를 입력받아 배열을 초기화
		while(true) {
			System.out.print("정수 입력: ");
			n=sc.nextInt();
			if (n==-1) break;
			num[i++]=n;
			
			if(num.length==i) {
				newnum = new int [num.length*2];
				for(int j = 0;j<num.length;j++) {
					newnum[j]=num[j];
				}
				num=newnum;
				}
		}
		for(i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
    }
}