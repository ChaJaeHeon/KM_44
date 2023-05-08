package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = 0;
		
	while(true) {
		System.out.println("국어점수 입력:");
		try {
			score = input.nextInt();
			if (score < 0 || score > 100) {
				throw new ScoreExeption();
			}
		}
		catch (InputMismatchException e) {
			System.out.println("숫자로 입력하세요.");
			input.nextLine();
			continue;
		}
		catch (ScoreExeption e) {
			e.printStackTrace();
			continue;
		}
		break;
	}	
	System.out.println(score);
	}

}
