package Billing;

public class Customer {
	private String name;
	private int TableNo;

	public Customer(String name, int tableNo) {
		this.name = name;
		this.TableNo = tableNo;
	}

	public String getName() {
		return name;
	}

	public int getTableNo() {
		return TableNo;
	}

}
