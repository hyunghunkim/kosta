package kosta.mission;

import java.util.Scanner;

public class mission08 {

	public static void main(String[] args) {
		//메뉴를 선택해서 해당 메뉴의 명령을 실행하자.
		//1.추가 2.출력.3검색4.종료
		//String 배열을 생성
		//입력 :1
		//배열에 데이터 추가
		//입력 :2
		//배열에 있는 모든 데이터출력
		//입력 :3
		//인덱스:2
		//해당 인덱스의 배열내용을 출력
		//입력 :4 종료 
		//힌트:swith문
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		String arr[] = {"","","","","","",""};
		String str = "";
		int i = 0;
		boolean tr = true;
		
		while(tr) {
			System.out.print("1추가,2출력,3검색,4종료 원하는 메뉴의 번호를 적으세요>");
			int sc = scanner.nextInt();
			if(sc != 4) {
				switch (sc) {
					case 1:
					System.out.print("배열에 추가할 데이터를 입력하세요>");
					str = scanner1.nextLine();
					arr[i] = str;
					i++;
					break;
					case 2:	
						for (int j = 0; j < i; j++) {
							System.out.print(arr[j]+",");
						}
						System.out.println();
					break;
					case 3:
					System.out.println("인덱스 : "+i);
					break;
					
					}
				}else {
					System.out.println("종료합니다.");
					break;
				}
		}
		
	}

}
