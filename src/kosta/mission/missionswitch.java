package kosta.mission;

import java.util.Scanner;

public class missionswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor =0;
		int eng =0;
		int mat =0;

		
		
		
		
		System.out.print("국어점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		kor = scanner.nextInt();
		
		
		System.out.print("영어점수를 입력하세요.>");
		scanner = new Scanner(System.in);
		eng = scanner.nextInt();
		
		System.out.print("수학점수를 입력하세요.>");
		scanner = new Scanner(System.in);
		mat = scanner.nextInt();
		
		
		int sum = 0;
		int aver = 0;
		
		sum = kor+eng+mat;
		aver = (int)(sum/3.0);
		
//		if (aver >= 90) {
//			System.out.println("A");
//		}
//		else if (aver >= 80) {
//			System.out.println("B");
//		}
//		else {
//			System.out.println("C");
		
		switch(aver/10) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
			default:
				System.out.println("F");
		}
	}
		
				
		
			
		}
