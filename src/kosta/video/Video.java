package kosta.video;

public class Video {

	public static void main(String[] args) {
//		VideoInfo v1 = new VideoInfo("1","반도","강동원");
//		VideoInfo v2 = new VideoInfo("2","살아있다","유아인");
		VideoInfo[] vrr = {
				new VideoInfo("1","반도","강동원"),
				new VideoInfo("2","살아있다","유아인")
		};
		
		IdInfo arr[] = {
				new IdInfo("a", "홍기동", "가산동"),
				new SpecialMember("b", "박길동", "강남", 100)
		};
		
		for(int i = 0;i<arr.length;i++){
			arr[i].setRentalVideo(vrr[i]);
			arr[i].ptintMember();
			System.out.println();
		}
		
//		IdInfo m = new IdInfo("a","홍길동","가산동");
//		m.setRentalVideo(v1);
//		SpecialMember sm = new SpecialMember("b","박길동","강남",100);
//		sm.setRentalVideo(v2);
		
//		sm.ptintMember();
//		sm.print(); //super로  sm.ptintMember(); 까지 같이 가져옴
		
//		m.ptintMember();
	}

}
