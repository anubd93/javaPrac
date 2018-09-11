
public class FourthOne {

	public static void main(String[] args) {
		int a,b;
		a=10;
		b=20;
		prln(calculateNumber(a, b));
		prln(a<b? "A is less then B":"B is less then A");
		prln(compare(a, b)); 
	}
	
	static String compare(int a, int b) {
		if (a<b) {
			return "A is less then B";
		}else {
			return "B is less then A";
		}
	}
	
	static int calculateNumber(int number1, int number2) {
		int result = number1+number2;
		return result;
	}
	
	static void prln(Object anyObject) {
		System.out.println(anyObject);
	}
	static void pr(Object anyObject) {
		System.out.print(anyObject);
	}

}
