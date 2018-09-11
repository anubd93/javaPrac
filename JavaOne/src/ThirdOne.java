import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class ThirdOne {
	static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		String myName;
		myName = new String("ABCDEF");
		prln("this is our new method: ");
		prln(myName);
		prln("legth: " + myName.length());
		
		int[][] twoDArray = new int[2][4];
		twoDArray[0][0]= 1;
		twoDArray[0][1]= 2;
		twoDArray[0][2]= 3;
		twoDArray[0][3]= 4;
		
		twoDArray[1][0]= 5;
		twoDArray[1][1]= 6;
		twoDArray[1][2]= 7;
		twoDArray[1][3]= 8;
		
		twoDArray[1][2]+=(twoDArray[0][2]+twoDArray[0][3]);
		
//		Scanner test = new Scanner(System.in);
		
		String newName= myScanner.nextLine();
		
//		if (newName.length()>10) {
//			prln("name is too long");
//		} else {
//			prln("ok");
//		}
		prln("at 2d array[1][2]: "+ twoDArray[1][2]);
//		1 2 3 4
//		5 6 7 8
		
		switch (newName.length()) {
		case 4:
			prln("small");
			break;
		case 12:
			prln("long");
			break;
			
		case 17:
			prln("too long");	
			break;

		default:
			prln("okay");
			break;
		}
		
		
	}
	
	static void prln(Object anyObject) {
		System.out.println(anyObject);
	}
	static void pr(Object anyObject) {
		System.out.print(anyObject);
	}

}
