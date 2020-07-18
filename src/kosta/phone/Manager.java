package kosta.phone;

import java.util.Scanner;

public class Manager {
	// 상태 : PhoneInfo[] arr
	// 헹동 : 추가,전체출력 기능 구현
	Scanner sc = new Scanner(System.in);
	PhoneInfo arr[];
	int i = 0;
	int count = 0;

	public Manager() {
		arr = new PhoneInfo[10];
	}

	public void addPhoneInfo() {
		// 이름,전화번호,생년월일 입력
		// 1.일반 2.동창(major,year) 3.직장(dept,position)
		// PhoneInfo객체 생성
		// 배열에 추가 => 인덱스 상수 > 변수증가
		System.out.print("1.일반등록 2.동창 3.직장동료 :");
		String manu = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();
		switch (manu) {
		case "1":
			// PhoneInfo al = new PhoneInfo(name, phoneNo, birth);
			// arr[i++] = al;
			arr[i++] = new PhoneInfo(name, phoneNo, birth); // 위에 두줄을 한줄로 함
			break;
		case "2":
			System.out.print("학과 : ");
			String major = sc.nextLine();
			System.out.print("학번 : ");
			String year = sc.nextLine();
			arr[i++] = new Major(name, phoneNo, birth, major, year);
			break;
		case "3":
			System.out.print("직장 : ");
			String dept = sc.nextLine();
			System.out.print("지위 : ");
			String position = sc.nextLine();
			arr[i++] = new Dept(name, phoneNo, birth, dept, position);
			break;

		default:
			break;
		}

	}

	public void listPhoneInfo() {
		// 배열에 있는 모든 PhoneInfo객체 출력
		// show()
		// 1.전체 2.동창(major,year) 3.직장(dept,position)
		System.out.println("1.전체출력 2.동창출력 3.직장출력");
		String manu = sc.nextLine();
		switch (manu) {
		case "1":
			for (int j = 0; j < i; j++) {
				arr[j].show();
			}
			break;
		case "2":
			for (int j = 0; j < i; j++) {
				if (arr[j] instanceof Major) {
					arr[j].show();
				}
			}
			break;
		case "3":
			for (int j = 0; j < i; j++) {
				if (arr[j] instanceof Dept) {
					arr[j].show();
				}
			}
			break;

		default:
			break;
		}

	}

	

	public void searchPhoneInfo() {
		// 이름의 전화번호내역을 검색되도록 한다.

		// System.out.println("이름을 검색 시 전화번호가 출력:"); // 내가 한거랑 아래랑 비교해서 뭘 모르는지
		// 체크
		// String name2 = sc.nextLine();
		// for(int k=0;k<i;k++){
		// if(arr[k].getName() == name2){
		// arr[k].show();
		//
		// }
		// }
		System.out.print("이름:");
		String name = sc.nextLine();
		int idx = -1;

		for (int j = 0; j < count; j++) {

			if (name.equals(arr[i].getName())) {
				arr[i].show();
				idx++;
			}
			if (idx == -1) {
				System.out.println("전화번호를 찾을 수 없습니다.");
			}

		}

	}// 서치메소드

	public void updatePhoneInfo() {
		System.out.print("이름:");
		String name = sc.nextLine();
		int idx = -1;

		for (int j = 0; j < i; j++) {
			PhoneInfo info = arr[i];
			if (name.equals(info.getName())) {
				System.out.println("수정할 번호:");
				String phoneNo = sc.nextLine();
				info.setPhoneNo(phoneNo);
				idx = i;
				break;
			}
			if (idx == -1) {
				System.out.println("전화번호를 찾을 수 없습니다.");
			}

		}

	}// 업데이트메소드

	public void deletePhoneInfo() {
		System.out.print("이름:");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = arr[i];
			if (name.equals(info.getName())) {
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
	}// 삭제 메소드
}
