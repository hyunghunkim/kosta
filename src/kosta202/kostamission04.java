package kosta202;

import java.util.Scanner;

public class kostamission04 {

	public static void main(String[] args) {
		/*
			키보드로부터 id,pass 입력받아서
			id,pass 일치하면 =>로그인 성공
			id 불일치 => 해당 아이디가 존재하지 않습니다.
			pass불일치 => 비밀번호가 일치하지 않습니다.
		*/
		
		String m_id = "kosta";
		String m_pass = "1234";
		String msg = "";
		
		System.out.print("id : ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.nextLine();
		
		System.out.print("pass : ");
		String pass = scanner.nextLine();
		
		if(m_id.equals(id) && m_pass.equals(pass)) {
			msg = "로그인 성공";
		}else if(!m_id.equals(id)) {
			msg = "해당 아이디가 존재하지 않습니다";
		}else {
			msg = "비빌번호가 일치하지 않습니다";
		}
		
		System.out.println(msg);
			
	}
		
}