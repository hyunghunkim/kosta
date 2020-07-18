package kosta.mission;

import java.util.Scanner;

public class mission06 {

	public static void main(String[] args) {
		//2개의 정수를 입력받아 b-a 결과를 출력하자.
		//b>a가 되도록 입력 받음
		//1.do ~ while 
		//2.while(true) break;
		Scanner scanner = new Scanner(System.in);
		int a=0;
		int b=0;
		do {
			System.out.print("첫번째 정수를 입력하세요:");
			a = scanner.nextInt();
			System.out.print("두번째 정수를 입력하세요:");
			b = scanner.nextInt();
			
		} while (b<a);
			System.out.println("b-a = "+ (b-a));
			
			
	}

}
