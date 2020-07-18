package kosta202;

import java.util.Arrays;

public class array1 {

	public static void main(String[] args) {
		String oldarr[]=new String[3];
		oldarr[0]="10";
		oldarr[1]="20";
		
		String newarr[]=new String[2];
		
		System.arraycopy(oldarr, 0, newarr,0, newarr.length);
		System.out.println(Arrays.toString(newarr));
		
	}

}
