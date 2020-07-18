package kosta.oop2;

public class Checkingmain {

	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount("111-1111", "김형준",50000, "111-112");
		
	
		try {
			ca.pay("111-112", 4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ca.print();
	}

}
