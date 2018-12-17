package BikeShop;

public class BikeShopee {
		public static void main(String[] args) {
		
			System.out.println(" Welcome to Bike Shop\n");
					
            //BikeShopee b1 = new BikeShopee();
            
            MountainBike m1 = new MountainBike ("Peak-x3", "Green", 2500);
            MountainBike m2 = new MountainBike ("Bounce-A2Z", "Orange", 3000);
            
            TandemBike t1 = new TandemBike ("2PWR", "Green", 800);
            TandemBike t2 = new TandemBike ("2PWR", "Red", 800);
            
            System.out.println("Moutain Bike: " + m1.name + " " + m1.color + " " + m1.price);
            System.out.println("Moutain Bike: " + m2.name + " " + m2.color + " " + m1.price);
            System.out.println("\nTandem Bike: " + t1.name + " " + t1.color + " " + t1.price);
            System.out.println("Tandem Bike: " +t2.name + " " + t2.color +" " + t2.price);
            
	}
	
}
