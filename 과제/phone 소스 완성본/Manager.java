package kosta.phone;

import java.util.Scanner;

public class Manager {
	//상태 : PhoneInfo[] arr
	//행동 : 추가, 전체출력 기능 구현
	
	PhoneInfo arr[];
	int count;
	Scanner sc = new Scanner(System.in);
	
	public Manager() {
		arr = new PhoneInfo[10];
	}
	
	public void addPhoneInfo() {
		//이름, 전화번호, 생년월일 입력
		//1.일반 2.동창(major, year) 3.직장(dept, position)
		System.out.println("1.일반 2.동창 3.직장");
		String menu = sc.nextLine();
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일: ");
		String birth = sc.nextLine();
		
		switch (menu) {
		case "1":
			arr[count++] = new PhoneInfo(name, phoneNo, birth);
			break;
		case "2":
			System.out.print("학과: ");
			String major = sc.nextLine();
			System.out.print("학번: ");
			String year = sc.nextLine();
			arr[count++] = new Universe(name, phoneNo, birth, major, year);
			break;
		case "3":
			System.out.print("부서: ");
			String dept = sc.nextLine();
			System.out.print("직책: ");
			String position = sc.nextLine();
			arr[count++] = new Company(name, phoneNo, birth, dept, position);
			break;

		}
		
		
		//PhoneInfo객체 생성
		//PhoneInfo info = new PhoneInfo(name, phoneNo, birth);
		//배열에 추가 => 인덱스 상수=> 변수증가 
		//arr[count++] = info;
		//arr[count++] = new PhoneInfo(name, phoneNo, birth);
	}
	
	public void listPhoneInfo() {
		//배열에 있는 모든 PhoneInfo객체 출력
		//show()
		//1.전체 2.동창(major, year) 3.직장(dept, position)
		System.out.println("1.전체 2.동창 3.직장");
		String menu = sc.nextLine();
		
		for(int i=0;i<count;i++) {
			if(menu.equals("1") && arr[i] instanceof PhoneInfo) {
				arr[i].show();
			}
			
			if(menu.equals("2") && arr[i] instanceof Universe) {
				arr[i].show();
				Universe uni = (Universe)arr[i];//casting 필용
				uni.show2();
			}else if(menu.equals("3") && arr[i] instanceof Company) {
				arr[i].show();
			}
		}		
	}

	public void searchPhoneInfo() {
		//이름의 전화번호내역이 검색되도록 한다.
		System.out.print("이름: ");
		String name = sc.nextLine();
		int idx = -1;
		
		for(int i=0;i<count;i++) {
			PhoneInfo info = arr[i];
			if(name.equals(info.getName())){
				info.show();
				idx = i;
			}
		}
				
		if(idx == -1) {
			System.out.println("찾을 수 없습니다.");
		}
		
	}

	public void updatePhoneInfo() {
		System.out.print("이름: ");
		String name = sc.nextLine();
		int idx = -1;
		
		for(int i=0;i<count;i++) {
			PhoneInfo info = arr[i];
			if(name.equals(info.getName())){
				System.out.print("수정 전화번호 입력: ");
				String phoneNo = sc.nextLine();
				info.setPhoneNo(phoneNo);
				idx = i;
				break;
			}
		}
				
		if(idx == -1) {
			System.out.println("찾을 수 없습니다.");
		}
		
	}

	public void deletePhoneInfo() {
		System.out.print("이름: ");
		String name = sc.nextLine();
		int idx = -1;
		
		for(int i=0;i<count;i++) {
			PhoneInfo info = arr[i];
			if(name.equals(info.getName())) {
				idx = i;
				break;
			}
		}
		
		if(idx != -1) {
			for(int i=idx;i<count-1;i++) {
				arr[i] = arr[i+1];
			}
			
			arr[count-1] = null;
			count--;		
		}else {
			System.out.println("찾을 수 없습니다.");
		}
	}
}






















