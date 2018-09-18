package Sixth;

import Fifth.*;

public class SubCarTwo extends CarClass implements CarInterface{
	public SubCarTwo(){
		super();
		
	}
	
	public SubCarTwo(String carName) {
		super(carName);
	}
	
	public SubCarTwo(String manu, String model, String key, int engineCC, float fuel) {
		super(manu, model, key, engineCC, fuel);
	}
	
	public SubCarTwo(String manu, String model, String key, int engineCC, float fuel, int year) {
		super(manu, model, key, engineCC, fuel, year);
	}
	
	@Override
	public void driveCar(int driveTime) {
		runForSec(driveTime);
	}

	@Override
	public void addFuleAmout(int amout) {
		addFuel(amout);
	}

	@Override
	public int getManufactureYear() {
		
		return manufactureYear;
	}

	@Override
	public String getCarModelName() {
		
		return getModelName();
	}
}
