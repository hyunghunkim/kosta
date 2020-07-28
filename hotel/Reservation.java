package kosta.hotel;

public class Reservation {
	private int no;
	private String roomType;
	private String id;
	private String name;
	private String tel;
	private String isCheck;
	private int roomNo = 0;
	
	
	
	public int getRoomNo() {
		return roomNo;
	}


	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}


	public Reservation(int roomNo) {
		super();
		this.roomNo = roomNo;
	}


	public Reservation(int no, String roomType, String id, String name, String tel, String isCheck, int roomNo) {
		super();
		this.no = no;
		this.roomType = roomType;
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.isCheck = isCheck;
		this.roomNo = roomNo;
	}


	public Reservation(Reservation arr) {}


	public Reservation(int no, String roomType, String id, String name, String tel) {
		this.no = no;
		this.roomType = roomType;
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.isCheck = "No";
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
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


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getIsCheck() {
		return isCheck;
	}


	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}
	
	

}
