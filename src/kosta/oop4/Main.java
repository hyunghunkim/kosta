package kosta.oop4;

public class Main {

	public static void main(String[] args) {
		Work w = new Work();
		Driver d = new Driver();
		
		Work2 w2 = new Work2();
		Driver2 d2 = new Driver2();
		
		Person p = new Person("홍길동",w);
		p.setRole(d);
		p.doIt();

	}

}
