package kosta202;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int sc = 0;
		do {
			System.out.println("2자리 숫자를 입력하세요.");
			sc = scanner.nextInt();
			
			
		} while (sc<10||sc>=100);
		System.out.println(sc);
	}	
			
}
