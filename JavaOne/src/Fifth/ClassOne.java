package Fifth;

public class ClassOne {
	
	private int aNumber = 12;
	static private CarClass ourCar = new CarClass();
	static private CarClass ourAnotherCar; 

	public static void main(String[] args) {
		ourAnotherCar = new CarClass("BMW", "7-series", "abcd", 2000, 30);
		System.out.println("Manufacturer: "+ourAnotherCar.manufactureName);
		System.out.println("Model: "+ourAnotherCar.getModelName());
		System.out.println("Engine CC: "+ourAnotherCar.engineCC);
		System.out.println("Key Match: "+ourAnotherCar.matchPass("abcd"));
		System.out.println("Manufacturer: "+ourAnotherCar.presentAmountofFuel());
	
		System.out.println("Secoud Car Engine CC: "+ourAnotherCar.engineCC);
		
		System.out.println("Amount of Fuel: "+ourAnotherCar.presentAmountofFuel());
		ourAnotherCar.addFuel(2);
		System.out.println("Amount of Fuel after adding: "+ourAnotherCar.presentAmountofFuel());
		ourAnotherCar.runForSec(60);
		System.out.println("Amount of Fuel after driving : "+ourAnotherCar.presentAmountofFuel());
	}

}
