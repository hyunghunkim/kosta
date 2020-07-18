package kosta.oop;

public class Member {
	private String name;
	private int age;
	
//	public void setName(String name){   //세탈메소드?
//		this.name = name;
//	}
//	
//	public String getName(){
//		return name;
//	}
	public Member(){}         //소스 개터앤소스로 한번에 생성가능!

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
