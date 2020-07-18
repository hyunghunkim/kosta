package kosta.phone;

public class Universe extends PhoneInfo {
	private String major;
	private String year;
	
	public Universe() {}
	
	public Universe(String name, String phoneNo, String birth, String major, String year) {
		super(name, phoneNo, birth);
		this.major = major;
		this.year = year;
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
	
	public void show2() {
		System.out.println(major + " : " + year);
	}

	@Override
	public void show() {		
		super.show();
		System.out.println("학과: " +  major);
		System.out.println("학번: " +  year);
	}
	
	
}










