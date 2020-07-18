package kosta.board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		// 1글쓰기,2전체출력,3글세부조회,4수정/삭제,5검색(제목,작성자)내가원하는글들만출력
		// 6정렬 :최근 입력 순서(내림차순),7댓글 : 글세부기능 => 댓글쓰기 , 해당 글세부보기 => 댓글 목록
		Scanner sc = new Scanner(System.in);
		BoardManage boardManage = new BoardManage();
		
		while(true){
			System.out.println("원하는 메뉴 선택");
			System.out.println("1.글쓰기 2.전체출력 3.글세부조회 4.수정/삭제 5.검색 6.정렬 7.댓글 8.종료");
			String manu = sc.nextLine();
			
			switch (manu) {
			case "1":
				boardManage.insert();
				break;
			case "2":
				 boardManage.list();
				break;
			case "3":
				// boardManager.detail();
				break;
			case "4":
				// boardManager.edit();
				// boardManager.delete();
				break;
			case "5":
				// boardManager.listByCondition(String query);
				break;
			case "6":
				
				break;
			case "7":
				
				break;
			case "8":
				
				break;

			default:
				break;
			}
		}
		
	}

}
