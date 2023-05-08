package ch06.bank;

public class AccountTest {
	
	public static final String BANK_NO="123";
	public static final String AREA_NO="0025";

	public static void main(String[] args) {
		Account a1 = new Account(AccountIDGen.genAccID(BANK_NO, AREA_NO),"홍길동",500);    //클래스를 사용하기 위한 객체 생성
		deposit(a1, 1250);
		Account a2 = new Account(AccountIDGen.genAccID(BANK_NO, AREA_NO), "임꺽정",1500);
		transfer(a1, a2, 600);
	}

	public static void deposit(Account a, long amount) {
		a.deposit(amount);
		System.out.println("==========[입금]============");
		System.out.printf("%s 계좌에 %d원이 입금되었습니다.\n", a.getAccNo(), amount);
		System.out.printf("현재 잔고: %d원\n", a.getBalance());
		System.out.println("==========[입금]============");
	
	}
	public static void transfer(Account from, Account to, long amount) {
		if(from.transfer(amount , to)) {
			System.out.println("==========[이체]============");
			System.out.printf("%s계좌에서 %s계좌로 %d원이 이체되었습니다.\n", from.getAccNo(), to.getAccNo(), amount);
			System.out.printf("현재 잔고: %d원\n", from.getBalance());
			System.out.println("==========[입금]============");
		} else {
			System.out.println("잔고가 부족해서 이체를 실패했습니다.");
		}
		
		}
		
		
	}

