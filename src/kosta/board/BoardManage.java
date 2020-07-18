package kosta.board;

import java.util.Scanner;

public class BoardManage {
	
	Scanner sc = new Scanner(System.in);
	Board boards[];
	int index = 0;

	public BoardManage(){
		boards = new Board[100];
	}
	
	public void insert(){
		// 데이터 받기 스캐너로 데이터 받기
		// syso("이름 :")
		System.out.println("제목 : ");
		String title = sc.nextLine();
		System.out.println("내용 : ");
		String body = sc.nextLine();
		System.out.println("작성자 : ");
		String user = sc.nextLine();
		
		Board board = new Board(index, title, user, body);

//		board.setTitle("id");
//		board.setCount(0);
//		board.setCreateTime(new Date());
//		board.setId(index);
		boards[index] = board;
		index++;
	}
	public void list(){
		System.out.println("글번호		글제목		작성자		작성일시		조회수");
		for (int i = 0; i < index; i++) {
			Board board = boards[i];
			board.show();
		}
	}
	public void detail(){
		System.out.println("작성자 이름:");
		String creatUser2 = sc.nextLine();
		for (int i = 0; i <index; i++) {
			if (creatUser2.equals(boards[i].getCreateUser())) {
				System.out.println("제목:");
				String title = sc.nextLine();
				System.out.println("내용:");
				String body = sc.nextLine();
				
			}
			
		}
		
	}
}
