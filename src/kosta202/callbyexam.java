package kosta202;

public class callbyexam {
	
	public static int change(int num) {
		num += 100;
		return num;
	}
	public static void change2(int arr[]) {
		arr[0] = 300;
	}
	public static boolean equals(int num1[],int num2[]) {
		if (num1.length != num2.length) {
			return false;
		}
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] != num2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
//		//Call By Value : 값에 의한 호출
//		int num = 100;
//		num = change(num);
//		System.out.println(num);
//		//Call By Reference:주소값에 의한 호출
//		int arr[]= {10};
//		
//		change2(arr);
//		System.out.println(arr[0]);
		int num1[]= {1,2,3,4,5};
		int num2[]= {1,2,3,4,5,6};
		
		if(equals(num1,num2)) {
			System.out.println("서로같다");
		}else {
			System.out.println("서로 다르다");
		}
		
	}

}
