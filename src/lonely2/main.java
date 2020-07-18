package lonely2;

public class main {

	public static void main(String[] args) {

		bank arr[] = { new bank(50000, "김형준", "111-11-111") }; // 배열생성

		for (int i = 0; i < arr.length; i++) { // for문으로 출력
			System.out.println("이름" + arr[i].name);
			System.out.println("계좌번호:" + arr[i].accountnum);
			System.out.println("잔액" + arr[i].balance);
			arr[i].deposit(0000);
			arr[i].wihtdraw(50000);
		}
	}

}
