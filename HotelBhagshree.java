package Billing;

import java.util.*;

public class HotelBhagshree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MenuItem Item1 = new MenuItem(1, "Special mutton ", 300);
		MenuItem Item2 = new MenuItem(2, "Special Chiken ", 220);
		MenuItem Item3 = new MenuItem(3, "roti", 15);
		MenuItem Item4 = new MenuItem(4, "bhakri ", 20);
		MenuItem Item5 = new MenuItem(5, "jira rice", 70);
		MenuItem Item6 = new MenuItem(6, "Malsala panerr", 220);
		MenuItem Item7 = new MenuItem(7, "Special kaju paneer ", 280);
		MenuItem Item8 = new MenuItem(8, "Pani Bottel ", 20);

		System.out.println("Enter customer name");
		String name = sc.nextLine();
		System.out.println("Enter Table NO");
		int table = sc.nextInt();
		Customer customer = new Customer(name, table);
		Bill bill = new Bill(customer);
		char ch = 0;
		do {
			System.out.println("-----------Menu-----------");
			System.out.println("1." + Item1.getName() + "Rs" + Item1.getprice());
			System.out.println("2." + Item2.getName() + "Rs" + Item2.getprice());
			System.out.println("3." + Item3.getName() + "Rs" + Item3.getprice());
			System.out.println("4." + Item4.getName() + "Rs" + Item4.getprice());
			System.out.println("5." + Item5.getName() + "Rs" + Item5.getprice());
			System.out.println("6." + Item6.getName() + "Rs" + Item6.getprice());
			System.out.println("7." + Item7.getName() + "Rs" + Item7.getprice());
			System.out.println("8." + Item8.getName() + "Rs" + Item8.getprice());

			System.out.println("Enter the Id");
			int id = sc.nextInt();
			System.out.println("Enter the qty");
			int qty = sc.nextInt();
			MenuItem Select = null;
			switch (id) {
			case 1:
				Select = Item1;
				break;
			case 2:
				Select = Item2;
				break;

			case 3:
				Select = Item3;
				break;

			case 4:
				Select = Item4;
				break;

			case 5:
				Select = Item5;
				break;
			case 6:
				Select = Item6;
				break;
			case 7:
				Select = Item7;
				break;
			case 8:
				Select = Item8;
				break;
			default:
				System.out.println("Enter validet option");
				break;
			}
			if (Select!=null) {
				OrderItem order= new OrderItem(Select,qty);
				bill.addOrder(order);
				
				System.out.println("add more item(y/n)");
				ch = sc.next().charAt(0);
				
					
			}
		} while (ch =='y');
		BIllPrinter print=new BIllPrinter();
		print.PrintBill(bill);
		sc.close();

	}

}
