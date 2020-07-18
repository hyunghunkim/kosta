package kosta.phone;

import java.util.Scanner;

public class Major extends PhoneInfo {
	Scanner sc = new Scanner(System.in);
	private String major;
	private String year;

	public Major() {
	}

	public Major(String name, String phoneNo, String birth, String major, String year) {
		super(name, phoneNo, birth);
		this.major = major;
		this.year = year;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("학과:" + major + "학번:" + year);
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
