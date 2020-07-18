package kosta202;

public class LoopExam {

	public static void main(String[] args) {
		int arr[] = new int[9];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=7*(i+1);
			System.out.println("7*"+(i+1)+"="+arr[i]);
			
		}
	}
}
