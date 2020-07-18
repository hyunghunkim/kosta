package kosta202;

public class arrayexam2 {

	public static void main(String[] args) {
		int arr[][]; //2차원 배열 선언
		arr = new int [3][2]; //2차원 배열 생성
		
		//2차원배열의 크기를 상이하게 생성
		
		int arr3[][]= {{1,2},{3,4,5},{6,7,8,9}};
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j]+",");
				
			}
			
		}
	}

}
