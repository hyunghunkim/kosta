package kosta.car;

import java.util.Scanner;

public class CarMian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();

		while (true) {
			System.out.println("1.차등록 2.소유한차확인 3.검색 4.매각 5.종료");
			System.out.print("선택:");
			String manu = sc.nextLine();

			switch (manu) {
			case "1":
				m.addCarInfomation();
				break;
			case "2":
				m.ownCar();
				break;
			case "3":
				m.searchCar();
				break;
			case "4":
				m.deleteCarInfomation();
				break;
			case "5":
				System.out.println("시스템을 종료합니다.");
				return;

			}
		}

	}

}
