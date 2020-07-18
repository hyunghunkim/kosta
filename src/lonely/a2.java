package lonely;

import java.util.Scanner;

public class a2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strr[] = { "국어", "영어", "수학", "총점", "평균" };
		int arr[][] = new int[2][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("학생" + (i + 1) + strr[j] + "입력: ");
				arr[i][j] = scanner.nextInt();
				arr[i][3] += arr[i][j];

			}
			arr[i][4] = arr[i][3] / 3;

		}

		// //정렬(평균을 기준으로 오름/내림)
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr.length; j++) {
		//
		// }
		//
		//
		//
		// }
		for (String s : strr) {
			System.out.print(s + "\t");
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
