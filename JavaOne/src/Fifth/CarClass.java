package Fifth;

public class CarClass {
	public String manufactureName;
	private String modelName;
	private String carKeyValue;
	public int engineCC;
	private  float fuelAmount;
	final private float amountofFuelUsedPerSec = 0.02f;
	
	public CarClass() {
		manufactureName = new String();
		modelName = new String();
		engineCC = 1200;
		fuelAmount = 0;
	}
	
	public CarClass(String carName) {
		manufactureName = new String(carName);
		modelName = new String();
		engineCC = 0;
		fuelAmount = 0;
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
}