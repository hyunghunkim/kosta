package kosta.alogo;

public class BubbleSort {							//재귀함수를 이용한 버블정렬

	public static void main(String[] args) {
		int arr[]={3,6,2,8,4,1};
		printArray(arr);
		bubbleSort(arr, arr.length-1);
		System.out.println();
		printArray(arr);
	}
	
	public static void bubbleSort(int arr[],int last){
		if(last>0){
			for(int i=1;i<=last;i++){
				if(arr[i-1]>arr[i]){
					swap(arr,i-1,i);
				}
			}
			bubbleSort(arr,last-1);
		}
	}
	public static void swap(int arr[],int index1,int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	public static void printArray(int arr[]) {
		for(int data:arr) {
			System.out.print(data+",");
		}
	}
}
