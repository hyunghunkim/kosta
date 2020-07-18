package kosta.oop6;

import java.util.Scanner;

public class Main {
	
	public static void showProduct(Product[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(i +"번째 상품");
			arr[i].show();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();
		
		Product arr[] = {
				new Phone("갤럭시S7", 500000, 0.1),
				new Phone("갤럭시S8", 900000, 0.15),
				new NoteBook("삼성노트북", 1200000, 0.20)
		};
		
		while(true){
			System.out.println("1.제품구매 2.주문목록  3.종료");
			System.out.print("선택: ");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				showProduct(arr);
				System.out.print("입력: ");
				int idx = Integer.parseInt(sc.nextLine());					
				cart.addCart(arr[idx]);
				break;
			case "2":
				cart.orderList();
				break;
			case "3":
				return;

			}
		}

	}

}











