package Sixth;

import Fifth.*;

public class ClassTwo {
	public static void main(String[] args) {
		SubCarClass anotherSubCar = new SubCarClass("Gixer", "bike", "gix", 160, 15, 2016, 12, "gray");
		CarClass aNewCar = new CarClass("FZ", "fz-5", "fz", 160, 15, 2017);
		 
		System.out.println("===new car by call method=== \n");
		
		SubCarTwo subCarClassTwo = new SubCarTwo("Kawasaki", "Kaw", "kaw", 150, 12, 2017);
		
		anotherSubCar.manufactureName = "Benz";
		
		anotherSubCar.showInfo();
		aNewCar.showInfo();
		
		System.out.println("===interface car=== \n");
		
		subCarClassTwo.showInfo();
		
		subCarClassTwo.addFuleAmout(12);
		System.out.println("\nFuel: "+subCarClassTwo.presentAmountofFuel());
		subCarClassTwo.getCarModelName();
		System.out.println("\nModel: "+subCarClassTwo.getModelName());
		subCarClassTwo.getManufactureYear();
		System.out.println("Year: "+subCarClassTwo.getManufactureYear());;
		
	}

}
