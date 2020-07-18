package kosta.baseball;
//package kosta.baseball;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Baseball {
//	public static void main(String[] args) {
//	Random rd = new Random();
//	Scanner sc = new Scanner(System.in);
//
//	int arr[] = {rd.nextInt(9)+1,rd.nextInt(9)+1,rd.nextInt(9)+1};
//	int srr[] = new int[3];
//	int strike,ball,count=0;
//	
//	System.out.println("숫자입력:");
//	String str = sc.nextLine();
//	srr[0] = Integer.parseInt(str.substring(0, 1));
//	srr[1] = Integer.parseInt(str.substring(1, 2));
//	srr[2] = Integer.parseInt(str.substring(2, 3));
//	
//	while(true){
//	for (int i = 0; i < 3; i++) {
//		for (int j = 0; j < 3; j++) {
//			if(i==j){
//				if(arr[i]==srr[j]){
//					strike++;
//				}
//			}else if(i!=j){
//				if(arr[i]==srr[j]){
//					ball++;
//				}
//			}
//			}
//		}
//
//	
//	}//와일문
//	}//메인
//	
//}//클래스
