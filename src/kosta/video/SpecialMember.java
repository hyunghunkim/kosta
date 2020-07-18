package kosta.video;

public class SpecialMember extends IdInfo {
	private String id;
	private int bonusPoint;
	
	public SpecialMember(){}
	
	

	public SpecialMember(String id, String name, String ad, int bonusPoint) {
		super(id, name, ad);
		this.bonusPoint = bonusPoint;
	}
	
//	public void print(){
//		super.ptintMember();
//			System.out.println("회원의 보너스 포인터 적립:"+bonusPoint);
//		}//오버라이딩위해 주석처리

	@Override
	public void ptintMember() {		
		super.ptintMember();
		System.out.println("회원의 보너스 포인터 적립:"+bonusPoint);
	}
	

}
