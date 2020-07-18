package kosta.lonely3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Pattern p = Pattern.compile("^01[016789]\\d{3,4}\\d{4}$");
		Pattern p2 = Pattern.compile("^01[016789]-\\d{3,4}-\\d{4}$");
		
		
		while (true) {
			System.out.println("핸드폰 번호를 입력하세요.");
			String ac = sc.nextLine();
			Matcher m1 = p.matcher(ac);
			Matcher m2 = p2.matcher(ac);

			if(m1.find()) {
				System.out.println("막힘");
				break;
			} else if (m2.find()) {
				System.out.println(ac);
				break;
			}
			
		}
	}

}
