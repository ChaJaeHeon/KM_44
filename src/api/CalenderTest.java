package api;

import java.util.Calendar;

//Calendar 클래스
public class CalenderTest {

   public static void main(String[] args) {
      Calendar c = Calendar.getInstance();
      System.out.println(c);
      
      int year = c.get(Calendar.YEAR);
      int month = c.get(Calendar.MONTH) + 1;
      int day = c.get(Calendar.DATE);
      int hour = c.get(Calendar.HOUR);
      int min = c.get(Calendar.MINUTE);
      int sec = c.get(Calendar.SECOND);
      int ampm = c.get(Calendar.AM_PM);
      int dayOf = c.get(Calendar.DAY_OF_WEEK);
      String yoil = null;
      
      switch(dayOf) {
      case 0:
         yoil = "토";
         break;
      case 1:
         yoil = "일";
         break;
      case 2:
         yoil = "월";
         break;
      case 3:
         yoil = "화";
         break;
      case 4:
         yoil = "수";
         break;
      case 5:
         yoil = "목";
         break;
      case 6:
         yoil = "금";
         break;
      }
      
      System.out.print(year + " ");
      System.out.print(month + " ");
      System.out.println(day);
      System.out.println(hour);
      System.out.println(min);
      
      String sAmpm = null;
      if(ampm == Calendar.AM) {
         sAmpm = "오전";
      }
      else {
         sAmpm = "오후";
      }
      
      //string을 int로 
      //2023년 4월 20일 목요일 오후 5시 42분 45초입니다.
      
      System.out.printf("%d년 %d월 %d일 %s요일 %s %d시 %d분 %d초입니다.",year, month+1, day,yoil,sAmpm, hour, min, sec );
      
      String names[] = {"일", "월 ", "화", "수","목","금","토"};
      String days = names[c.getMinimum(Calendar.DAY_OF_WEEK)-1];
      
 
      
   }

}