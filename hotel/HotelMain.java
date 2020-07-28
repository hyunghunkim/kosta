package kosta.hotel;

import java.util.Scanner;

public class HotelMain {

	public static void main(String[] args) {
		HotelSystem hs = new HotelSystem();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("=======호텔 예약 시스템 v1.0=======");
			System.out.println();
			System.out.println("================================================================================================================");
			System.out.println("예약번호					방번호				이름					번호					타입					체크");
			System.out.println("---------------------------------------------");
			for(Reservation a : hs.arrs) {
				System.out.print(a.getNo() + "					");
				System.out.print(a.getRoomNo() + "					");
				System.out.print(a.getName() + "					");
				System.out.print(a.getTel() + "					");
				System.out.println(a.getRoomType() + "					");
				System.out.println(a.getIsCheck() + "					");
			}
			System.out.println("================================================================================================================");
			System.out.println();
			System.out.println("1.예약  2.예약취소  3.체크인  4.체크아웃  5.수납  6.종료");
			System.out.println("선택 : ");
			String menu = sc.nextLine();
			
			switch(menu)
			{
			case "1":
				hs.reserve();
				break;
			case "2":
				hs.cancel();
				break;
			case "3":
				hs.checkin();
				break;
			case "4":
				hs.checkout();
				break;
			case "5":
				break;
			case "6":
				break;
			case "7":
				hs.dataInsert();
				break;
			}// section switch-case
			
		}// section while
		
	}// section main()

}// section class
