package kosta.api;

public class Ex_1 {

	public static void main(String[] args) {
		Account account = new Account("1111-1111", "홍길동", 5000);
		Account account2 = new Account("1111-1111", "홍길동", 5000);
		
		if(account.equals(account2))
		{
			System.out.println("같다");		// Account 클래스에 오버라이딩한 equals()를 사용할 경우 출력값
		}
		else
		{
			System.out.println("다르다");		// Object 클래스의 equals()를 사용할 경우 출력값
		}
		
		
	}

	

}// class 
