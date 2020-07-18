package kosta.mission;

import java.util.Random;
import java.util.Scanner;

public class mission07 {

	public static void main(String[] args) {
		//up_Down Game 구현
		//임의의 난수를 1~100생성헤서
		//입력숫자와 비교해서 up/down 메세지를 출력하여
		//정답을 맞추는 게임
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		int r1 = r.nextInt(100)+1;
		int sc1 = 0;
		
		while (r1 != sc1) {
			System.out.print("1~100사이의 정수를 입력하세요: ");
			sc1=scanner.nextInt();
			if(sc1<r1) {
				System.out.println("UP!!");
			}else if(sc1>r1){
				System.out.println("DOWN!!");
			}
		}
		System.out.println("정답!!");
		
			
		
	
	}
	
	
}
