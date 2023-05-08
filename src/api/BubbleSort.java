package api;

public class BubbleSort {
	
	public static void main(String[] args) {
	      //int num[] = {5, 2, 8, 3, 1};
		  int num[]= {1,2,3,4,5};
	      int i, j, tmp;
	      boolean flag;
	      
	      // 정렬 전 출력
	      System.out.println(num.length);
	      for(i = 0 ; i < num.length; i++) {
	         System.out.print(num[i] + " ");
	      }
	      System.out.println();
	      // 정렬
	      int store = 0;
	      int a = 0 , b = 0;
	      for(i = num.length; i > 0 ; i--) {
	    	  flag=true;
	         for(j =0 ; j < i-1 ; j++) {
	        	 flag = false;
	            a++;
	            if(num[j]>num[j+1]) {
	               b++;
	               store = num[j];
	               num[j] = num[j+1];
	               num[j+1] = store;
	            }
	         }
	         if (flag) break;
	      }
	      // 정렬 후 출력
	      for(i =0; i < num.length; i++) {
	         System.out.print(num[i]+ " ");
	      }
	      System.out.println();
	      System.out.print(a + " ");
	      System.out.print(b + "");



	}
}
