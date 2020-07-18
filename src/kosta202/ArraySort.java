package kosta202;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		int arr[] = {5,1,4};
		Arrays.sort(arr);
		
//		for(int i = 0;i<arr.length;i++) {
//			System.out.println(arr[i]+",");
//			
//		}
//		System.out.println();
//		//1 4 5
//		//내림차순
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[(arr.length-1)-i]+",");
//		}
//		System.out.println();
//		
//		
		int arr2[][] = {{2,90},{1,60},{3,20}};
		Arrays.sort(arr2,new Comparator<int[]>() {
			//o2 - o1 =>내림차순
			//o1 - o2 =>오름차순
			//return o2[0] - o1[0]
			
			@Override
			public int compare(int[]o1,int[]o2) {
				if(o1[0]<o2[0]) {
					return-1; //자리를 바꾸지 마라
				}else if(o1[0]>o2[0]) {
					return 1;
				}else {
					return 0;
				}
			}
			
		});
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(arr2[i][j]+",");
			}
			System.out.println();
		}
		}
}
