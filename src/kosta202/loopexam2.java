package kosta202;

import java.util.Scanner;

public class loopexam2 {

	public static void main(String[] args) {
//		for (int i = 2; i < 10; i++) {
//			System.out.println("* "+i+"단");
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i+" * "+j+" = "+i*j);
//			}
//		}
//		
//		int count = 0;
//	for (int i = 0; i < 16; i++) {		
//		for (int j = 0; j < 13; j++) {
//			if (4*i+5*j == 60) {
//				count++;
//			}	
//		}
//	}
//	System.out.println(count);
//		for (int i = 5; i >0; i--) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}
//		
		Scanner scanner = new Scanner(System.in);
		int sc = 0;
		System.out.print("정수를 입력하세요 : ");
		sc = scanner.nextInt();
		for (int i = 0; i <= sc; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
