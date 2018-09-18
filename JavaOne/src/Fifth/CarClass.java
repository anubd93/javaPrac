package Fifth;

public class CarClass {
	public String manufactureName;
	private String modelName;
	private String carKeyValue;
	public int engineCC;
	private  float fuelAmount;
	final private float amountofFuelUsedPerSec = 0.02f;
	
	protected int manufactureYear;
	
	public CarClass() {
		manufactureName = new String();
		modelName = new String();
		engineCC = 1200;
		fuelAmount = 0;
		manufactureYear = 0;
	}
	
	public CarClass(String carName) {
		manufactureName = new String(carName);
		modelName = new String();
		engineCC = 0;
		fuelAmount = 0;
		manufactureYear = 0;
	}
	
	public float presentAmountofFuel() {
		return fuelAmount; 
	}
	
	public String getManufactureName() {
		return manufactureName; 
	}
	
	public CarClass(String manu, String model, String key, int engineCC, float fuel) {
		manufactureName = manu;
		modelName = model;
		carKeyValue = key;
		fuelAmount = fuel;
		this.engineCC = engineCC;
		manufactureYear = 0;
	}
	
	public CarClass(String manu, String model, String key, int engineCC, float fuel, int year) {
		this(manu, model, key, engineCC, fuel);
		manufactureYear = year; 
	}
	
	public String getModelName() {
		return modelName; 
	}
	
	public boolean matchPass(String userInput) {
		return userInput.equals(carKeyValue); 
	}
	
	public void addFuel(float fuelAmout) {
		this.fuelAmount+=fuelAmout;
	}
	
	public void runForSec(int timeInSec) {
		float usedFuel=timeInSec*amountofFuelUsedPerSec;
		fuelAmount-=usedFuel;
	}
	
	public void showInfo() {
		System.out.println("Manufacturer: "+manufactureName);
		System.out.println("Model: "+getModelName());
		System.out.println("Engine CC: "+engineCC);
		System.out.println("Key Match: "+matchPass("abcd"));
		System.out.println("Secoud Car Engine CC: "+engineCC);
		
		System.out.println("Amount of Fuel: "+presentAmountofFuel());
		addFuel(10);
		System.out.println("Amount of Fuel after adding: "+presentAmountofFuel());
		runForSec(120);
		System.out.println("Amount of Fuel after driving : "+presentAmountofFuel());
		
	}
	
}