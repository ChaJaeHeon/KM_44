package api;

public class RandomTest {
	
	public static void main(String[] args) {
	      int num[] = new int[6];
	      //1~45까지의 임의의 정수를 배열에 저장 (중복 불가)
	      //숫자 6개 생성
	      for(int i = 0; i < 6; i++) {
	         num[i] = ((int)(Math.random() *45+1));      
	         //중복번호제거
	         for(int j = 0 ; j<i; j++) {
	            if(num[i] == num[j] ) {
	               i--;
	               break;
	            }
	         }
	      }
	      System.out.println("로또번호");
	      System.out.print("[ ");
	      for(int i = 0; i < num.length; i++) {
	         System.out.print(num[i] + (i < num.length - 1 ? ", ": ""));
	         /*if (i < num.length - 1) {
	            System.out.print(", ");
	         }*/
	      }
	      System.out.println(" ]");
	      
	      
	      // 교환 정렬
	      int a = 0, b = 0;
	      
	      int store = 0;
	         for(int i = 0 ; i< num.length -1 ; i++) { //-1 안해도 j  = 6 6<6 되서 -1이 된다.
	            for(int j = i+1 ; j < num.length ; j++ ) {
	               a++;
	               if(num[i] > num[j] ) {
	                  b++;
	                  //교환
	                  store = num[i];
	                  num[i] = num[j];
	                  num [j] = store;
	               }
	            }
	         }
	         
	      //출력
	      System.out.print("[ ");
	      for(int i = 0; i < num.length; i++) {
	         System.out.print(num[i] + (i < num.length - 1 ? ", ": ""));
	         /*if (i < num.length - 1) {
	            System.out.print(", ");
	         }*/
	      }
	      
	      // 출력
	      System.out.print(" ]");
	      System.out.println();
	      System.out.println("비교:"+ a + ", 교환:" + b);
	      
	}
	
}



