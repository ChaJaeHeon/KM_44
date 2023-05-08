package ch06.bank;

public class Account {
	
	private String accNo; //계좌번호,멤버변수
	private String customer; //고객이름,멤버변수
	private long balance; //잔고,멤버변수
	
	
	public Account(String accNo, String customer, long balance) {
		this.accNo = accNo;
		this.customer = customer;
		this.balance = balance;
	}
	
	public Account(String accNo, String customer) {
		this(accNo, customer, 0);
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getAccNo() {
		return accNo;
	}

	public long getBalance() {
		return balance;
	}
	
	//입금
	public void deposit(long amount) {
		balance  += amount;
	}
	
	//출금
	public boolean withdraw(long amount) {
		boolean result= false;
		if (balance >= amount) {
			balance -= amount;
			result = true;
		}
		return result;
	}
	
	//이체, 클래스가 
	public boolean transfer(long amount, Account target) {
		boolean result=false;
		if (balance >= amount) {
			balance -= amount;
			target.deposit(amount);
			result = true;
		}
		return result;
	}
	
	public void printAccInfo() {
		System.out.printf("계좌번호: %s , 계좌주: %s, 잔고:%d\n",accNo, customer, balance);
	}
}
