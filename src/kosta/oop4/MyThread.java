package kosta.oop4;

public class MyThread implements Runnable {  //러너블이라는 인터페이스를 이용해서 다중작업을 할수있다.

	@Override  //러너블의 추상메서드
	public void run() {
		for (int i = 0; i < 11; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		Thread t = new Thread(thread);
		t.start();
		
		for (int i = 11; i < 21; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

}
