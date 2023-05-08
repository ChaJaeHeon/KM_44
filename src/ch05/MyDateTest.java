package ch05;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date = new MyDate(2023, 4, 28);
		MyDate date2 = new MyDate(2023, 2, 29);
		if(date.isValid()) {
			System.out.println("유효한 날짜입니다.");
		} else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
		if(date2.isValid()) {
			System.out.println("유효한 날짜입니다.");
		} else {
			System.out.println("유효하지 않은 날짜입니다.");
		}

	}

}
