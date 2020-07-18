package kosta.car;

public class CarInfomation {
	private String name;
	private String number;
	private String price;

	public CarInfomation() {
	}

	public CarInfomation(String name, String number, String price) {
		super();
		this.name = name;
		this.number = number;
		this.price = price;
	}

	public void show() {
		System.out.println("차이름 : " + name);
		System.out.println("차번호 : " + number);
		System.out.println("차가격 : " + price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
