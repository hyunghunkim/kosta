package kosta202;

import java.util.Scanner;

public class Fibonacci {
	public static int recur(int n) {
		if(n>=2) {
			return recur(n-1) + recur(n-2);
		}else {
			return n;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수:");
		int n = sc.nextInt();
		
		System.out.println(recur(n));
	}

}
