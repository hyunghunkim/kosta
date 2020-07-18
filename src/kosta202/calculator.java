package kosta202;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		System.out.println("구구단");
		
		for (int score = 1; score < 10; score++) {
			
		
			for (int i = 1; i < 10; i++) {
				System.out.println(score+" x "+i+" = " + score*i);
			}
			
		}
	}
}


