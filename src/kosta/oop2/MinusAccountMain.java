package kosta.oop2;

public class MinusAccountMain {					//오버라이딩 메소드 호출

	public static void main(String[] args) {
		MinusAccount ma = new MinusAccount("1111", "김형준",10000, 10000);
		
		try {
			ma.withdraw(15000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ma.print();
	}

}
