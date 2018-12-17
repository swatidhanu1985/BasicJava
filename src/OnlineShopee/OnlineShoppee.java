package OnlineShopee;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Vegetable {
	String name; 
	Double qty;
	Double price_qty;
	Double price_total;
		
	public Vegetable(String vName, Double vPrice_qty) {
		name = vName;
		price_qty = vPrice_qty;
		}

}
public class OnlineShoppee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] vegetableList = {"Cheese", "Pepperoni", "Potato", "Onion", "Tomato", "Carrot"};
		Double[] vegetablePricePerUnit = {15.00, 34.00, 10.00, 8.00, 20.00, 5.00};
		ArrayList<Vegetable> groceries = new ArrayList<Vegetable>();
		
		System.out.println("                                        Willi:s Online Shopping");
		Date date = new Date();
		System.out.println(                                          date);
	
		
		for (int i = 0; i < vegetableList.length; i++) {
			groceries.add(new Vegetable(vegetableList[i], vegetablePricePerUnit[i]));
		}
		
		Scanner sub = new Scanner(System.in);
		
		for (int i = 0; i < vegetableList.length; i++) {
			System.out.print("\n Enter Quntity of " + ((Vegetable)groceries.get(i)).name + ":");
			
			((Vegetable)groceries.get(i)).qty = sub.nextDouble();
			((Vegetable)groceries.get(i)).price_total = ((Vegetable)groceries.get(i)).price_qty * ((Vegetable)groceries.get(i)).qty;
			
			System.out.println("Vegetables Name:" + ((Vegetable)groceries.get(i)).name + "  Quantity:" + ((Vegetable)groceries.get(i)).qty + 
					" kg" + " " + ((Vegetable)groceries.get(i)).price_total ); 
		}
		sub.close();
		Double total = 0.0;
		
		for (int i = 0; i < vegetableList.length; i++) {
			total = total + ((Vegetable)groceries.get(i)).price_total;
		}
		
		for (int i = 0; i < vegetableList.length; i++) {
			total = total + ((Vegetable)groceries.get(i)).price_total;
		}
		System.out.println("\n\n Total vegetables price:"  + total);
	}

}

