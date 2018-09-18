package Sixth;

import Fifth.*;

public class SubCarTwo extends CarClass implements CarInterface{
	public SubCarTwo(){
		super();
		manufactureName = "something";
		manufactureYear = 1234;
	}

	@Override
	public void driveCar(int driveTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFuleAmout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getManufactureYear() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCarModelName() {
		// TODO Auto-generated method stub
		return null;
	}
}
