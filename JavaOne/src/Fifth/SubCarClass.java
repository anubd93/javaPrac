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

	public float getChargeInBattery() {
		return chargeInBattery;
	}

	public void setChargeInBattery(float chargeInBattery) {
		this.chargeInBattery = chargeInBattery;
	}

	public String getColor() {
		return color;
	}
}
