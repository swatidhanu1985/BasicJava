package OnlineShopee;

import java.util.Date;
import java.util.Scanner;

class Vegetables {
	String name; 
	Double qty;
	Double price_qty;
	Double price_total;
	
		
	public Vegetables(String vName, Double vPrice_qty) {
		name = vName;
		price_qty = vPrice_qty;
		// qty = vQty; 
		}

}
public class shop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("   Willi:s Online Shopping");
		Date date = new Date();
		System.out.println(date);
		System.out.println("   ************************   ");
	
		Vegetables v1 = new Vegetables("Tomato", 15.00 );
		Vegetables v2 = new Vegetables("Capsicum", 34.00);
		Vegetables v3 = new Vegetables("Carrot", 12.00);
		Vegetables v4 = new Vegetables("Onion", 9.00);
		Vegetables v5 = new Vegetables("Potato", 7.50);
		Vegetables f1 = new Vegetables("Apple", 34.00);
		Vegetables f2 = new Vegetables("Banana", 20.00);
		Vegetables m1 = new Vegetables("Milk", 10.00);
		Vegetables v6 = new Vegetables("Cheese", 50.00);
		Vegetables j1 = new Vegetables("Juice", 20.00);
		
		
		Scanner sub = new Scanner(System.in);
		 
		System.out.print("\nEnter Quntity of Tomato (in kg) = ");
		v1.qty = sub.nextDouble();
		v1.price_total = v1.price_qty * v1.qty;
			
		System.out.print("Enter Quntity of Capsicum (in kg) = ");
		v2.qty = sub.nextDouble();
		v2.price_total = v2.price_qty * v2.qty;
		
		System.out.print("Enter Quntity of Carrot (in kg) = ");
		v3.qty = sub.nextDouble();
		v3.price_total = v3.price_qty * v3.qty;
		
		System.out.print("Enter Quntity of Onion (in kg) = ");
		v4.qty = sub.nextDouble();
		v4.price_total = v4.price_qty * v4.qty;

		System.out.print("Enter Quntity of Potato (in kg) = ");
		v5.qty = sub.nextDouble();
		v5.price_total = v5.price_qty * v5.qty;
		
		System.out.print("Enter Quntity of Apple (in kg) = ");
		f1.qty = sub.nextDouble();
		f1.price_total = f1.price_qty * f1.qty;
		
		System.out.print("Enter Quntity of Banana (in kg) = ");
		f2.qty = sub.nextDouble();
		f2.price_total = f2.price_qty * f2.qty;
		
		System.out.print("Enter Quntity of Milk (Packets) = ");
		m1.qty = sub.nextDouble();
		m1.price_total = m1.price_qty * m1.qty;
		
		System.out.print("Enter Quntity of Cheese (in kg) = ");
		v6.qty = sub.nextDouble();
		v6.price_total = v6.price_qty * v6.qty;
		
		System.out.print("Enter Quntity of Juice (Packets) = ");
		j1.qty = sub.nextDouble();
		j1.price_total = j1.price_qty * j1.qty;
		
		Double total = v1.price_total + v2.price_total + v3.price_total + v4.price_total + v5.price_total + f1.price_total + f2.price_total 
				+ m1.price_total + v6.price_total + j1.price_total;
		
		sub.close();
		 
		 
		System.out.println("\n\nGroceries Name " + "\t\tQuantity " + "\tPrice");
		System.out.println(v1.name + "\t\t\t "   + v1.qty + "\t\t" + v1.price_total); 
		System.out.println(v2.name + "\t\t "   + v2.qty + "\t\t" + v2.price_total);
		System.out.println(v3.name + "\t\t\t "   + v3.qty + "\t\t" + v3.price_total);
		System.out.println(v4.name + "\t\t\t "   + v4.qty + "\t\t" + v4.price_total);
		System.out.println(v5.name + "\t\t\t "   + v5.qty + "\t\t" + v5.price_total);
		System.out.println(f1.name + "\t\t\t "   + f1.qty + "\t\t" + f1.price_total);
		System.out.println(f2.name + "\t\t\t "   + f2.qty + "\t\t" + f2.price_total);
		System.out.println(m1.name + "\t\t\t "   + m1.qty + "\t\t" + m1.price_total);
		System.out.println(v6.name + "\t\t\t "   + v6.qty + "\t\t" + v6.price_total);
		System.out.println(j1.name + "\t\t\t "   + j1.qty + "\t\t" + j1.price_total);
		
		System.out.println("\n\nTotal Groceries price: "  + total);
	}

}
