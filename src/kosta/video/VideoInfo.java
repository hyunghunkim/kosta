package kosta.video;

public class VideoInfo {
	private String no;
	private String title;
	private String at;
	
	public VideoInfo(){}
	
	
	public VideoInfo(String no, String title, String at) {
		super();
		this.no = no;
		this.title = title;
		this.at = at;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAt() {
		return at;
	}
	public void setAt(String at) {
		this.at = at;
	}

	
	
}

