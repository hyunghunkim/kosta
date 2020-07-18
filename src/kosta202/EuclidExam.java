package kosta202;

public class EuclidExam {
	
	static int gcd(int x,int y) {
		if(y == 0) {
			return x;
		}else {
			return gcd(y,x%y);
		}
	}

	public static void main(String[] args) {
		int x = 10;
		int y = 4;
		System.out.println("최대공약수 : "+gcd(x,y));
	}

}
