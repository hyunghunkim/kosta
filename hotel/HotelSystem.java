package kosta.hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelSystem {
	static Client[] clientArr;
	static Room room;
//	Reservation re;
	static int i = 0;
	static List<Reservation> arrs;
//	Reservation arr[];

	Scanner sc;
	int index; // 배열 인덱스
	int reserveNo;
	int no = 100;

	public HotelSystem() {
		clientArr = new Client[10];
		sc = new Scanner(System.in);
		room = new Room();
		arrs = new ArrayList<>();
//		re = new Reservation();

	}

	public void dataInsert() {
		arrs.add(new Reservation(0, "ST", "0", "형준", "11"));
		arrs.add(new Reservation(1, "DR", "1", "형준1", "11"));
		arrs.add(new Reservation(2, "PR", "2", "형준2", "11"));
		arrs.add(new Reservation(3, "DR", "3", "형준3", "11"));
		arrs.add(new Reservation(4, "ST", "4", "형준4", "11"));
	}

	// 1.예약
	public void reserve() {
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();

		System.out.print("이름 입력 : ");
		String name = sc.nextLine();

		System.out.print("전화번호 입력 : ");
		String tel = sc.nextLine();

		clientArr[index++] = new Client(id, name, tel);

		room.roomList();
		System.out.print("객실 유형 선택 : ");
		String roomType = sc.nextLine();

		reserveNo++;
		System.out.println("예약번호 : " + reserveNo);

		// 예약정보를 저장
		arrs.add(new Reservation(reserveNo, roomType, id, name, tel));
//		arr[i++] = new Reservation(count, roomType, id, name, tel);

	}// section reserve()

	// 2.예약취소
	public void cancel() {

		System.out.print("취소할 예약번호 입력 : ");
		int reserveNo = sc.nextInt();

		for (Reservation a : arrs) {
			System.out.print("    " + a.getId());
		}
		System.out.println();

		arrs.remove(reserveNo);

		for (Reservation a : arrs) {
			System.out.print("    " + a.getId());
		}
		System.out.println();
	}// 캔슬메소드

	public void checkin() {
		System.out.println("예약번호를 입력하세요:");
		int reserveNo = sc.nextInt();
		for (Reservation i : arrs) {
			if (reserveNo == i.getNo()) {
				i.setIsCheck("yes");
				i.setRoomNo(no++);
			}
		}
	}

	public void checkout() {
		System.out.println("방번호를 입력하세요:");
		int roomNo = sc.nextInt();
		for (Reservation i : arrs) {
			if (roomNo == i.getRoomNo()) {
				i.setIsCheck("out");
				System.out.println(room.map.get(i.getRoomType()));
			}
		}
	}

}
