package Billing;

public class OrderItem{
	private MenuItem Item;
	private int quantity;

	public OrderItem(MenuItem Item, int quantaty) {
		this.Item = Item;
		this.quantity = getQuantity();

	}

	public MenuItem getItem() {
		return Item;
	}

	public int getQuantity() {
		return quantity;
	}
	public double getTotalprice() {
		return Item.getprice()*quantity;
		
	}
}
