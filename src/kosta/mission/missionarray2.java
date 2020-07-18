package kosta.mission;

import java.util.Scanner;

public class missionarray2 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			
		System.out.println("국어 점수를 입력하세요:");
		arr[0] = scanner.nextInt();
		System.out.println("영어 점수를 입력하세요:");
		arr[1] = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요:");
		arr[2] = scanner.nextInt();
		arr[3] = arr[0]+arr[1]+arr[2];
		
		System.out.println(arr[3]);
		}			
	}
}
	