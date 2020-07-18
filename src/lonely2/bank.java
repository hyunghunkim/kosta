package lonely2;

public class bank {
	
	int balance;
	String name;
	String accountnum;
	
	public bank(){}
	
	public bank(int balance, String name, String accountnum) {
		super();
		this.balance = balance;
		this.name = name;
		this.accountnum = accountnum;
	}
	
	
	public void deposit(int account){
		balance += account;
		System.out.println("입금시 잔고:"+balance);
	}
	public int wihtdraw(int account){
		if(balance < account){
			System.out.println("잔액이 부족합니다.");
			System.out.println("현재잔엑:"+balance);
			return 0;
		}
		balance -= account;
		System.out.println("출금시 잔고:"+balance);
		return account;
	}

}
