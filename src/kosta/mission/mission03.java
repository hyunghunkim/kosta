package kosta.mission;

public class mission03 {

	public static void main(String[] args) {
		// 임의의 정수값에 대해서 전체 자리수 중 짝수,홀수 개수를 구하자.
		// 5자리 ex)35329
		// 짝수의 수 :1
		// 홀수의 수 :4

		int num = 0;
		int a = 0;
		int b = 0;

		num = 35329;

		a = num % 2 + num / 10 % 2 + num / 100 % 2 + num / 1000 % 2 + num / 10000 % 2;
		b = 5 - a;

		System.out.println("홀수의수 : " + a);
		System.out.println("짝수의수 : " + b);

	}

}
