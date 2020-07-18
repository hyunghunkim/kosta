package kosta202;

import java.util.Scanner;

public class arrayexam3 {

	public static void main(String[] args) {
		//이름 국어 영어 수학 총점 평균
		//학생1 00 00  00  00  00
		//학생2 00 00  00  00  00
		//학생3 00 00  00  00  00
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int [2][5];
		String subjects[] = {"국어","영어","수힉","총점","평균"};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("학생"+(i+1)+subjects[j]+"입력");
				arr[i][j]=sc.nextInt();
				arr[i][3] +=arr[i][j];
			}
			arr[i][4] = arr[i][3]/3;
		}
		
		
		//출력
		for(String s:subjects) {
			System.out.print(s+"\t");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
	}

}
