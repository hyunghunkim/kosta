package kosta.oop;

public class Rectangle {
	//가로,세로,면적
	
	//면적구하기
	
	//면적출력
	
	int x;
	int y;
	int z;
	
	public Rectangle(){}
	

		
	public Rectangle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void area(){
		z=x*y;
	}
	
	public void print(){
		System.out.println("면적 : "+z);
	}
	

}
