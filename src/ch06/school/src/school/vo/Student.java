package school.vo;

public class Student extends Person {
	private int kor;
	private int eng;
	private int mat;

	// 생성자
	public Student() {
		super(); // 생략 가능ㅇ
	}

	public Student(String name, String id, String phone, int kor, int eng, int mat) {
		super(name, id, phone);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTotal() {
		int total = kor + eng + mat;
		return total;
	}

	public double getAverage() {
		double average = getTotal() / 3.0;
		return average;
	}

	public String getGrade() {
		String grade = null;
		if (getAverage() >= 90) {
			grade = "A";
		} else if (getAverage() >= 80) {
			grade = "B";
		} else if (getAverage() >= 70) {
			grade = "C";
		} else if (getAverage() >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade;
	}
	public String toString() {
		
		String s = super.toString() + " 국어: " + kor + " 영어: " + eng + " 수학: " + mat + " 평균: "+ getAverage() + " 등급: " + getGrade();
		return s;
	}
}
