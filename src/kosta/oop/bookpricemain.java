package kosta.oop;

public class bookpricemain {

	public static void main(String[] args) {
		int total = 0;
		
		bookprice[] arr ={new bookprice("java", 10000)};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].discount();
			arr[i].printBook();
			total +=arr[i].dc_price;
		}
		System.out.println("총금액 : "+total);
	}

}
