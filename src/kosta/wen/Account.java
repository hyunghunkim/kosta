package kosta.api;

public class Account {
	// 공통된 데이터 구조 표현
	// 계좌번호, 계좌주, 잔액  ==> 상태(특성) : 멤버 변수(UML에선 필드)
	String accountNo;	// 멤버 변수는 초기화를 안해도 기본값이 들어가 있다.
	String ownerName;
	int balance;
	
	// 생성자
	public Account()	// 디폴트 생성자
	{
		
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;	// this.accountNo에서 this는 현재 객체, 즉 Account 클래스를 지칭한다.
		this.ownerName = ownerName;
		this.balance = balance;
		
	}
	
	
	// 공통된 기능 ==> 행동(기능) : 멤버 메서드 (UML에선 오퍼레이션)
	// 입금, 출금
	// 입금
	public void deposit(int amount) {
		balance += amount;
	}
	
	// 출금
	public int withdraw(int amount) throws Exception {
		if(balance < amount)
		{
			throw new Exception("잔액 부족");
		}
		else
		{
			balance -= amount;
		}
		
		return amount;
	}
	
	// 출력
	public void print() {
		System.out.println("계좌번호 : " +accountNo);
		System.out.println("계좌주    : " +ownerName);
		System.out.println("잔액       : " +balance);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Account))
		{
			return false;
		}
		
		Account acc = (Account)obj;
		
		if(accountNo == acc.accountNo)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
