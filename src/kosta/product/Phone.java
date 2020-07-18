package kosta.product;

public class Phone implements Product {
	String name;
	int price;
	double dc;

	public Phone() {
	}

	public Phone(String name, int price, double dc) {
		super();
		this.name = name;
		this.price = price;
		this.dc = dc;
	}

	public void show() {
		System.out.println("상품이름 : " + name);
		System.out.println("상품가격 : " + price);
		System.out.println("할인률 : " + dc);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDc() {
		return dc;
	}

	public void setDc(double dc) {
		this.dc = dc;
	}

}
