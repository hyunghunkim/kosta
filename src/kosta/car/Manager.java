package kosta.car;

import java.util.ArrayList;
import java.util.Scanner;

import kosta.phone.Dept;
import kosta.phone.Major;
import kosta.phone.PhoneInfo;

public class Manager {
	Scanner sc = new Scanner(System.in);
	CarInfomation arr[];
	int count = 0;

	public Manager() {
		arr = new CarInfomation[10];
	}

	public void addCarInfomation() {
		System.out.println("1.국내차 2.외제차");
		System.out.print("입력 : ");
		String manu = sc.nextLine();
		System.out.print("차이름 : ");
		String name = sc.nextLine();
		System.out.print("차번호 : ");
		String number = sc.nextLine();
		System.out.print("차가격 : ");
		String price = sc.nextLine();
		switch (manu) {
		case "1":
			arr[count++] = new CarInfomation(name, number, price);
			break;
		case "2":
			System.out.print("브랜드 이름 : ");
			String carbrand = sc.nextLine();
			arr[count++] = new CarBrand(name, number, price, carbrand);
			break;

		default:
			break;
		}

	}// 등록메서드

	public void ownCar() {
		System.out.println("1.전체확인 2.외제차량확인");
		System.out.print("입력 : ");
		String manu = sc.nextLine();
		switch (manu) {
		case "1":
			for (int j = 0; j < count; j++) {
				arr[j].show();
			}
			break;
		case "2":
			for (int j = 0; j < count; j++) {
				if (arr[j] instanceof CarBrand) {
					arr[j].show();
				}
			}
			break;
		default:
			break;
		}
	}// 소유메서드

	public void searchCar() {
		System.out.print("차번호 : ");
		String name = sc.nextLine();
		int idx = -1;

		for (int j = 0; j < count; j++) {

			if (name.equals(arr[j].getNumber())) {
				arr[j].show();
				idx++;
			}
			if (idx == -1) {
				System.out.println("자동차를 찾을 수 없습니다.");
			}

		}
	}// 서치메서드

	public void deleteCarInfomation() {
		System.out.println("1.국내차 매각 2.외제차 매각");
		System.out.print("입력 : ");
		String manu = sc.nextLine();
		int idx = -1;
		switch (manu) {
		case "1":
			for (int i = 0; i < count; i++) {
				if (!(arr[i] instanceof CarBrand)) {
					idx = i;
					break;
				}
			}

			if (idx != -1) {
				for (int i = idx; i < count - 1; i++) {
					arr[i] = arr[i + 1];

				}
			}
			arr[count - 1] = null;
			count--;
			break;
		case "2":
			for (int i = 0; i < count; i++) {
				if (arr[i] instanceof CarBrand) {
					idx = i;
					break;
				}
			}

			if (idx != -1) {
				for (int i = idx; i < count - 1; i++) {
					arr[i] = arr[i + 1];

				}
			}
			arr[count - 1] = null;
			count--;
			break;

		default:
			break;
		}
	}//삭제 메서드
	

}// 클래스
