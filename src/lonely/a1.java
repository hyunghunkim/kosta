package lonely;

import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sc = 0;
		System.out.println("현재 월을 입력해주세요:");
		sc = scanner.nextInt();

		switch (sc) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("봄임");

			break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("여름임");
			break;
		case 10:
		case 11:
			System.out.println("가을임");
			break;

		default:
			System.out.println("콜드");

			break;
		}
	}

}
