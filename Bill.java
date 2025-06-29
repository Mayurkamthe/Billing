package Billing;

public class Bill {
	private Customer customer;
	private int count = 0;
	private OrderItem Order1;
	private OrderItem Order2;
	private OrderItem Order3;
	private OrderItem Order4;
	private OrderItem Order5;

	public Bill(Customer customer) {
		this.customer = customer;
	}


	public Customer getCustomer() {
		return customer;
	}

	public OrderItem getOrder1() {
		return Order1;
	}

	public OrderItem getOrder2() {
		return Order2;
	}

	public OrderItem getOrder3() {
		return Order3;
	}

	public OrderItem getOrder4() {
		return Order4;
	}

	public OrderItem getOrder5() {
		return Order5;
	}

	public void addOrder(OrderItem order) {
		count++;
		if (count == 1) {
			order = Order1;
		} else if (count == 2) {
			order = Order2;

		} else if (count == 2) {
			order = Order2;

		} else if (count == 3) {
			order = Order3;

		} else if (count == 4) {
			order = Order4;

		} else if (count == 5) {
			order = Order5;

		}

		else {
			System.out.println("Only 5 order are allowed");
		}

	}

}
