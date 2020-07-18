package kosta.video;

public class IdInfo {
	private String id;
	private String name;
	private String ad;
	private VideoInfo rentalVideo;
	
	public IdInfo(){}

	public IdInfo(String id, String name, String ad) {
		super();
		this.id = id;
		this.name = name;
		this.ad = ad;
	}
	public void ptintMember(){
		System.out.println("회원의 아이디:"+id);
		System.out.println("회원의 이름:"+name);
		System.out.println("회원의 주소"+ad);
		System.out.println("비디오 번호:"+rentalVideo.getNo());
		System.out.println("비디오 이름:"+rentalVideo.getTitle());
		System.out.println("비디오 주인공:"+rentalVideo.getAt());

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public VideoInfo getRentalVideo() {
		return rentalVideo;
	}

	public void setRentalVideo(VideoInfo rentalVideo) {
		this.rentalVideo = rentalVideo;
	}



	
	
	
	
}