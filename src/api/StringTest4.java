package api;

import java.util.Calendar;
import java.util.Scanner;

public class StringTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar current = Calendar.getInstance();
		
		
		while (true) {
			System.out.println("주민등록번호를 입력하세요: ");
			String id = sc.next();
			
			String k = id.substring(0, 2);
			int byear = Integer.parseInt(k);
			
			//글자수 확인
			if(id.length()!=14) {
				System.out.println("* 글자수를 확인하세요.");
				continue;
			}
			//-확인
			if(id.indexOf('-')!=6) {
				System.out.println("* '-'로 구분되어야 합니다.");
				continue;
			}
			//월확인
			String month = id.substring(2, 4);
			int mon = Integer.parseInt(month);
			if(mon>12 || mon<1) {
				System.out.println("* 월은 1~12로 입력하세요.");
				continue;
			}
			//성별확인
			String male = id.substring(7, 8);
			int male2 = Integer.parseInt(male);
			String l = "";
			if(male2>4) {
				System.out.println("* 성별을 확인하세요.");
				continue;
			}
			switch (male2) {
			case 1: case 3:
				l="남성";
				break;

			case 2 : case 4:
				l="여성";
				break;
			}
			//일 확인
			int maxDays=0; 
			String i = id.substring(7, 8);
			int sex = Integer.parseInt(i);
			String t = id.substring(0, 2);
			int years = Integer.parseInt(t);
			int year = 0;
			String month2 = id.substring(2, 3);
			int mon2 = Integer.parseInt(month);
			if(sex<=2) {
				year=1900+years;
			}
			else {
				year=2000+years;
			}
			
			int maxDays1=0; 
			switch(mon2){
				case 1 : case 3 : case 5 : case 7 : case 8: case 9 : case 10 : case 12:
					maxDays1 = 31;
					break;
				case 4 : case 6 : case 11:
					maxDays1 = 30;
					break;
				case 2 :
					if((year%4==0 && year%100!=0)||year%400==9)
						maxDays1 = 28;
					else
						maxDays1 = 29;
					break;
			}
			String j = id.substring(4, 6);
			int day = Integer.parseInt(j);
			if(day>maxDays1) {
				System.out.println("* 일 오류입니다. 다시입력해주세요.");
				continue;
			}
			String x = "";
			switch (male2) {
			case 1: case 3:
			    x = "남성";
				break;
			case 2 : case 4:
				x= "여성";
				break;
			}	
			//만나이 계산
			int currentYear=current.get(Calendar.YEAR);
			int currentMon=current.get(Calendar.MONTH)+1;
			int currentDay=current.get(Calendar.DAY_OF_MONTH);
			int age = currentYear - year;
			if(mon2*100+day>currentMon*100+currentDay) {
				age--;
			}
			System.out.println(byear+"년 "+mon2+"월 "+day+"일생 만 "+age+"세"+l+"입니다.");	
			break;	
			}
	
		
		
		}
	}

	
		
		


