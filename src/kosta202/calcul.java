package kosta202;

import java.util.Scanner;

public class calcul {

	public static void main(String[] args) {
		int a = 0;
		String b = "";
		int c = 0;
		int d = 0;
		String msg = "";
		boolean check = true;
		while(check) {
			
		
			System.out.println("첫 번째 숫자를 입력해주세요. ");
			Scanner scanner = new Scanner(System.in);
			Scanner scanner1 = new Scanner(System.in);
			a = scanner.nextInt();
			System.out.println("사칙 연산을 입력하세요 ex.+,-,*,/");
			b = scanner1.nextLine();
			System.out.println("두번째 숫자를 입력해주세요. ");
			c = scanner.nextInt();
			
			if (b.equals("+")) {
				msg = a+"+"+c+"="+(a+c);
			}else if (b.equals("-")) {
				msg = a+"-"+c+"="+(a-c);
			}else if (b.equals("/")) {
				msg = a+"/"+c+"="+(a/c);
			}else {
				msg = a+"*"+c+"="+(a*c);
			}
			System.out.println(msg);
			
			System.out.println("계속 하실 건가요? Y or N"); 
			
			if(scanner1.nextLine().equalsIgnoreCase("N")) {
				check = false;
			}
			
		}
	}
		
				
		
}
