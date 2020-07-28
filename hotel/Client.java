package kosta.hotel;

import java.util.Scanner;

public class Client {
	private String id;
	private String name;
	private String tel;
	
	public Client() {
		super();
	}

	public Client(String id, String name, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
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
	
	// 고객 정보 출력
	public void clientInfo() {
		
	}
	
}
