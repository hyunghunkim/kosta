package kosta.car;

import java.util.Scanner;

public class CarBrand extends CarInfomation {
	Scanner sc = new Scanner(System.in);
	private String carbrand;

	public CarBrand() {
	}

	public CarBrand(String name, String number, String price, String carbrand) {
		super(name, number, price);
		this.carbrand = carbrand;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("차 브랜드 : " + carbrand);
	}

	public String getCarbrand() {
		return carbrand;
	}

	public void setCarbrand(String carbrand) {
		this.carbrand = carbrand;
	}

}
