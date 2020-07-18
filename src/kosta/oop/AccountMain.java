package kosta.oop;

public class AccountMain {

	public static void main(String[] args) {
		
		
//		Account account = new Account("2222-2222", "김형준", 50000000); //객체생성,인스턴트   account에 새로운메모리주소값이 들어감!
//		account.accountNo = "11111-1111";
//		account.ownerName = "홍길동";
//		account.balance = 10000;
//		
//		account.deposit(3000);
//		account.print();
		
//		StringBuffer sb = new StringBuffer("444");
//		
//		account.accountNo = "11111-1112";
//		account.ownerName = "박길동";
//		account.balance = 200000;
//		
//		account.deposit(10000);
//		account.print();
		
		Account arr[] = {								//배열안에 객체를 넣어서 사용,타입(Account)은 객체타입
				new Account("111-111","홍길동",10000),
				new Account("222-222","박길동",500000)
		};
		try{
		arr[0].withdraw(14000);				//arr[0].withdraw 에러코드눌러서 츄라이캐치 불러올수있음!
		}catch(Exception e){
			System.out.println(e.getMessage());			//아래중 아무거나 사용하면 됨
			e.printStackTrace();
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
			
		}
	}

}
