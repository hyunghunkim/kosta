package kosta.oop2;

public class Account {
	// 공통된 데이터 구조
	// 계좌번호,계좌주,잔액 = > 상태(특성) = > 멤버변수(필드)
	String accountNo;
	String ownerName;
	int balance;

	public Account() {
	}// 디폴트생성자 << 파라미터값이 아무것도 없는게 디폴트생성자
		// 파라미터값에 쓰지않고 아래처럼 사용할때도 에러가 안뜨게함
		// 디폴트생성자는 만들고 시작하는게 좋음!

	// 생성자
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	// 공통된 기능 => 행동(기능) => 멤버메서드(오퍼레이션)
	// 입금하다.출금하다.

	public void deposit(int amount) {
		balance += amount;
	}

	public int withdraw(int amount) throws Exception {
		if (balance < amount) {
			throw new Exception("잔액 부족"); // 예외처리를 던짐
		}
		balance -= amount;

		return amount;
	}

	public void print() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("계좌주: " + ownerName);
		System.out.println("잔액: " + balance);
	}
}
