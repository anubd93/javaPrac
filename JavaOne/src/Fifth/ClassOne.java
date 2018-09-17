package Fifth;

public class ClassOne {
	
	private int aNumber = 12;
	static private CarClass ourCar = new CarClass();
	static private CarClass ourAnotherCar; 

	public static void main(String[] args) {
		
		CarClass thirdCar = new CarClass("toyota", "primeo", "xyz", 1800, 28);
		SubCarClass ourSubCar = new SubCarClass("Nissan", "Sunny", "pqr", 1700, 26, 10, "Gray");
		
		ourAnotherCar = new CarClass("BMW", "7-series", "abcd", 2000, 30);
		System.out.println("Manufacturer: "+ourAnotherCar.manufactureName);
		System.out.println("Model: "+ourAnotherCar.getModelName());
		System.out.println("Engine CC: "+ourAnotherCar.engineCC);
		System.out.println("Key Match: "+ourAnotherCar.matchPass("abcd"));
//		System.out.println("Manufacturer: "+ourAnotherCar.presentAmountofFuel());
	
		System.out.println("Secoud Car Engine CC: "+ourAnotherCar.engineCC);
		
		System.out.println("Amount of Fuel: "+ourAnotherCar.presentAmountofFuel());
		ourAnotherCar.addFuel(2);
		System.out.println("Amount of Fuel after adding: "+ourAnotherCar.presentAmountofFuel());
		ourAnotherCar.runForSec(60);
		System.out.println("Amount of Fuel after driving : "+ourAnotherCar.presentAmountofFuel());
		
		System.out.println("====Third Car Property====");
		
		System.out.println("Manufacturer: "+thirdCar.manufactureName);
		System.out.println("Model: "+thirdCar.getModelName());
		System.out.println("Engine CC: "+thirdCar.engineCC);
		System.out.println("Key Match: "+thirdCar.matchPass("abcd"));
//		System.out.println("Manufacturer: "+thirdCar.presentAmountofFuel());
	
		System.out.println("Secoud Car Engine CC: "+thirdCar.engineCC);
		
		System.out.println("Amount of Fuel: "+thirdCar.presentAmountofFuel());
		thirdCar.addFuel(6);
		System.out.println("Amount of Fuel after adding: "+thirdCar.presentAmountofFuel());
		thirdCar.runForSec(180);
		System.out.println("Amount of Fuel after driving : "+thirdCar.presentAmountofFuel());
		
		System.out.println("=====Sub Car Property=====");
		
		System.out.println("Manufacturer: "+ourSubCar.manufactureName);
		System.out.println("Model: "+ourSubCar.getModelName());
		System.out.println("Engine CC: "+ourSubCar.engineCC);
		System.out.println("Key Match: "+ourSubCar.matchPass("abcd"));
//		System.out.println("Manufacturer: "+ourSubCar.presentAmountofFuel());
	
		System.out.println("Secoud Car Engine CC: "+ourSubCar.engineCC);
		
		System.out.println("Amount of Fuel: "+ourSubCar.presentAmountofFuel());
		ourSubCar.addFuel(10);
		System.out.println("Amount of Fuel after adding: "+ourSubCar.presentAmountofFuel());
		ourSubCar.runForSec(120);
		System.out.println("Amount of Fuel after driving : "+ourSubCar.presentAmountofFuel());
		System.out.println("Charge In Battery: "+ourSubCar.getChargeInBattery());
		System.out.println("Sub Car Color: "+ourSubCar.getColor());
		
	}

}
