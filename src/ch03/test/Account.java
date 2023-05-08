package ch03.test;

public class Account {
	String accNo; //계좌번호
	String owner; //예금주
	long balance; // 잔고
	
	//생성자
	public Account(String accNo, String owner, long balance) {
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}
	

	//입금
	public void deposit(long amount) {
		balance += amount;
	}
	
	//잔고조회
	public long getBalance() {
		return balance;
	}
	
	//출금
	public void withdraw(long amount) {
		balance -= amount;
	}
	
	//계좌정보 출력
	public void printAccountInfo() {
		System.out.println("계좌번호: "+accNo);
		System.out.println("예금주: "+owner);
		System.out.println("잔고: "+balance);
	}
}
