package kosta.board;

import java.util.Date;

public class Board {
	private int id;
	private String title;
	private String createUser;
	private String body;
	private Date createTime;
	private int count;
	
	public Board(){
	}
	
	public void show(){
		System.out.println(id + "		" + title + "		" + createUser + "		" + createTime.toString() + "		" + count);
	}

	public Board(int id, String title, String createUser, String body){
		this.id = id;
		this.title = title;
		this.createUser = createUser;
		this.body = body;
		this.createTime = new Date();
		this.count = 0;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

		
}