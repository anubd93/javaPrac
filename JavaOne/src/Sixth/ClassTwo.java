package Sixth;

import Fifth.*;

public class ClassTwo {
	public static void main(String[] args) {
		SubCarClass anotherSubCar = new SubCarClass("Gixer", "bike", "gix", 160, 15, 2016, 12, "gray");
		CarClass aNewCar = new CarClass("FZ", "fz-5", "fz", 160, 15, 2017);
		
		 
		System.out.println("===new car by call method=== \n");
		
		anotherSubCar.manufactureName = "Benz";
		
		anotherSubCar.showInfo();
		aNewCar.showInfo();
		
	}

}
