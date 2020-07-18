package kosta.oop2;

public class CheckingAccount extends Account { // extends << 상속키워드
												// CheckingAccount:자식 Account:부모
	private String cardNo;						 // 지정하지않으면 자동으로 부모 디폴트생성자(만들어진)를 호풀

	public CheckingAccount() {
	}

	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);  //부모의 생성자 호출
		this.cardNo = cardNo;
	}

	public int pay(String cardNo, int amount) throws Exception { // pay 메서드 정의
		if (!cardNo.equals(this.cardNo) || balance < amount) {
			throw new Exception("결재 불능");
		}
		return withdraw(amount);
	}
}
