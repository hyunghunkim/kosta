package kosta.bank;

public class MyBank {
	private Customer[] customers;
	private int customersNum;
	
	public MyBank() {
		customers = new Customer[10];
	}
	
	public void addCustomer(String id, String name, long balance) {
		// Customer객체 생성후 배열에 추가
		customers[customersNum++] = new Customer(id, name, balance);		
	}

	public Customer getCustomer(String id) {
		// 아이대에 해당하는 Customer객체 구하기
		Customer cust = null;
		for(int i=0;i<customersNum;i++) {
			if(customers[i].getId().equals(id)) {
				cust = customers[i];
				break;
			}
		}
		
		return cust;
	}

	public Customer[] getAllCustomers() {
		Customer newCustomers[] = new Customer[customersNum];
		
		System.arraycopy(customers, 0, newCustomers, 0, customersNum);
		
		return newCustomers;
	}
	
	
}






