package Billing;

public class BIllPrinter {
	double Total = 0;

	public void PrintBill(Bill bill) {
		System.out.println("\n ---------Final Bill----------");
		System.out.println("Customer : " + bill.getCustomer().getName());
		System.out.println("Table NO : " + bill.getCustomer().getTableNo());
		System.out.println("%-20s %-10s  %-10s \n" + "Item" + "Qty" + "Amount");
		if (bill.getOrder1() != null) {
			Total += printItem(bill.getOrder1());
		}
		if (bill.getOrder2() != null) {
			Total += printItem(bill.getOrder2());
		}
		if (bill.getOrder3() != null) {
			Total += printItem(bill.getOrder3());
		}

		if (bill.getOrder4() != null) {
			Total += printItem(bill.getOrder4());
		}
		if (bill.getOrder5() != null) {
			Total += printItem(bill.getOrder5());
		}
		double gst= Total*0.5;
		double PayableAmt= Total+gst;
		System.out.println("total rs:"+Total);
		System.out.println("GST (5%) rs:"+gst );
		System.out.println("Payable Amt rs" + PayableAmt);
		
		
	}

	private double printItem(OrderItem order) {
		double amount = order.getTotalprice();
		System.out.println("%-20s %-10d  Rs %-10.2f \n " + order.getItem().getName() + order.getQuantity() + amount);
		return amount;

	}

}
