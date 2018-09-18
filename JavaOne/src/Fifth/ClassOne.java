package Fifth;

public class ClassOne {
	
	private int aNumber = 12;
	static private CarClass ourCar = new CarClass();
	static private CarClass ourAnotherCar; 

	public static void main(String[] args) {
		
		CarClass thirdCar = new CarClass("toyota", "primeo", "xyz", 1800, 28);
		SubCarClass ourSubCar = new SubCarClass("Nissan", "Sunny", "pqr", 1700, 26, 10, "Gray");
		
		ourAnotherCar = new CarClass("BMW", "7-series", "abcd", 2000, 30);
		
		ourAnotherCar.showInfo();
		
		System.out.println("====Third Car Property====");
		
		thirdCar.showInfo();
		
		System.out.println("=====Sub Car Property=====");
		
		ourSubCar.showInfo();
		
		
	}

}
