package kosta.alogo;

import java.util.Scanner;

public class Gaelregeu {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 StringBuffer sb = new StringBuffer();
		 
		 for (int i = 0; i < t; i++) {
			sb.append("#"+i+" "+deep(sc.nextInt(), sc.nextInt(), 0));
			sb.append("\n");
		}
		 System.out.println(sb);
	}
	
	public static int deep(int a,int b,int day){
		if(b>a){
			return day;
		}else {	
			return deep(a*2,b*3,day+1);
		}
	}
	

}

//3     입력
//7 1
//8 3
//4 4
