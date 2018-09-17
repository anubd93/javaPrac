import java.util.Scanner;

public class PascalTriangle {
	static Scanner myScanner = new Scanner(System.in);
	public static void main(String[] args) {
		prln("give -1 to exit");
		prln("give the length of pascal's triangle's length");
		int userInput = myScanner.nextInt();
		while (userInput!=-1) {
			if (userInput<-1||userInput>20) {
				prln("please a valid number");
				userInput = myScanner.nextInt();
				continue;
			}
			printPascal(userInput);
			prln("\n\n");
			userInput = myScanner.nextInt();
			continue;
		}
	}
	
	static void printPascal(int length) {
		int[][] pascal = new int[length][length];
		for (int i = 0; i < length; i++) {
			pascal[0][i]=1;
			pascal[i][0]=1;
		}
		for (int row = 1; row < length; row++) {
			for (int col = 1; col < length-row; col++) {
				pascal[row][col] = pascal[row][col-1]+pascal[row-1][col];
				
			}
		}
		for (int row = 0; row < length; row++) {
			for (int col =0; col < length-row; col++) {
				pr(pascal[row][col]+ "\t");
				
			}
			prln("\n");
		}
	}
	
	static void prln(Object anyObject) {
		System.out.println(anyObject);
	}
	static void pr(Object anyObject) {
		System.out.print(anyObject);
	}

}
