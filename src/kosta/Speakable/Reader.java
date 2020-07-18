package kosta.Speakable;

public class Reader extends Man implements Speakable {
	
	public Reader(){}
	
	public Reader(String name){
		super(name);
	}

	@Override
	public String speak() {
		return getName()+"자바파이팅";
		
	}
}
