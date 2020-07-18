package kosta.test;

import java.util.Random;

public class test01 {

	public static void main(String[] args) {
		//최대값,최소값 구하기
		//스왑구현(12<==>34)
		
		int score[] = {23,63,12,99,34,87,22};
		int max = score[0];
		int min = score[0];
		int emp = 0;
		Random r = new Random();
	
//		for (int i = 1; i < score.length; i++) {
//			if (max < score[i]) {
//				max = score[i];
//			}else if(min > score[i]) {
//				min = score[i];
//			}
//		}
//		System.out.println("최대값 : "+max);
//		System.out.println("최소값 : "+min);	
		for (int i = 0; i < 10; i++) {
			int n1 = r.nextInt(7);
			int n2 = r.nextInt(7);
			emp = score[n1];
			score[n1] = score[n2];
			score[n2] = emp;
			}
		for (int j = 0; j < score.length; j++) {
				System.out.println(score[j]);
			
			}
	}
}
