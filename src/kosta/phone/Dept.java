package kosta.phone;

import java.util.Scanner;

public class Dept extends PhoneInfo {
	Scanner sc = new Scanner(System.in);
	private String dept;
	private String position;

	public Dept() {
	}

	public Dept(String name, String phoneNo, String birth, String dept, String position) {
		super(name, phoneNo, birth);
		this.dept = dept;
		this.position = position;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("직장:" + dept + "직위:" + position);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
