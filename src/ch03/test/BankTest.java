package ch03.test;

public class BankTest {

	public static void main(String[] args) {
		Account a1 = new Account("11-11", "홍길동", 500);
		a1.printAccountInfo();
		a1.deposit(300);
		System.out.println("a1 계좌에 300입금");
		a1.printAccountInfo();
		a1.withdraw(200);
		System.out.println("a1 계좌에 200 출금");
		a1.printAccountInfo();
		a1.getBalance();
		System.out.println("계좌조회");
		a1.printAccountInfo();

	}

}
