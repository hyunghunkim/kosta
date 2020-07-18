package kosta.oop6;

public class NoteBook implements Product {
	private String name;
	private int price;
	private double dc;
	
	public NoteBook(){}
		
	public NoteBook(String name, int price, double dc) {
		super();
		this.name = name;
		this.price = price;
		this.dc = dc;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public double getDc() {
		return dc;
	}

	@Override
	public void show() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
		System.out.println("할인율: " + (dc*100)+"%");		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setDc(double dc) {
		this.dc = dc;
	}

	
	
	

}
