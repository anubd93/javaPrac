package Fifth;

public class SubCarClass extends CarClass{
	
	private float chargeInBattery;
	private String color;
	
	public SubCarClass() {
		super();
	}
	
	public SubCarClass(String manu, String model, String key, int cc, float fuel, float charge, String carColor) {
		super(manu, model, key, cc, fuel);
		chargeInBattery = charge;
		color = carColor;
	}

	public SubCarClass(String manu, String model, String key, int cc, float fuel, int year, float charge, String carColor) {
		super(manu, model, key, cc, fuel, year);
		manufactureName = "TEST";
		manufactureYear = 1234;
		engineCC = 1212;
		chargeInBattery = charge;
		color = carColor;
	}
	
	public float getChargeInBattery() {
		return chargeInBattery;
	}

	public void setChargeInBattery(float chargeInBattery) {
		this.chargeInBattery = chargeInBattery;
	}

	public String getColor() {
		return color;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("\n\n");
		addFuel(10);
		System.out.println("Amount of Fuel after adding: "+presentAmountofFuel());
		runForSec(120);
		System.out.println("Amount of Fuel after driving : "+presentAmountofFuel());
		System.out.println("Charge In Battery: "+getChargeInBattery());
		System.out.println("Sub Car Color: "+getColor());
		
	}
}
