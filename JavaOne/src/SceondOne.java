import java.util.Scanner;

import javax.swing.table.TableStringConverter;

public class SceondOne {
	
	static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		short firstShortNumber;
		int secIntNumber;
		
		firstShortNumber = 10;
//		secIntNumber = 20;
		float myFloatNumber = 10;
		
		int[] cards = {1,2,3,4,345 };
		
		float result = myFloatNumber/3;
		boolean statemen;
		System.out.println("give a number to multiply \n");
		secIntNumber = myScanner.nextInt();
		int multiple = test(secIntNumber);
		
		System.out.println(firstShortNumber);
		System.out.println(secIntNumber);
		System.out.println(result);
		System.out.println(multiple);
		System.out.println(cards[4]);
	}
	
	static public int test(int firstValue) {
		int answer = firstValue*100;
		return answer;
	}

}
