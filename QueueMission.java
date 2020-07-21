package kosta.data;

import java.util.LinkedList;
import java.util.Scanner;

public class QueueMission {
	static Scanner sc = new Scanner(System.in);
	static int totalSales = 0;	

	public static void main(String[] args) {
		
		//LinkedList<Order> list = new LinkedList<Order>();
		int idx = -1;
		
		while(true) {
			System.out.println("1. 주문요청  2. 주문처리 3. 매출액 총액 4. 종료");
			System.out.print("선택: ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				
				System.out.println("주문이 추가 되었습니다.");
				break;
			case "2":
				
				break;
			case "3":
				System.out.println("총매출액: " + totalSales);
				break;
			case "4":
				System.out.println("종료");
				return;
			}
		}

	}

}
