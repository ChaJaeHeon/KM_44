package exception;

// Exception을 상속 받아야함 
public class ScoreExeption extends Exception  {
	public ScoreExeption() {
		super("점수가 범위를 벗어남");
		//상위 생성자를 생성해서 오류 메세지 옆에 추가 가능
	}
	
}
